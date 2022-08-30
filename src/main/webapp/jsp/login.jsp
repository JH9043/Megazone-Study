<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<%
String id = (String) application.getAttribute("id");
String pwd = (String) application.getAttribute("pwd");
String name = (String) application.getAttribute("name");
String email = (String) application.getAttribute("email");
String tel = (String) application.getAttribute("tel");
%>
</head>
<body>
	<h1>로그인 페이지</h1>
	<fieldset>
		<legend>로그인</legend>
		<form action="Signin.jsp" method="post">
			아이디:<input type="text" name="id"><br />
			비밀번호:<input type="text" name="id"><br />
			<input type='submit' value='로그인'>
			<input type="submit" value="회원가입">
		</form>
		<table>
			<caption>가입한 회원정보</caption>
			<colgroup>
				<col width="100" />
				<col width="60" />
				<col width="60" />
				<col width="60" />
				<col width="60" />
			</colgroup>
			<thead>
				<tr>
					<th>이름</th>
					<th>ID</th>
					<th>Password</th>
					<th>email</th>
					<th>phone number</th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<th><%=name%></th>
					<th><%=id%></th>
					<th><%=pwd%></th>
					<th><%=email%></th>
					<th><%=tel%></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
			</tbody>
		</table>
	</fieldset>
</body>
</html>