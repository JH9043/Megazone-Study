<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String nameParamValue = URLEncoder.encode("홍길동","utf-8");
%>

<a href="/JSPTest/jsp/HeaderInfo.jsp?name=<%=nameParamValue%>">눌러보세요!</a> <!-- 
													주소를 적었기 때문에 서버에서 pageEncoding으로 인코딩한다-->

	<%= request.getParameter("name") %>
	<%= request.getCharacterEncoding() %><br />
	<%= request.getContentLength() %><br />
	<%= request.getContentType() %><br />
	<%= request.getContextPath() %><br />
	<%= request.getLocalAddr( )%><br />
	<%= request.getMethod() %><br />
	<%= request.getRemoteAddr() %><br />
	<%= request.getRequestURI() %><br />
	<%= request.getRequestURL() %>

</body>
</html>