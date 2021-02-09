package org.thysce.jakartajeeproxy;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import lombok.SneakyThrows;

import com.google.auto.service.AutoService;

@AutoService( Processor.class )
@SupportedSourceVersion( SourceVersion.RELEASE_11 )
public class JakartaEeProxyProcessor extends AbstractProcessor {

    private final Set<Class<?>> alreadyDeclared = new HashSet<>();

    private static final List<String> IGNORED_METHOD_NAMES = List.of( "compareTo", "toString", "equals" );

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Set.of( JakartaJeeProxy.class.getName() );
    }

    @SneakyThrows
    @Override
    public boolean process( Set<? extends TypeElement> annotations, RoundEnvironment roundEnv ) {
        Set<? extends Element> proxyClasses = roundEnv.getElementsAnnotatedWith( JakartaJeeProxy.class );

        processingEnv.getMessager().printMessage( Diagnostic.Kind.NOTE, Arrays.toString( proxyClasses.toArray() ) );

        for ( Element e : proxyClasses ) {
            JakartaJeeProxy proxy = e.getAnnotation( JakartaJeeProxy.class );
            String proxyForName = proxy.proxyFor().replace( "$", "." );
            String proxyForSimple = getSimpleName( proxy.proxyFor() );
            String proxyOfName = proxy.proxyOf().replace( "$", "." );
            String proxyOfSimple = getSimpleName( proxy.proxyOf() );
            Class<?> proxyForClass = Class.forName( proxy.proxyFor() );

            JavaFileObject builderFile = processingEnv.getFiler().createSourceFile( proxy.proxyFor() + "Proxy" );
            try ( PrintWriter out = new PrintWriter( builderFile.openWriter() ) ) {
                out.println( "package " + proxy.proxyFor().substring( 0, proxy.proxyFor().lastIndexOf( "." ) ) + ";" );
                out.print( "public class " + proxyForSimple + "Proxy  " );
                if ( proxyForClass.isInterface() ) {
                    out.print( "implements " );
                    out.print( proxyForName );
                }
                else if ( proxyForClass.isEnum() ) {

                }
                else {
                    out.print( "extends " );
                    out.print( proxyForName );
                }
                out.println( " {" );
                out.println( "  public final " + proxyOfName + " impl;" );

                out.println( "  public " + proxyForSimple + "Proxy("
                        + proxyOfName + " impl" +
                        ") { this.impl = impl; }" );


                for ( Method m : proxyForClass.getMethods() ) {
                    if ( Modifier.isFinal( m.getModifiers() ) || Modifier.isStatic( m.getModifiers() ) ) {
                        continue;
                    }
                    if ( IGNORED_METHOD_NAMES.contains( m.getName() ) ) {
                        continue;
                    }
                    boolean arrayReturn = m.getReturnType().isArray();
                    Class<?> returnSimpleType;
                    if ( arrayReturn ) {
                        returnSimpleType = m.getReturnType().getComponentType();
                    }
                    else {
                        returnSimpleType = m.getReturnType();
                    }
                    boolean eeReturn = isEeClassName( returnSimpleType.getName() );

                    if ( eeReturn ) {
                        writeProxyDeclaration( returnSimpleType );
                    }

                    out.println( "@lombok.SneakyThrows" );
                    out.print( " public " );
                    if ( arrayReturn ) {
                        out.print( returnSimpleType.getName() );
                        out.print( "[]" );
                    }
                    else {
                        out.print( returnSimpleType.getName().replace( "$", "." ) );
                    }
                    out.print( " " + m.getName() + "(" );
                    for ( int i = 0; i < m.getParameterCount(); i++ ) {
                        if ( i > 0 ) {
                            out.print( "," );
                        }
                        Class<?> paramType = m.getParameterTypes()[i];
                        if ( paramType.isArray() ) {
                            out.print( paramType.getComponentType().getName() + "[]" );
                        }
                        else {
                            out.print( paramType.getName() );
                        }

                        out.print( " p" + i );
                    }
                    out.println( ") {" );
                    if ( arrayReturn && eeReturn ) {
                        out.println( "  Object[] proxyResult = impl." + m.getName() + "();" );
                        out.println( "  " + returnSimpleType.getName() + "Proxy[] result = new "
                                + returnSimpleType.getName() + "Proxy[proxyResult.length];" );
                        out.print( "  System.arraycopy(proxyResult, 0, result, 0, proxyResult.length);" );
                        out.println( "  return result;" );
                    }
                    else {
                        if ( m.getReturnType() != void.class ) {
                            out.print( "  return" );
                        }
                        if ( m.getReturnType().isEnum() ) {
                            out.print( " " );
                            out.print( returnSimpleType.getName().replace( "$", "." ) );
                            out.print( ".valueOf(" );
                            out.print( "impl." );
                            out.print( m.getName() );
                            out.print( "().name()" );
                        }
                        else {
                            if ( eeReturn ) {
                                out.print( " new " + returnSimpleType.getName() + "Proxy (" );
                            }
                            out.print( "  impl." + m.getName() + "(" );
                            for ( int i = 0; i < m.getParameterCount(); i++ ) {
                                if ( i > 0 ) {
                                    out.print( "," );
                                }
                                Class<?> paramSimpleType;
                                if ( m.getParameterTypes()[i].isArray() ) {
                                    paramSimpleType = m.getParameterTypes()[i].getComponentType();
                                }
                                else {
                                    paramSimpleType = m.getParameterTypes()[i];
                                }
                                if ( isEeClassName( paramSimpleType.getName() ) ) {
                                    writeProxyDeclaration( getOtherClassName( paramSimpleType.getName() ) );
                                    out.print( " new " );
                                    out.print( getOtherClassName( paramSimpleType.getName() ) + "Proxy(p" + i + ")" );
                                }
                                else {
                                    out.print( " p" + i );
                                }
                            }
                            if ( eeReturn ) {
                                out.print( ")" );
                            }
                        }
                        out.println( ");" );
                    }

                    out.println( " }" );
                }

                out.println( "}" );
            }
        }

        return true;
    }

    @SneakyThrows
    private void writeProxyDeclaration( String proxyForClassName ) {
        Class<?> proxyFor = Class.forName( proxyForClassName );
        writeProxyDeclaration( proxyFor );
    }

    @SneakyThrows
    private void writeProxyDeclaration( Class<?> proxyFor ) {
        if ( alreadyDeclared.contains( proxyFor ) ) {
            return;
        }
        if ( proxyFor.isEnum() ) {
            return;
        }
        JavaFileObject subBuilderFile =
                processingEnv.getFiler().createSourceFile( proxyFor.getName() + "ProxyDeclaration" );
        try ( PrintWriter subOut = new PrintWriter( subBuilderFile.openWriter() ) ) {
            subOut.println( "package " + JakartaJeeProxy.class.getPackage().getName() + ";" );
            subOut.print( "@" + JakartaJeeProxy.class.getName() + "(proxyFor = \"" );
            subOut.print( proxyFor.getName() );
            subOut.print( "\", proxyOf=\"" );
            subOut.print( getOtherClassName( proxyFor.getName() ) );
            subOut.println( "\")" );
            subOut.println( "class "
                    + proxyFor.getName()
                    .replaceAll( "\\.", "_" )
                    .replaceAll( "\\$", "_" )
                    + "ProxyDeclaration{}" );
        }
        alreadyDeclared.add( proxyFor );
    }

    private String getSimpleName( String classname ) {
        return classname.substring( classname.lastIndexOf( "." ) + 1 );
    }

    private String getJakartaClassName( String classname ) {
        return classname.replace( "javax", "jakarta" );
    }

    private String getJavaxClassName( String classname ) {
        return classname.replace( "jakarta", "javax" );
    }

    private String getOtherClassName( String classname ) {
        if ( classname.startsWith( "javax" ) ) {
            return getJakartaClassName( classname );
        }
        else {
            return getJavaxClassName( classname );
        }
    }

    private boolean isJavaxClassName( String classname ) {
        return classname.startsWith( "javax" );
    }

    private boolean isJakartaClassName( String classname ) {
        return classname.startsWith( "jakarta" );
    }

    private boolean isEeClassName( String classname ) {
        return isJavaxClassName( classname ) || isJakartaClassName( classname );
    }
}
