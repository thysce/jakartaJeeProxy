package javax.servlet;
public class ServletSecurityElementProxy  extends ServletSecurityElement {
  public final jakarta.servlet.ServletSecurityElement impl;
  public ServletSecurityElementProxy(jakarta.servlet.ServletSecurityElement impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Collection getMethodNames() {
  return  impl.getMethodNames();
 }
@lombok.SneakyThrows
 public java.util.Collection getHttpMethodConstraints() {
  return  impl.getHttpMethodConstraints();
 }
@lombok.SneakyThrows
 public javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() {
  return javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic.valueOf(impl.getEmptyRoleSemantic().name());
 }
@lombok.SneakyThrows
 public javax.servlet.annotation.ServletSecurity.TransportGuarantee getTransportGuarantee() {
  return javax.servlet.annotation.ServletSecurity.TransportGuarantee.valueOf(impl.getTransportGuarantee().name());
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
