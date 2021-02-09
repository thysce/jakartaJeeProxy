package jakarta.servlet;

import javax.servlet.ReadListenerProxy;

public class ServletInputStreamProxy  extends ServletInputStream {
  public final javax.servlet.ServletInputStream impl;
  public ServletInputStreamProxy(javax.servlet.ServletInputStream impl) { this.impl = impl; }
@lombok.SneakyThrows
 public boolean isFinished() {
  return  impl.isFinished();
 }
@lombok.SneakyThrows
 public void setReadListener( ReadListener p0) {
  impl.setReadListener( new ReadListenerProxy(p0));
 }
@lombok.SneakyThrows
 public boolean isReady() {
  return  impl.isReady();
 }
@lombok.SneakyThrows
 public int readLine(byte[] p0,int p1,int p2) {
  return  impl.readLine( p0, p1, p2);
 }
@lombok.SneakyThrows
 public int read(byte[] p0,int p1,int p2) {
  return  impl.read( p0, p1, p2);
 }
@lombok.SneakyThrows
 public int read(byte[] p0) {
  return  impl.read( p0);
 }
@lombok.SneakyThrows
 public int read() {
  return  impl.read();
 }
@lombok.SneakyThrows
 public void close() {
  impl.close();
 }
@lombok.SneakyThrows
 public void mark(int p0) {
  impl.mark( p0);
 }
@lombok.SneakyThrows
 public byte[] readAllBytes() {
  return  impl.readAllBytes();
 }
@lombok.SneakyThrows
 public int readNBytes(byte[] p0,int p1,int p2) {
  return  impl.readNBytes( p0, p1, p2);
 }
@lombok.SneakyThrows
 public byte[] readNBytes(int p0) {
  return  impl.readNBytes( p0);
 }
@lombok.SneakyThrows
 public long transferTo(java.io.OutputStream p0) {
  return  impl.transferTo( p0);
 }
@lombok.SneakyThrows
 public long skip(long p0) {
  return  impl.skip( p0);
 }
@lombok.SneakyThrows
 public int available() {
  return  impl.available();
 }
@lombok.SneakyThrows
 public boolean markSupported() {
  return  impl.markSupported();
 }
@lombok.SneakyThrows
 public void reset() {
  impl.reset();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
