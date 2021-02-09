package com.timtrense.jakartajeeproxy;

import org.thysce.jakartajeeproxy.JakartaJeeProxy;

@JakartaJeeProxy(proxyFor = "jakarta.servlet.http.Cookie", proxyOf="javax.servlet.http.Cookie")
class jakarta_servlet_http_CookieProxyDeclaration{}
