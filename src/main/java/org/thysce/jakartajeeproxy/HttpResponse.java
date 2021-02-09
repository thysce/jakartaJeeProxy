package org.thysce.jakartajeeproxy;

@JakartaJeeProxy( proxyFor = "javax.servlet.http.HttpServletResponse", proxyOf = "jakarta.servlet.http.HttpServletResponse" )
public class HttpResponse {

}
