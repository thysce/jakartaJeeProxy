package javax.servlet;
public class ServletConfigProxy  implements ServletConfig {
  public final jakarta.servlet.ServletConfig impl;
  public ServletConfigProxy(jakarta.servlet.ServletConfig impl) { this.impl = impl; }
@lombok.SneakyThrows
 public String getServletName() {
  return  impl.getServletName();
 }
@lombok.SneakyThrows
 public ServletContext getServletContext() {
  return new ServletContextProxy (  impl.getServletContext());
 }
@lombok.SneakyThrows
 public String getInitParameter( String p0) {
  return  impl.getInitParameter( p0);
 }
@lombok.SneakyThrows
 public java.util.Enumeration getInitParameterNames() {
  return  impl.getInitParameterNames();
 }
}
