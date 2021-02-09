package javax.servlet;
public class ReadListenerProxy  implements ReadListener {
  public final jakarta.servlet.ReadListener impl;
  public ReadListenerProxy(jakarta.servlet.ReadListener impl) { this.impl = impl; }
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
