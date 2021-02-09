package jakarta.servlet.http;
public class CookieProxy  extends jakarta.servlet.http.Cookie {
  public final javax.servlet.http.Cookie impl;
  public CookieProxy(javax.servlet.http.Cookie impl) {
   super(impl.getName(), impl.getValue());
   this.impl = impl; }
@lombok.SneakyThrows
 public boolean isHttpOnly() {
  return  impl.isHttpOnly();
 }
@lombok.SneakyThrows
 public void setDomain(java.lang.String p0) {
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
 public boolean getSecure() {
  return  impl.getSecure();
 }
@lombok.SneakyThrows
 public void setHttpOnly(boolean p0) {
  impl.setHttpOnly( p0);
 }
@lombok.SneakyThrows
 public void setVersion(int p0) {
  impl.setVersion( p0);
 }
@lombok.SneakyThrows
 public void setPath(java.lang.String p0) {
  impl.setPath( p0);
 }
@lombok.SneakyThrows
 public void setComment(java.lang.String p0) {
  impl.setComment( p0);
 }
@lombok.SneakyThrows
 public java.lang.String getDomain() {
  return  impl.getDomain();
 }
@lombok.SneakyThrows
 public java.lang.String getComment() {
  return  impl.getComment();
 }
@lombok.SneakyThrows
 public int getVersion() {
  return  impl.getVersion();
 }
@lombok.SneakyThrows
 public java.lang.Object clone() {
  return  impl.clone();
 }
@lombok.SneakyThrows
 public java.lang.String getName() {
  return  impl.getName();
 }
@lombok.SneakyThrows
 public java.lang.String getValue() {
  return  impl.getValue();
 }
@lombok.SneakyThrows
 public void setValue(java.lang.String p0) {
  impl.setValue( p0);
 }
@lombok.SneakyThrows
 public java.lang.String getPath() {
  return  impl.getPath();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
