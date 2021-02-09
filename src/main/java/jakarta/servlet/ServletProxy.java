package jakarta.servlet;

import javax.servlet.ServletRequestProxy;
import javax.servlet.ServletResponseProxy;

public class ServletProxy  implements Servlet {
  public final javax.servlet.Servlet impl;
  public ServletProxy(javax.servlet.Servlet impl) { this.impl = impl; }
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
  impl.init( new javax.servlet.ServletConfigProxy(p0));
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
