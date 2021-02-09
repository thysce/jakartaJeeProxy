package jakarta.servlet;

import javax.servlet.ServletRequestProxy;
import javax.servlet.ServletResponseProxy;

public class FilterChainProxy  implements FilterChain {
  public final javax.servlet.FilterChain impl;
  public FilterChainProxy(javax.servlet.FilterChain impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void doFilter( ServletRequest p0, ServletResponse p1) {
  impl.doFilter( new ServletRequestProxy(p0), new ServletResponseProxy(p1));
 }
}
