package javax.servlet;

import jakarta.servlet.ServletRequestProxy;
import jakarta.servlet.ServletResponseProxy;

public class RequestDispatcherProxy  implements RequestDispatcher {
  public final jakarta.servlet.RequestDispatcher impl;
  public RequestDispatcherProxy(jakarta.servlet.RequestDispatcher impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void forward( ServletRequest p0, ServletResponse p1) {
  impl.forward( new ServletRequestProxy(p0), new ServletResponseProxy(p1));
 }
@lombok.SneakyThrows
 public void include( ServletRequest p0, ServletResponse p1) {
  impl.include( new ServletRequestProxy(p0), new ServletResponseProxy(p1));
 }
}
