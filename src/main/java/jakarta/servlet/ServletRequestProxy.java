package jakarta.servlet;

import javax.servlet.ServletResponseProxy;

public class ServletRequestProxy  implements ServletRequest {
  public final javax.servlet.ServletRequest impl;
  public ServletRequestProxy(javax.servlet.ServletRequest impl) { this.impl = impl; }
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
 public RequestDispatcher getRequestDispatcher( String p0) {
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
 public ServletContext getServletContext() {
  return new ServletContextProxy (  impl.getServletContext());
 }
@lombok.SneakyThrows
 public AsyncContext startAsync() {
  return new AsyncContextProxy (  impl.startAsync());
 }
@lombok.SneakyThrows
 public AsyncContext startAsync( ServletRequest p0, ServletResponse p1) {
  return new AsyncContextProxy (  impl.startAsync( new javax.servlet.ServletRequestProxy(p0), new ServletResponseProxy(p1)));
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
 public AsyncContext getAsyncContext() {
  return new AsyncContextProxy (  impl.getAsyncContext());
 }
@lombok.SneakyThrows
 public DispatcherType getDispatcherType() {
  return DispatcherType.valueOf(impl.getDispatcherType().name());
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
 public ServletInputStream getInputStream() {
  return new ServletInputStreamProxy (  impl.getInputStream());
 }
}
