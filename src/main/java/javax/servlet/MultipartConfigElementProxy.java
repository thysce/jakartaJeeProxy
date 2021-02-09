package javax.servlet;
public class MultipartConfigElementProxy  extends MultipartConfigElement {
  public final jakarta.servlet.MultipartConfigElement impl;
  public MultipartConfigElementProxy(jakarta.servlet.MultipartConfigElement impl) {
   super(impl.getLocation(), impl.getMaxFileSize(), impl.getMaxRequestSize(), impl.getFileSizeThreshold());
   this.impl = impl; }
@lombok.SneakyThrows
 public long getMaxFileSize() {
  return  impl.getMaxFileSize();
 }
@lombok.SneakyThrows
 public long getMaxRequestSize() {
  return  impl.getMaxRequestSize();
 }
@lombok.SneakyThrows
 public int getFileSizeThreshold() {
  return  impl.getFileSizeThreshold();
 }
@lombok.SneakyThrows
 public String getLocation() {
  return  impl.getLocation();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
