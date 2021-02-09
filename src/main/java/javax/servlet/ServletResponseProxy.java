package javax.servlet;
public class ServletResponseProxy  implements ServletResponse {
  public final jakarta.servlet.ServletResponse impl;
  public ServletResponseProxy(jakarta.servlet.ServletResponse impl) { this.impl = impl; }
@lombok.SneakyThrows
 public String getCharacterEncoding() {
  return  impl.getCharacterEncoding();
 }
@lombok.SneakyThrows
 public void setCharacterEncoding( String p0) {
  impl.setCharacterEncoding( p0);
 }
@lombok.SneakyThrows
 public void resetBuffer() {
  impl.resetBuffer();
 }
@lombok.SneakyThrows
 public int getBufferSize() {
  return  impl.getBufferSize();
 }
@lombok.SneakyThrows
 public void setBufferSize(int p0) {
  impl.setBufferSize( p0);
 }
@lombok.SneakyThrows
 public void setContentLengthLong(long p0) {
  impl.setContentLengthLong( p0);
 }
@lombok.SneakyThrows
 public boolean isCommitted() {
  return  impl.isCommitted();
 }
@lombok.SneakyThrows
 public java.io.PrintWriter getWriter() {
  return  impl.getWriter();
 }
@lombok.SneakyThrows
 public java.util.Locale getLocale() {
  return  impl.getLocale();
 }
@lombok.SneakyThrows
 public String getContentType() {
  return  impl.getContentType();
 }
@lombok.SneakyThrows
 public void setContentType( String p0) {
  impl.setContentType( p0);
 }
@lombok.SneakyThrows
 public void setContentLength(int p0) {
  impl.setContentLength( p0);
 }
@lombok.SneakyThrows
 public void setLocale(java.util.Locale p0) {
  impl.setLocale( p0);
 }
@lombok.SneakyThrows
 public ServletOutputStream getOutputStream() {
  return new ServletOutputStreamProxy (  impl.getOutputStream());
 }
@lombok.SneakyThrows
 public void reset() {
  impl.reset();
 }
@lombok.SneakyThrows
 public void flushBuffer() {
  impl.flushBuffer();
 }
}
