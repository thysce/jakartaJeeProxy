package org.thysce.jakartajeeproxy;

@JakartaJeeProxy( proxyFor = "javax.servlet.http.HttpServletRequest", proxyOf = "jakarta.servlet.http.HttpServletRequest" )
public class HttpRequest {

}
