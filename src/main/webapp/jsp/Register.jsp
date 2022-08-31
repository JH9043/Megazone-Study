<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="productBean" class="bean.Productbean" scope="application" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 등록</title>
</head>
<body>
	<header>제품 등록</header>
	<form name = "Register" action="Register2.jsp">
		제품 번호 : <input type="text" name="num"> <br />
		제품명 : <input type="text" name="name" /> <br />
		입고일시 : <input type="text" name="date" /> <br />
		재고수량 : <input type="text" name="count" /> <br />
		<input type = "button" name = "realregister" value ="제품 등록하기" onclick ="submit()"/>
	</form>
<%	
	String num = (String)application.getAttribute("num");
	String name = (String)application.getAttribute("name");
	String date = (String)application.getAttribute("date");
	String count =(String)application.getAttribute("count");
	productBean.setNum(num);
	productBean.setName(name);
	productBean.setDate(date);
	productBean.setCount(count);
	
	
	
%>
	


</body>
</html>