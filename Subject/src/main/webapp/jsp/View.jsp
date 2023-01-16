
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="bean.Productbean"%>
<%@ page import="java.util.*" %>
<jsp:useBean id="productBean" class="bean.Productbean" scope="application" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재고 관리 프로그램</title>
</head>
<body>
<% 
	String num = productBean.getNum();
	String name = productBean.getName();
	String date = productBean.getDate();
	String count = productBean.getCount();
	
%>
<h1>재고 관리 프로그램</h1><br /><br />
	<form>
		<input type = "button" name = "register" value = "제품 등록" onclick = "location.href='Register.jsp'" />
		<input type = "button" name = "refactor" value = "제품 수정" /> <br /><br />
		
		<table border ="1" style ="text-align : center">
		
		<%
		//Enumeration productNos = application.getAttributeNames();
		%>
			<tr>
				<td>제품번호</td>
				<td>제품명</td>
				<td>입고일</td>
				<td>제품수량</td>
				<td>재고 +</td>
				<td>재고 -</td>
			</tr>
			<% //while(productNos.hasMoreElements()){
// 				String productNo = (String)productNos.nextElement();
// 				Productbean productbean = null;
// 				if(application.getAttribute(productNo) instanceof Productbean){
// 					productbean = (Productbean)(application.getAttribute(productNo));
// 				}if(productbean != null){
					
// 				}
			
				%>
			<tr>
				<td><%=num%></td>
				<td><%=name%></td>
				<td><%=date%></td>
				<td><%=count%></td>
				<td><input type = "button" name = "plus" value = "+" onclick =""/></td>
				<td><input type = "button" name = "minus" value = "-" /></td>
			</tr>
<%-- 			<% --%>
			
<%-- 			%> --%>
		</table>
	</form>

</body>
</html>