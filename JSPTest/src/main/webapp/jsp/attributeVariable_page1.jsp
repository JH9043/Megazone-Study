<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	pageContext.setAttribute("page1 pageContext variable", "page1 pageContext value");
	request.setAttribute("page1 request variable", "page1 request value");
	application.setAttribute("이름", "김지형");
	application.setAttribute("")
	application.setAttribute("이름1", "김종학");
	application.setAttribute("page1 application variable", "page1 application value");
	
	out.print("page1 pageContext variable : " + pageContext.getAttribute("page1 pageContext variable") + "<br />" +
			"page1 request variable : " + application.getAttribute("이름") + "<br />" +
			"page1 session variable : " + application.getAttribute("이름1") + "<br />" +
			"page1 application variable : " + application.getAttribute("page1 application variable")
			);
	
	
%>