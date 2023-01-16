<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 Page.1</title>
</head>
<body>
         <h1>사용하실 아이디 와 비밀번호 를 입력하세요.</h1><br/>
         <form method="post" action="Signinfor.jsp">
         <strong>ID</strong>
         <br /><input id="id" type="text" name="id"><br />
         <strong>PASSWORD</strong><br />
         <input id="pwd" type="text" name="pwd"><br />
         <strong>PASSWORD 확인</strong><br />
         <input id="pwd" type="text" name="pwd"><br />
         <input type="submit" value="다음">
         </form>
         