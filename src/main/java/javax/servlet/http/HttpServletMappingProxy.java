package javax.servlet.http;
public class HttpServletMappingProxy  implements HttpServletMapping {
  public final jakarta.servlet.http.HttpServletMapping impl;
  public HttpServletMappingProxy(jakarta.servlet.http.HttpServletMapping impl) { this.impl = impl; }
@lombok.SneakyThrows
 public MappingMatch getMappingMatch() {
  return MappingMatch.valueOf(impl.getMappingMatch().name());
 }
@lombok.SneakyThrows
 public String getServletName() {
  return  impl.getServletName();
 }
@lombok.SneakyThrows
 public String getMatchValue() {
  return  impl.getMatchValue();
 }
@lombok.SneakyThrows
 public String getPattern() {
  return  impl.getPattern();
 }
}
