package javax.servlet;

import jakarta.servlet.ServletRequestProxy;
import jakarta.servlet.ServletResponseProxy;

public class ServletProxy  implements Servlet {
  public final jakarta.servlet.Servlet impl;
  public ServletProxy(jakarta.servlet.Servlet impl) { this.impl = impl; }
@lombok.SneakyThrows
 public ServletConfig getServletConfig() {
  return new ServletConfigProxy (  impl.getServletConfig());
 }
@lombok.SneakyThrows
 public String getServletInfo() {
  return  impl.getServletInfo();
 }
@lombok.SneakyThrows
 public void init( ServletConfig p0) {
  impl.init( new jakarta.servlet.ServletConfigProxy(p0));
 }
@lombok.SneakyThrows
 public void destroy() {
  impl.destroy();
 }
@lombok.SneakyThrows
 public void service( ServletRequest p0, ServletResponse p1) {
  impl.service( new ServletRequestProxy(p0), new ServletResponseProxy(p1));
 }
}
