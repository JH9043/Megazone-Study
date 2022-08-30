
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>

<%
for (int i=0;i<3;i++){
application.setAttribute("id"+i, "asd");
application.setAttribute("pwd"+i, "123");
application.setAttribute("name"+i, "김지형");
application.setAttribute("email"+i, "asdas@naver.com");
application.setAttribute("tel"+i, "010-2222-2222");

}

for(int i=0;i<3;i++){
	out.print("아이디 : " + application.getAttribute("id"+i) + "<br />" +
			"비밀번호 : " + application.getAttribute("pwd"+i) + "<br />" +
			"이름 : " + application.getAttribute("name"+i) + "<br />" +
			"이메일 : " + application.getAttribute("email"+i) + "<br />" +
			"전화번호 : " + application.getAttribute("tel"+i) + "<br /><br />"
			);
	
}
	




%>  