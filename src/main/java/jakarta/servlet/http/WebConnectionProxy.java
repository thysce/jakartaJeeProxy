package jakarta.servlet.http;

import jakarta.servlet.ServletInputStreamProxy;
import jakarta.servlet.ServletOutputStreamProxy;

public class WebConnectionProxy  implements WebConnection {
  public final javax.servlet.http.WebConnection impl;
  public WebConnectionProxy(javax.servlet.http.WebConnection impl) { this.impl = impl; }
@lombok.SneakyThrows
 public jakarta.servlet.ServletOutputStream getOutputStream() {
  return new ServletOutputStreamProxy (  impl.getOutputStream());
 }
@lombok.SneakyThrows
 public jakarta.servlet.ServletInputStream getInputStream() {
  return new ServletInputStreamProxy (  impl.getInputStream());
 }
@lombok.SneakyThrows
 public void close() {
  impl.close();
 }
}
