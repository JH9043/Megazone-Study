<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name = "loginForm" action = "loginProc.jsp" method="post">
	ID : <input type = "text"  name = "userid" size = "20" /> <br/>
	PWD : <input type = "password"  name = "userpwd" size = "20" /> <br/>
	<button onclick="this.form.submit();">로그인</button>
</form>

</body>
</html>