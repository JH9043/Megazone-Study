<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 페이지 지시자 : 이 안의 코드 Language는 JAVA를 사용한다라는 것 알려준다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "안녕! JSP!" %> <br />
<% 
	int i = 0;
	out.print("Hello JSP!" + i); %>

</body>
</html>