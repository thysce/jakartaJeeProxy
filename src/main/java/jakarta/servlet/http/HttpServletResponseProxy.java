package jakarta.servlet.http;

import javax.servlet.http.CookieProxy;

import jakarta.servlet.ServletOutputStreamProxy;

public class HttpServletResponseProxy  implements HttpServletResponse {
  public final javax.servlet.http.HttpServletResponse impl;
  public HttpServletResponseProxy(javax.servlet.http.HttpServletResponse impl) { this.impl = impl; }
@lombok.SneakyThrows
 public java.util.function.Supplier getTrailerFields() {
  return  impl.getTrailerFields();
 }
@lombok.SneakyThrows
 public java.util.Collection getHeaderNames() {
  return  impl.getHeaderNames();
 }
@lombok.SneakyThrows
 public void addCookie( Cookie p0) {
  impl.addCookie( new CookieProxy(p0));
 }
@lombok.SneakyThrows
 public String encodeURL( String p0) {
  return  impl.encodeURL( p0);
 }
@lombok.SneakyThrows
 public String encodeRedirectURL( String p0) {
  return  impl.encodeRedirectURL( p0);
 }
@lombok.SneakyThrows
 public String encodeUrl( String p0) {
  return  impl.encodeUrl( p0);
 }
@lombok.SneakyThrows
 public String encodeRedirectUrl( String p0) {
  return  impl.encodeRedirectUrl( p0);
 }
@lombok.SneakyThrows
 public void sendError(int p0, String p1) {
  impl.sendError( p0, p1);
 }
@lombok.SneakyThrows
 public void sendError(int p0) {
  impl.sendError( p0);
 }
@lombok.SneakyThrows
 public void sendRedirect( String p0) {
  impl.sendRedirect( p0);
 }
@lombok.SneakyThrows
 public void setDateHeader( String p0,long p1) {
  impl.setDateHeader( p0, p1);
 }
@lombok.SneakyThrows
 public void addDateHeader( String p0,long p1) {
  impl.addDateHeader( p0, p1);
 }
@lombok.SneakyThrows
 public void setIntHeader( String p0,int p1) {
  impl.setIntHeader( p0, p1);
 }
@lombok.SneakyThrows
 public void addIntHeader( String p0,int p1) {
  impl.addIntHeader( p0, p1);
 }
@lombok.SneakyThrows
 public void setTrailerFields(java.util.function.Supplier p0) {
  impl.setTrailerFields( p0);
 }
@lombok.SneakyThrows
 public boolean containsHeader( String p0) {
  return  impl.containsHeader( p0);
 }
@lombok.SneakyThrows
 public void setHeader( String p0, String p1) {
  impl.setHeader( p0, p1);
 }
@lombok.SneakyThrows
 public String getHeader( String p0) {
  return  impl.getHeader( p0);
 }
@lombok.SneakyThrows
 public java.util.Collection getHeaders( String p0) {
  return  impl.getHeaders( p0);
 }
@lombok.SneakyThrows
 public int getStatus() {
  return  impl.getStatus();
 }
@lombok.SneakyThrows
 public void addHeader( String p0, String p1) {
  impl.addHeader( p0, p1);
 }
@lombok.SneakyThrows
 public void setStatus(int p0) {
  impl.setStatus( p0);
 }
@lombok.SneakyThrows
 public void setStatus(int p0, String p1) {
  impl.setStatus( p0, p1);
 }
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
 public jakarta.servlet.ServletOutputStream getOutputStream() {
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
