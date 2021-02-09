package javax.servlet.http;

import javax.servlet.ServletContextProxy;

public class HttpSessionProxy  implements HttpSession {
  public final jakarta.servlet.http.HttpSession impl;
  public HttpSessionProxy(jakarta.servlet.http.HttpSession impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Enumeration getAttributeNames() {
  return  impl.getAttributeNames();
 }
@lombok.SneakyThrows
 public javax.servlet.ServletContext getServletContext() {
  return new ServletContextProxy (  impl.getServletContext());
 }
@lombok.SneakyThrows
 public boolean isNew() {
  return  impl.isNew();
 }
@lombok.SneakyThrows
 public void removeValue( String p0) {
  impl.removeValue( p0);
 }
@lombok.SneakyThrows
 public HttpSessionContext getSessionContext() {
  return new HttpSessionContextProxy (  impl.getSessionContext());
 }
@lombok.SneakyThrows
 public long getLastAccessedTime() {
  return  impl.getLastAccessedTime();
 }
@lombok.SneakyThrows
 public void setMaxInactiveInterval(int p0) {
  impl.setMaxInactiveInterval( p0);
 }
@lombok.SneakyThrows
 public int getMaxInactiveInterval() {
  return  impl.getMaxInactiveInterval();
 }
@lombok.SneakyThrows
 public void removeAttribute( String p0) {
  impl.removeAttribute( p0);
 }
@lombok.SneakyThrows
 public void invalidate() {
  impl.invalidate();
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
 public long getCreationTime() {
  return  impl.getCreationTime();
 }
@lombok.SneakyThrows
 public void putValue( String p0, Object p1) {
  impl.putValue( p0, p1);
 }
@lombok.SneakyThrows
 public String[] getValueNames() {
  return  impl.getValueNames();
 }
@lombok.SneakyThrows
 public Object getValue( String p0) {
  return  impl.getValue( p0);
 }
@lombok.SneakyThrows
 public String getId() {
  return  impl.getId();
 }
}
