package jakarta.servlet;
public class ReadListenerProxy  implements ReadListener {
  public final javax.servlet.ReadListener impl;
  public ReadListenerProxy(javax.servlet.ReadListener impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void onAllDataRead() {
  impl.onAllDataRead();
 }
@lombok.SneakyThrows
 public void onDataAvailable() {
  impl.onDataAvailable();
 }
@lombok.SneakyThrows
 public void onError( Throwable p0) {
  impl.onError( p0);
 }
}
