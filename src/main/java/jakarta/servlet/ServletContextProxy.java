package jakarta.servlet;

import jakarta.servlet.descriptor.JspConfigDescriptorProxy;

public class ServletContextProxy  implements ServletContext {
  public final javax.servlet.ServletContext impl;
  public ServletContextProxy(javax.servlet.ServletContext impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Enumeration getAttributeNames() {
  return  impl.getAttributeNames();
 }
@lombok.SneakyThrows
 public RequestDispatcher getRequestDispatcher( String p0) {
  return new RequestDispatcherProxy (  impl.getRequestDispatcher( p0));
 }
@lombok.SneakyThrows
 public String getRealPath( String p0) {
  return  impl.getRealPath( p0);
 }
@lombok.SneakyThrows
 public String getContextPath() {
  return  impl.getContextPath();
 }
@lombok.SneakyThrows
 public String getMimeType( String p0) {
  return  impl.getMimeType( p0);
 }
@lombok.SneakyThrows
 public int getEffectiveMajorVersion() {
  return  impl.getEffectiveMajorVersion();
 }
@lombok.SneakyThrows
 public int getEffectiveMinorVersion() {
  return  impl.getEffectiveMinorVersion();
 }
@lombok.SneakyThrows
 public java.util.Set getResourcePaths( String p0) {
  return  impl.getResourcePaths( p0);
 }
@lombok.SneakyThrows
 public RequestDispatcher getNamedDispatcher( String p0) {
  return new RequestDispatcherProxy (  impl.getNamedDispatcher( p0));
 }
@lombok.SneakyThrows
 public Servlet getServlet( String p0) {
  return new ServletProxy (  impl.getServlet( p0));
 }
@lombok.SneakyThrows
 public java.util.Enumeration getServlets() {
  return  impl.getServlets();
 }
@lombok.SneakyThrows
 public java.util.Enumeration getServletNames() {
  return  impl.getServletNames();
 }
@lombok.SneakyThrows
 public String getServerInfo() {
  return  impl.getServerInfo();
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
 public boolean setInitParameter( String p0, String p1) {
  return  impl.setInitParameter( p0, p1);
 }
@lombok.SneakyThrows
 public String getServletContextName() {
  return  impl.getServletContextName();
 }
@lombok.SneakyThrows
 public ServletRegistration.Dynamic addServlet( String p0, Servlet p1) {
  return new ServletRegistration$DynamicProxy (  impl.addServlet( p0, new javax.servlet.ServletProxy(p1)));
 }
@lombok.SneakyThrows
 public ServletRegistration.Dynamic addServlet( String p0, Class p1) {
  return new ServletRegistration$DynamicProxy (  impl.addServlet( p0, p1));
 }
@lombok.SneakyThrows
 public ServletRegistration.Dynamic addServlet( String p0, String p1) {
  return new ServletRegistration$DynamicProxy (  impl.addServlet( p0, p1));
 }
@lombok.SneakyThrows
 public ServletRegistration.Dynamic addJspFile( String p0, String p1) {
  return new ServletRegistration$DynamicProxy (  impl.addJspFile( p0, p1));
 }
@lombok.SneakyThrows
 public Servlet createServlet( Class p0) {
  return new ServletProxy (  impl.createServlet( p0));
 }
@lombok.SneakyThrows
 public ServletRegistration getServletRegistration( String p0) {
  return new ServletRegistrationProxy (  impl.getServletRegistration( p0));
 }
@lombok.SneakyThrows
 public java.util.Map getServletRegistrations() {
  return  impl.getServletRegistrations();
 }
@lombok.SneakyThrows
 public FilterRegistration.Dynamic addFilter( String p0, Filter p1) {
  return new FilterRegistration$DynamicProxy (  impl.addFilter( p0, new javax.servlet.FilterProxy(p1)));
 }
@lombok.SneakyThrows
 public FilterRegistration.Dynamic addFilter( String p0, Class p1) {
  return new FilterRegistration$DynamicProxy (  impl.addFilter( p0, p1));
 }
@lombok.SneakyThrows
 public FilterRegistration.Dynamic addFilter( String p0, String p1) {
  return new FilterRegistration$DynamicProxy (  impl.addFilter( p0, p1));
 }
@lombok.SneakyThrows
 public FilterRegistration getFilterRegistration( String p0) {
  return new FilterRegistrationProxy (  impl.getFilterRegistration( p0));
 }
@lombok.SneakyThrows
 public java.util.Map getFilterRegistrations() {
  return  impl.getFilterRegistrations();
 }
@lombok.SneakyThrows
 public SessionCookieConfig getSessionCookieConfig() {
  return new SessionCookieConfigProxy (  impl.getSessionCookieConfig());
 }
@lombok.SneakyThrows
 public void setSessionTrackingModes(java.util.Set p0) {
  impl.setSessionTrackingModes( p0);
 }
@lombok.SneakyThrows
 public java.util.Set getDefaultSessionTrackingModes() {
  return  impl.getDefaultSessionTrackingModes();
 }
@lombok.SneakyThrows
 public java.util.Set getEffectiveSessionTrackingModes() {
  return  impl.getEffectiveSessionTrackingModes();
 }
@lombok.SneakyThrows
 public jakarta.servlet.descriptor.JspConfigDescriptor getJspConfigDescriptor() {
  return new JspConfigDescriptorProxy (  impl.getJspConfigDescriptor());
 }
@lombok.SneakyThrows
 public void declareRoles( String[] p0) {
  impl.declareRoles( p0);
 }
@lombok.SneakyThrows
 public String getVirtualServerName() {
  return  impl.getVirtualServerName();
 }
@lombok.SneakyThrows
 public int getSessionTimeout() {
  return  impl.getSessionTimeout();
 }
@lombok.SneakyThrows
 public void setSessionTimeout(int p0) {
  impl.setSessionTimeout( p0);
 }
@lombok.SneakyThrows
 public String getRequestCharacterEncoding() {
  return  impl.getRequestCharacterEncoding();
 }
@lombok.SneakyThrows
 public void setRequestCharacterEncoding( String p0) {
  impl.setRequestCharacterEncoding( p0);
 }
@lombok.SneakyThrows
 public String getResponseCharacterEncoding() {
  return  impl.getResponseCharacterEncoding();
 }
@lombok.SneakyThrows
 public void setResponseCharacterEncoding( String p0) {
  impl.setResponseCharacterEncoding( p0);
 }
@lombok.SneakyThrows
 public java.util.EventListener createListener( Class p0) {
  return  impl.createListener( p0);
 }
@lombok.SneakyThrows
 public void removeAttribute( String p0) {
  impl.removeAttribute( p0);
 }
@lombok.SneakyThrows
 public void setAttribute( String p0, Object p1) {
  impl.setAttribute( p0, p1);
 }
@lombok.SneakyThrows
 public Object getAttribute( String p0) {
  return  impl.getAttribute( p0);
 }
@lombok.SneakyThrows
 public Filter createFilter( Class p0) {
  return new FilterProxy (  impl.createFilter( p0));
 }
@lombok.SneakyThrows
 public int getMajorVersion() {
  return  impl.getMajorVersion();
 }
@lombok.SneakyThrows
 public int getMinorVersion() {
  return  impl.getMinorVersion();
 }
@lombok.SneakyThrows
 public void addListener( Class p0) {
  impl.addListener( p0);
 }
@lombok.SneakyThrows
 public void addListener(java.util.EventListener p0) {
  impl.addListener( p0);
 }
@lombok.SneakyThrows
 public void addListener( String p0) {
  impl.addListener( p0);
 }
@lombok.SneakyThrows
 public void log( String p0) {
  impl.log( p0);
 }
@lombok.SneakyThrows
 public void log( Exception p0, String p1) {
  impl.log( p0, p1);
 }
@lombok.SneakyThrows
 public void log( String p0, Throwable p1) {
  impl.log( p0, p1);
 }
@lombok.SneakyThrows
 public ClassLoader getClassLoader() {
  return  impl.getClassLoader();
 }
@lombok.SneakyThrows
 public java.io.InputStream getResourceAsStream( String p0) {
  return  impl.getResourceAsStream( p0);
 }
@lombok.SneakyThrows
 public java.net.URL getResource( String p0) {
  return  impl.getResource( p0);
 }
@lombok.SneakyThrows
 public ServletContext getContext( String p0) {
  return new ServletContextProxy (  impl.getContext( p0));
 }
}
