package javax.servlet.http;

import javax.servlet.AsyncContextProxy;
import javax.servlet.RequestDispatcherProxy;
import javax.servlet.ServletContextProxy;
import javax.servlet.ServletInputStreamProxy;

import jakarta.servlet.ServletRequestProxy;
import jakarta.servlet.ServletResponseProxy;
import jakarta.servlet.http.HttpServletResponseProxy;

public class HttpServletRequestProxy  implements HttpServletRequest {
  public final jakarta.servlet.http.HttpServletRequest impl;
  public HttpServletRequestProxy(jakarta.servlet.http.HttpServletRequest impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Map getTrailerFields() {
  return  impl.getTrailerFields();
 }
@lombok.SneakyThrows
 public boolean isTrailerFieldsReady() {
  return  impl.isTrailerFieldsReady();
 }
@lombok.SneakyThrows
 public String getAuthType() {
  return  impl.getAuthType();
 }
@lombok.SneakyThrows
 public Cookie[] getCookies() {
  Object[] proxyResult = impl.getCookies();
  CookieProxy[] result = new CookieProxy[proxyResult.length];
  System.arraycopy(proxyResult, 0, result, 0, proxyResult.length);  return result;
 }
@lombok.SneakyThrows
 public HttpServletMapping getHttpServletMapping() {
  return new HttpServletMappingProxy (  impl.getHttpServletMapping());
 }
@lombok.SneakyThrows
 public String getRequestedSessionId() {
  return  impl.getRequestedSessionId();
 }
@lombok.SneakyThrows
 public int getIntHeader( String p0) {
  return  impl.getIntHeader( p0);
 }
@lombok.SneakyThrows
 public boolean isRequestedSessionIdValid() {
  return  impl.isRequestedSessionIdValid();
 }
@lombok.SneakyThrows
 public long getDateHeader( String p0) {
  return  impl.getDateHeader( p0);
 }
@lombok.SneakyThrows
 public java.util.Enumeration getHeaderNames() {
  return  impl.getHeaderNames();
 }
@lombok.SneakyThrows
 public String getPathInfo() {
  return  impl.getPathInfo();
 }
@lombok.SneakyThrows
 public String getPathTranslated() {
  return  impl.getPathTranslated();
 }
@lombok.SneakyThrows
 public PushBuilder newPushBuilder() {
  return new PushBuilderProxy (  impl.newPushBuilder());
 }
@lombok.SneakyThrows
 public String getContextPath() {
  return  impl.getContextPath();
 }
@lombok.SneakyThrows
 public String getQueryString() {
  return  impl.getQueryString();
 }
@lombok.SneakyThrows
 public String getRemoteUser() {
  return  impl.getRemoteUser();
 }
@lombok.SneakyThrows
 public boolean isUserInRole( String p0) {
  return  impl.isUserInRole( p0);
 }
@lombok.SneakyThrows
 public java.security.Principal getUserPrincipal() {
  return  impl.getUserPrincipal();
 }
@lombok.SneakyThrows
 public String getRequestURI() {
  return  impl.getRequestURI();
 }
@lombok.SneakyThrows
 public StringBuffer getRequestURL() {
  return  impl.getRequestURL();
 }
@lombok.SneakyThrows
 public String getServletPath() {
  return  impl.getServletPath();
 }
@lombok.SneakyThrows
 public String changeSessionId() {
  return  impl.changeSessionId();
 }
@lombok.SneakyThrows
 public boolean isRequestedSessionIdFromCookie() {
  return  impl.isRequestedSessionIdFromCookie();
 }
@lombok.SneakyThrows
 public boolean isRequestedSessionIdFromURL() {
  return  impl.isRequestedSessionIdFromURL();
 }
@lombok.SneakyThrows
 public boolean isRequestedSessionIdFromUrl() {
  return  impl.isRequestedSessionIdFromUrl();
 }
@lombok.SneakyThrows
 public void login( String p0, String p1) {
  impl.login( p0, p1);
 }
@lombok.SneakyThrows
 public void logout() {
  impl.logout();
 }
@lombok.SneakyThrows
 public Part getPart( String p0) {
  return new PartProxy (  impl.getPart( p0));
 }
@lombok.SneakyThrows
 public HttpUpgradeHandler upgrade( Class p0) {
  return new HttpUpgradeHandlerProxy (  impl.upgrade( p0));
 }
@lombok.SneakyThrows
 public java.util.Collection getParts() {
  return  impl.getParts();
 }
@lombok.SneakyThrows
 public HttpSession getSession() {
  return new HttpSessionProxy (  impl.getSession());
 }
@lombok.SneakyThrows
 public HttpSession getSession(boolean p0) {
  return new HttpSessionProxy (  impl.getSession( p0));
 }
@lombok.SneakyThrows
 public boolean authenticate( HttpServletResponse p0) {
  return  impl.authenticate( new HttpServletResponseProxy(p0));
 }
@lombok.SneakyThrows
 public String getHeader( String p0) {
  return  impl.getHeader( p0);
 }
@lombok.SneakyThrows
 public java.util.Enumeration getHeaders( String p0) {
  return  impl.getHeaders( p0);
 }
@lombok.SneakyThrows
 public String getMethod() {
  return  impl.getMethod();
 }
@lombok.SneakyThrows
 public java.util.Enumeration getAttributeNames() {
  return  impl.getAttributeNames();
 }
@lombok.SneakyThrows
 public String getServerName() {
  return  impl.getServerName();
 }
@lombok.SneakyThrows
 public String[] getParameterValues( String p0) {
  return  impl.getParameterValues( p0);
 }
@lombok.SneakyThrows
 public String getCharacterEncoding() {
  return  impl.getCharacterEncoding();
 }
@lombok.SneakyThrows
 public void setCharacterEncoding( String p0) {
  impl.setCharacterEncoding( p0);
 }
@lombok.SneakyThrows
 public int getServerPort() {
  return  impl.getServerPort();
 }
@lombok.SneakyThrows
 public String getRemoteAddr() {
  return  impl.getRemoteAddr();
 }
@lombok.SneakyThrows
 public String getRemoteHost() {
  return  impl.getRemoteHost();
 }
@lombok.SneakyThrows
 public java.util.Enumeration getLocales() {
  return  impl.getLocales();
 }
@lombok.SneakyThrows
 public boolean isSecure() {
  return  impl.isSecure();
 }
@lombok.SneakyThrows
 public javax.servlet.RequestDispatcher getRequestDispatcher( String p0) {
  return new RequestDispatcherProxy (  impl.getRequestDispatcher( p0));
 }
@lombok.SneakyThrows
 public String getRealPath( String p0) {
  return  impl.getRealPath( p0);
 }
@lombok.SneakyThrows
 public int getRemotePort() {
  return  impl.getRemotePort();
 }
@lombok.SneakyThrows
 public String getLocalAddr() {
  return  impl.getLocalAddr();
 }
@lombok.SneakyThrows
 public javax.servlet.ServletContext getServletContext() {
  return new ServletContextProxy (  impl.getServletContext());
 }
@lombok.SneakyThrows
 public javax.servlet.AsyncContext startAsync() {
  return new AsyncContextProxy (  impl.startAsync());
 }
@lombok.SneakyThrows
 public javax.servlet.AsyncContext startAsync(javax.servlet.ServletRequest p0,javax.servlet.ServletResponse p1) {
  return new AsyncContextProxy (  impl.startAsync( new ServletRequestProxy(p0), new ServletResponseProxy(p1)));
 }
@lombok.SneakyThrows
 public boolean isAsyncStarted() {
  return  impl.isAsyncStarted();
 }
@lombok.SneakyThrows
 public boolean isAsyncSupported() {
  return  impl.isAsyncSupported();
 }
@lombok.SneakyThrows
 public javax.servlet.AsyncContext getAsyncContext() {
  return new AsyncContextProxy (  impl.getAsyncContext());
 }
@lombok.SneakyThrows
 public javax.servlet.DispatcherType getDispatcherType() {
  return javax.servlet.DispatcherType.valueOf(impl.getDispatcherType().name());
 }
@lombok.SneakyThrows
 public java.util.Map getParameterMap() {
  return  impl.getParameterMap();
 }
@lombok.SneakyThrows
 public java.util.Enumeration getParameterNames() {
  return  impl.getParameterNames();
 }
@lombok.SneakyThrows
 public java.io.BufferedReader getReader() {
  return  impl.getReader();
 }
@lombok.SneakyThrows
 public void removeAttribute( String p0) {
  impl.removeAttribute( p0);
 }
@lombok.SneakyThrows
 public String getParameter( String p0) {
  return  impl.getParameter( p0);
 }
@lombok.SneakyThrows
 public java.util.Locale getLocale() {
  return  impl.getLocale();
 }
@lombok.SneakyThrows
 public String getLocalName() {
  return  impl.getLocalName();
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
 public long getContentLengthLong() {
  return  impl.getContentLengthLong();
 }
@lombok.SneakyThrows
 public String getContentType() {
  return  impl.getContentType();
 }
@lombok.SneakyThrows
 public int getContentLength() {
  return  impl.getContentLength();
 }
@lombok.SneakyThrows
 public int getLocalPort() {
  return  impl.getLocalPort();
 }
@lombok.SneakyThrows
 public String getProtocol() {
  return  impl.getProtocol();
 }
@lombok.SneakyThrows
 public String getScheme() {
  return  impl.getScheme();
 }
@lombok.SneakyThrows
 public javax.servlet.ServletInputStream getInputStream() {
  return new ServletInputStreamProxy (  impl.getInputStream());
 }
}
