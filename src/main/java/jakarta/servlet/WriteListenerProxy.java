package jakarta.servlet;
public class WriteListenerProxy  implements WriteListener {
  public final javax.servlet.WriteListener impl;
  public WriteListenerProxy(javax.servlet.WriteListener impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void onWritePossible() {
  impl.onWritePossible();
 }
@lombok.SneakyThrows
 public void onError( Throwable p0) {
  impl.onError( p0);
 }
}
