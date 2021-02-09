package jakarta.servlet;

import javax.servlet.ServletContextProxy;

public class AsyncContextProxy  implements AsyncContext {
  public final javax.servlet.AsyncContext impl;
  public AsyncContextProxy(javax.servlet.AsyncContext impl) { this.impl = impl; }
@lombok.SneakyThrows
 public ServletResponse getResponse() {
  return new ServletResponseProxy (  impl.getResponse());
 }
@lombok.SneakyThrows
 public boolean hasOriginalRequestAndResponse() {
  return  impl.hasOriginalRequestAndResponse();
 }
@lombok.SneakyThrows
 public AsyncListener createListener( Class p0) {
  return new AsyncListenerProxy (  impl.createListener( p0));
 }
@lombok.SneakyThrows
 public void setTimeout(long p0) {
  impl.setTimeout( p0);
 }
@lombok.SneakyThrows
 public ServletRequest getRequest() {
  return new ServletRequestProxy (  impl.getRequest());
 }
@lombok.SneakyThrows
 public long getTimeout() {
  return  impl.getTimeout();
 }
@lombok.SneakyThrows
 public void complete() {
  impl.complete();
 }
@lombok.SneakyThrows
 public void addListener( AsyncListener p0, ServletRequest p1, ServletResponse p2) {
  impl.addListener( new javax.servlet.AsyncListenerProxy(p0), new javax.servlet.ServletRequestProxy(p1), new javax.servlet.ServletResponseProxy(p2));
 }
@lombok.SneakyThrows
 public void addListener( AsyncListener p0) {
  impl.addListener( new javax.servlet.AsyncListenerProxy(p0));
 }
@lombok.SneakyThrows
 public void dispatch( ServletContext p0, String p1) {
  impl.dispatch( new ServletContextProxy(p0), p1);
 }
@lombok.SneakyThrows
 public void dispatch( String p0) {
  impl.dispatch( p0);
 }
@lombok.SneakyThrows
 public void dispatch() {
  impl.dispatch();
 }
@lombok.SneakyThrows
 public void start( Runnable p0) {
  impl.start( p0);
 }
}
