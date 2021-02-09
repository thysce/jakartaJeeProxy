package javax.servlet;

import jakarta.servlet.MultipartConfigElementProxy;
import jakarta.servlet.ServletSecurityElementProxy;

public class ServletRegistration$DynamicProxy  implements ServletRegistration.Dynamic {
  public final jakarta.servlet.ServletRegistration.Dynamic impl;
  public ServletRegistration$DynamicProxy(jakarta.servlet.ServletRegistration.Dynamic impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void setMultipartConfig( MultipartConfigElement p0) {
  impl.setMultipartConfig( new MultipartConfigElementProxy(p0));
 }
@lombok.SneakyThrows
 public java.util.Set setServletSecurity( ServletSecurityElement p0) {
  return  impl.setServletSecurity( new ServletSecurityElementProxy(p0));
 }
@lombok.SneakyThrows
 public void setLoadOnStartup(int p0) {
  impl.setLoadOnStartup( p0);
 }
@lombok.SneakyThrows
 public void setRunAsRole( String p0) {
  impl.setRunAsRole( p0);
 }
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
@lombok.SneakyThrows
 public void setAsyncSupported(boolean p0) {
  impl.setAsyncSupported( p0);
 }
}
