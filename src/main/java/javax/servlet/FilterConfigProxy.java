package javax.servlet;
public class FilterConfigProxy  implements FilterConfig {
  public final jakarta.servlet.FilterConfig impl;
  public FilterConfigProxy(jakarta.servlet.FilterConfig impl) { this.impl = impl; }
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
@lombok.SneakyThrows
 public String getFilterName() {
  return  impl.getFilterName();
 }
}
