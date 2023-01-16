<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="member" class="bean.Loginbean" scope="request"></jsp:useBean>
 	<jsp:setProperty name="member" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form name = "loginForm" action = "loginProc.jsp">
		아이디 : <input type="text" name = "id" size ="20"/><br/><br/>
		패스워드 : <input type="password" name = "pwd" size ="20" /><br/><br/>
		<input type="button" value= "로그인"  onclick="submit()">
		<input type="button" value= "회원가입"  onclick="location.href='joinForm.jsp'">

	</form>
</body>
</html>