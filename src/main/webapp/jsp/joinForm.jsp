<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<jsp:useBean id="member" class="bean.Loginbean" scope="request"></jsp:useBean>
 	<jsp:setProperty name="member" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form name = "loginForm" action = "joinProc.jsp" method="post">
		아이디 : <input type="text" name = "id" size ="20"/><br/>
		패스워드 : <input type="password" name = "pwd" size ="20" /><br/>
		별칭 : <input type="text" name = "name" size ="20"/><br/>
		이메일 : <input type="text" name = "email" size ="20"/><br/>
		<input type="button" value= "가입하기"  onclick="submit()">
	</form>

</body>
</html>