package jakarta.servlet;
public class ServletSecurityElementProxy  extends ServletSecurityElement {
  public final javax.servlet.ServletSecurityElement impl;
  public ServletSecurityElementProxy(javax.servlet.ServletSecurityElement impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Collection getMethodNames() {
  return  impl.getMethodNames();
 }
@lombok.SneakyThrows
 public java.util.Collection getHttpMethodConstraints() {
  return  impl.getHttpMethodConstraints();
 }
@lombok.SneakyThrows
 public jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() {
  return jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic.valueOf(impl.getEmptyRoleSemantic().name());
 }
@lombok.SneakyThrows
 public jakarta.servlet.annotation.ServletSecurity.TransportGuarantee getTransportGuarantee() {
  return jakarta.servlet.annotation.ServletSecurity.TransportGuarantee.valueOf(impl.getTransportGuarantee().name());
 }
@lombok.SneakyThrows
 public String[] getRolesAllowed() {
  return  impl.getRolesAllowed();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
