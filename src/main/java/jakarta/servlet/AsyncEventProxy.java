package jakarta.servlet;
public class AsyncEventProxy  extends AsyncEvent {
  public final javax.servlet.AsyncEvent impl;
  public AsyncEventProxy(javax.servlet.AsyncEvent impl) {
      super(new AsyncContextProxy( impl.getAsyncContext() ),
              new ServletRequestProxy( impl.getSuppliedRequest() ),
              new ServletResponseProxy( impl.getSuppliedResponse() ));
      this.impl = impl; }
@lombok.SneakyThrows
 public AsyncContext getAsyncContext() {
  return new AsyncContextProxy (  impl.getAsyncContext());
 }
@lombok.SneakyThrows
 public ServletRequest getSuppliedRequest() {
  return new ServletRequestProxy (  impl.getSuppliedRequest());
 }
@lombok.SneakyThrows
 public ServletResponse getSuppliedResponse() {
  return new ServletResponseProxy (  impl.getSuppliedResponse());
 }
@lombok.SneakyThrows
 public Throwable getThrowable() {
  return  impl.getThrowable();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
