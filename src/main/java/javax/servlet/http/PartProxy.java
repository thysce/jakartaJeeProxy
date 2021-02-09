package javax.servlet.http;
public class PartProxy  implements Part {
  public final jakarta.servlet.http.Part impl;
  public PartProxy(jakarta.servlet.http.Part impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Collection getHeaderNames() {
  return  impl.getHeaderNames();
 }
@lombok.SneakyThrows
 public String getSubmittedFileName() {
  return  impl.getSubmittedFileName();
 }
@lombok.SneakyThrows
 public String getHeader( String p0) {
  return  impl.getHeader( p0);
 }
@lombok.SneakyThrows
 public String getContentType() {
  return  impl.getContentType();
 }
@lombok.SneakyThrows
 public java.util.Collection getHeaders( String p0) {
  return  impl.getHeaders( p0);
 }
@lombok.SneakyThrows
 public String getName() {
  return  impl.getName();
 }
@lombok.SneakyThrows
 public void write( String p0) {
  impl.write( p0);
 }
@lombok.SneakyThrows
 public void delete() {
  impl.delete();
 }
@lombok.SneakyThrows
 public long getSize() {
  return  impl.getSize();
 }
@lombok.SneakyThrows
 public java.io.InputStream getInputStream() {
  return  impl.getInputStream();
 }
}
