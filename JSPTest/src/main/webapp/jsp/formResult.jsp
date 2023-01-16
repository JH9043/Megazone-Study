<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name") == null ? "" : request.getParameter("name");
	//널값 방지용으로 삼항 연산자 사용
	%>

	<%=request.getMethod()%><br />
	name = <%=name%>

</body>
</html>