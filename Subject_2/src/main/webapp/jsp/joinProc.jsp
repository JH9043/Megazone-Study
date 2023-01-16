<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="bean.Loginbean" scope="request"></jsp:useBean>
<jsp:setProperty name="member" property="*" />
<%
String userid = member.getId();
String userpwd = member.getPwd();
String username = member.getName();
String useremail = member.getEmail();


HttpSession s = request.getSession();
s.setAttribute("id", userid);
s.setAttribute("pwd", userpwd);
s.setAttribute("name", username);
s.setAttribute("email", useremail);
%>

<jsp:forward page="loginForm.jsp" />