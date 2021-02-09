package jakarta.servlet;

import javax.servlet.WriteListenerProxy;

public class ServletOutputStreamProxy  extends ServletOutputStream {
  public final javax.servlet.ServletOutputStream impl;
  public ServletOutputStreamProxy(javax.servlet.ServletOutputStream impl) { this.impl = impl; }
@lombok.SneakyThrows
 public void setWriteListener( WriteListener p0) {
  impl.setWriteListener( new WriteListenerProxy(p0));
 }
@lombok.SneakyThrows
 public boolean isReady() {
  return  impl.isReady();
 }
@lombok.SneakyThrows
 public void println(boolean p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println( String p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println(int p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println(long p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println(float p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println(double p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println(char p0) {
  impl.println( p0);
 }
@lombok.SneakyThrows
 public void println() {
  impl.println();
 }
@lombok.SneakyThrows
 public void print(boolean p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print(int p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print( String p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print(char p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print(double p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print(float p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void print(long p0) {
  impl.print( p0);
 }
@lombok.SneakyThrows
 public void write(byte[] p0,int p1,int p2) {
  impl.write( p0, p1, p2);
 }
@lombok.SneakyThrows
 public void write(byte[] p0) {
  impl.write( p0);
 }
@lombok.SneakyThrows
 public void write(int p0) {
  impl.write( p0);
 }
@lombok.SneakyThrows
 public void flush() {
  impl.flush();
 }
@lombok.SneakyThrows
 public void close() {
  impl.close();
 }
@lombok.SneakyThrows
 public int hashCode() {
  return  impl.hashCode();
 }
}
