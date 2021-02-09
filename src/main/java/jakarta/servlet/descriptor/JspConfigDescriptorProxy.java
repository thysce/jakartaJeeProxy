package jakarta.servlet.descriptor;
public class JspConfigDescriptorProxy  implements JspConfigDescriptor {
  public final javax.servlet.descriptor.JspConfigDescriptor impl;
  public JspConfigDescriptorProxy(javax.servlet.descriptor.JspConfigDescriptor impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.Collection getTaglibs() {
  return  impl.getTaglibs();
 }
@lombok.SneakyThrows
 public java.util.Collection getJspPropertyGroups() {
  return  impl.getJspPropertyGroups();
 }
}
