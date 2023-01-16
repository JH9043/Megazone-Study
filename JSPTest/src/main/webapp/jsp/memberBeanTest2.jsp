<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="memberBean" class="beans.MemberBean" scope="request" />
<jsp:setProperty name="memberBean" property="*" />

<%
out.print(memberBean.getName()+"<br />"); 
out.print(memberBean.getAge()+"<br />");
out.print(memberBean.getTelnum()+"<br />");
%>

<%
//     	String data = request.getParameter("data");
//     	out.print(data);
%>