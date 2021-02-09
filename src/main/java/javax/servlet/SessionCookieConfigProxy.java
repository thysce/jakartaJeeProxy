package javax.servlet;
public class SessionCookieConfigProxy  implements SessionCookieConfig {
  public final jakarta.servlet.SessionCookieConfig impl;
  public SessionCookieConfigProxy(jakarta.servlet.SessionCookieConfig impl) { this.impl = impl; }
@lombok.SneakyThrows
 public boolean isSecure() {
  return  impl.isSecure();
 }
@lombok.SneakyThrows
 public boolean isHttpOnly() {
  return  impl.isHttpOnly();
 }
@lombok.SneakyThrows
 public void setDomain( String p0) {
  impl.setDomain( p0);
 }
@lombok.SneakyThrows
 public void setMaxAge(int p0) {
  impl.setMaxAge( p0);
 }
@lombok.SneakyThrows
 public int getMaxAge() {
  return  impl.getMaxAge();
 }
@lombok.SneakyThrows
 public void setSecure(boolean p0) {
  impl.setSecure( p0);
 }
@lombok.SneakyThrows
 public void setHttpOnly(boolean p0) {
  impl.setHttpOnly( p0);
 }
@lombok.SneakyThrows
 public void setPath( String p0) {
  impl.setPath( p0);
 }
@lombok.SneakyThrows
 public String getDomain() {
  return  impl.getDomain();
 }
@lombok.SneakyThrows
 public void setComment( String p0) {
  impl.setComment( p0);
 }
@lombok.SneakyThrows
 public String getComment() {
  return  impl.getComment();
 }
@lombok.SneakyThrows
 public String getName() {
  return  impl.getName();
 }
@lombok.SneakyThrows
 public void setName( String p0) {
  impl.setName( p0);
 }
@lombok.SneakyThrows
 public String getPath() {
  return  impl.getPath();
 }
}
