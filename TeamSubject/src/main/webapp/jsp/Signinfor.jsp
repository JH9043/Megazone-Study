<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String id=request.getParameter("id");
   String pwd=request.getParameter("pwd");
   
   request.setAttribute("id", id);
   request.setAttribute("pwd", pwd);
%>
<jsp:forward page="Signin2.jsp" />