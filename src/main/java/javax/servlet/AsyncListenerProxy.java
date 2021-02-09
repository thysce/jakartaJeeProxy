package javax.servlet;

import jakarta.servlet.AsyncEventProxy;

public class AsyncListenerProxy  implements AsyncListener {
  public final jakarta.servlet.AsyncListener impl;
  public AsyncListenerProxy(jakarta.servlet.AsyncListener impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void onStartAsync( AsyncEvent p0) {
  impl.onStartAsync( new AsyncEventProxy(p0));
 }
@lombok.SneakyThrows
 public void onTimeout( AsyncEvent p0) {
  impl.onTimeout( new AsyncEventProxy(p0));
 }
@lombok.SneakyThrows
 public void onComplete( AsyncEvent p0) {
  impl.onComplete( new AsyncEventProxy(p0));
 }
@lombok.SneakyThrows
 public void onError( AsyncEvent p0) {
  impl.onError( new AsyncEventProxy(p0));
 }
}
