package javax.servlet.http;

import jakarta.servlet.http.WebConnectionProxy;

public class HttpUpgradeHandlerProxy  implements HttpUpgradeHandler {
  public final jakarta.servlet.http.HttpUpgradeHandler impl;
  public HttpUpgradeHandlerProxy(jakarta.servlet.http.HttpUpgradeHandler impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void init( WebConnection p0) {
  impl.init( new WebConnectionProxy(p0));
 }
@lombok.SneakyThrows
 public void destroy() {
  impl.destroy();
 }
}
