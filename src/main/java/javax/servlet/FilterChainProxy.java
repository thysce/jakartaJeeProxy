package javax.servlet;

import jakarta.servlet.ServletRequestProxy;
import jakarta.servlet.ServletResponseProxy;

public class FilterChainProxy  implements FilterChain {
  public final jakarta.servlet.FilterChain impl;
  public FilterChainProxy(jakarta.servlet.FilterChain impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void doFilter( ServletRequest p0, ServletResponse p1) {
  impl.doFilter( new ServletRequestProxy(p0), new ServletResponseProxy(p1));
 }
}
