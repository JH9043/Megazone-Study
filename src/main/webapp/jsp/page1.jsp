<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
System.out.println("page1 : request object : " + request);

request.setAttribute("page1Attr", request);
%>

page1
<br />


<jsp:forward page="page2.jsp">
	<jsp:param name="name" value="홍길동" />
	<jsp:param name="age" value="20" />
</jsp:forward>

page1 하단부
<!-- 이미 fowarding 됐기 때문에 의미 없는 코드 -->