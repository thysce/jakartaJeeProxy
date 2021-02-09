package javax.servlet.http;
public class PushBuilderProxy  implements PushBuilder {
  public final jakarta.servlet.http.PushBuilder impl;
  public PushBuilderProxy(jakarta.servlet.http.PushBuilder impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Set getHeaderNames() {
  return  impl.getHeaderNames();
 }
@lombok.SneakyThrows
 public String getQueryString() {
  return  impl.getQueryString();
 }
@lombok.SneakyThrows
 public PushBuilder sessionId( String p0) {
  return new PushBuilderProxy (  impl.sessionId( p0));
 }
@lombok.SneakyThrows
 public PushBuilder queryString( String p0) {
  return new PushBuilderProxy (  impl.queryString( p0));
 }
@lombok.SneakyThrows
 public String getSessionId() {
  return  impl.getSessionId();
 }
@lombok.SneakyThrows
 public PushBuilder setHeader( String p0, String p1) {
  return new PushBuilderProxy (  impl.setHeader( p0, p1));
 }
@lombok.SneakyThrows
 public PushBuilder removeHeader( String p0) {
  return new PushBuilderProxy (  impl.removeHeader( p0));
 }
@lombok.SneakyThrows
 public void push() {
  impl.push();
 }
@lombok.SneakyThrows
 public String getHeader( String p0) {
  return  impl.getHeader( p0);
 }
@lombok.SneakyThrows
 public PushBuilder addHeader( String p0, String p1) {
  return new PushBuilderProxy (  impl.addHeader( p0, p1));
 }
@lombok.SneakyThrows
 public PushBuilder method( String p0) {
  return new PushBuilderProxy (  impl.method( p0));
 }
@lombok.SneakyThrows
 public String getMethod() {
  return  impl.getMethod();
 }
@lombok.SneakyThrows
 public PushBuilder path( String p0) {
  return new PushBuilderProxy (  impl.path( p0));
 }
@lombok.SneakyThrows
 public String getPath() {
  return  impl.getPath();
 }
}
