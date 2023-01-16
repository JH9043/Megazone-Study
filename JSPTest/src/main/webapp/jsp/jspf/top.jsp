<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name")==null ? "" : request.getParameter("name");
	String age = request.getParameter("age")==null ? "" : request.getParameter("age");
	out.print("name = " + name + ", age = "+age+"<br />");
%>

<br />
<br />
<br />
top.jsp
<br />
<br />
<br />

<%
int topInt = 100;
%>