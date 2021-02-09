package org.thysce.jakartajeeproxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( ElementType.TYPE )
@Retention( RetentionPolicy.SOURCE )
public @interface JakartaJeeProxy {

    String proxyFor();
    String proxyOf();

}
