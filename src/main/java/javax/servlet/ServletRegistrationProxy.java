package javax.servlet;
public class ServletRegistrationProxy  implements ServletRegistration {
  public final jakarta.servlet.ServletRegistration impl;
  public ServletRegistrationProxy(jakarta.servlet.ServletRegistration impl) { this.impl = impl; }
@lombok.SneakyThrows
 public String getRunAsRole() {
  return  impl.getRunAsRole();
 }
@lombok.SneakyThrows
 public java.util.Collection getMappings() {
  return  impl.getMappings();
 }
@lombok.SneakyThrows
 public java.util.Set addMapping( String[] p0) {
  return  impl.addMapping( p0);
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
}
