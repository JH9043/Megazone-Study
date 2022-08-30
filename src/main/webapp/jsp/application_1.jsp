<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String tel = request.getParameter("tel");

application.setAttribute("name", name);
application.setAttribute("email", email);
application.setAttribute("tel", tel);

String appid = (String) application.getAttribute("id");
String apppwd = (String) application.getAttribute("pwd");
String appname = (String) application.getAttribute("name");
String appemail = (String) application.getAttribute("email");
String apptel = (String) application.getAttribute("tel");

String[] user = { appid, apppwd, appname, appemail, apptel };


application.setAttribute("user", user );

%>
<jsp:forward page="login.jsp" />