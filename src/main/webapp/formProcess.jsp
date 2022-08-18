<%@page pageEncoding="utf-8" %>
<%
	String txt =request.getParameter("txt"); //서버에 보낸 데이터 : 파라미터
	String txt2 = request.getParameter("txt2");
	out.print("합은 : " + (Integer.parseInt(txt) + Integer.parseInt(txt2)));
%>