package javax.servlet.http;
public class HttpSessionContextProxy  implements HttpSessionContext {
  public final jakarta.servlet.http.HttpSessionContext impl;
  public HttpSessionContextProxy(jakarta.servlet.http.HttpSessionContext impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Enumeration getIds() {
  return  impl.getIds();
 }
@lombok.SneakyThrows
 public HttpSession getSession( String p0) {
  return new HttpSessionProxy (  impl.getSession( p0));
 }
}
