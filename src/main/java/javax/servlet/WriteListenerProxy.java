package javax.servlet;
public class WriteListenerProxy  implements WriteListener {
  public final jakarta.servlet.WriteListener impl;
  public WriteListenerProxy(jakarta.servlet.WriteListener impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void onWritePossible() {
  impl.onWritePossible();
 }
@lombok.SneakyThrows
 public void onError( Throwable p0) {
  impl.onError( p0);
 }
}
