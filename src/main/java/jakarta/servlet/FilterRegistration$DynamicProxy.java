package jakarta.servlet;
public class FilterRegistration$DynamicProxy  implements FilterRegistration.Dynamic {
  public final javax.servlet.FilterRegistration.Dynamic impl;
  public FilterRegistration$DynamicProxy(javax.servlet.FilterRegistration.Dynamic impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void addMappingForServletNames(java.util.EnumSet p0,boolean p1, String[] p2) {
  impl.addMappingForServletNames( p0, p1, p2);
 }
@lombok.SneakyThrows
 public java.util.Collection getServletNameMappings() {
  return  impl.getServletNameMappings();
 }
@lombok.SneakyThrows
 public void addMappingForUrlPatterns(java.util.EnumSet p0,boolean p1, String[] p2) {
  impl.addMappingForUrlPatterns( p0, p1, p2);
 }
@lombok.SneakyThrows
 public java.util.Collection getUrlPatternMappings() {
  return  impl.getUrlPatternMappings();
 }
@lombok.SneakyThrows
 public String getInitParameter( String p0) {
  return  impl.getInitParameter( p0);
 }
@lombok.SneakyThrows
 public boolean setInitParameter( String p0, String p1) {
  return  impl.setInitParameter( p0, p1);
 }
@lombok.SneakyThrows
 public java.util.Map getInitParameters() {
  return  impl.getInitParameters();
 }
@lombok.SneakyThrows
 public java.util.Set setInitParameters(java.util.Map p0) {
  return  impl.setInitParameters( p0);
 }
@lombok.SneakyThrows
 public String getName() {
  return  impl.getName();
 }
@lombok.SneakyThrows
 public String getClassName() {
  return  impl.getClassName();
 }
@lombok.SneakyThrows
 public void setAsyncSupported(boolean p0) {
  impl.setAsyncSupported( p0);
 }
}
