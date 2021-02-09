package javax.servlet;

import jakarta.servlet.FilterChainProxy;
import jakarta.servlet.FilterConfigProxy;
import jakarta.servlet.ServletRequestProxy;
import jakarta.servlet.ServletResponseProxy;

public class FilterProxy  implements Filter {
  public final jakarta.servlet.Filter impl;
  public FilterProxy(jakarta.servlet.Filter impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void doFilter( ServletRequest p0, ServletResponse p1, FilterChain p2) {
  impl.doFilter( new ServletRequestProxy(p0), new ServletResponseProxy(p1), new FilterChainProxy(p2));
 }
@lombok.SneakyThrows
 public void init( FilterConfig p0) {
  impl.init( new FilterConfigProxy(p0));
 }
@lombok.SneakyThrows
 public void destroy() {
  impl.destroy();
 }
}
