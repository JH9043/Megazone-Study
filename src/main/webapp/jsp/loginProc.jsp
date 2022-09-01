<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String idParam = request.getParameter("id");
String pwdParam = request.getParameter("pwd");


HttpSession s = request.getSession();
if (s!=null){
String useridSess = (String)s.getAttribute("id");
String userpwdSess = (String)s.getAttribute("pwd");
String usernameSess = (String)s.getAttribute("name");
	if(!useridSess.equals(idParam) || !userpwdSess.equals(pwdParam)){
		out.print("로그인에 실패하였습니다! <a href='#' onclick='history.back();'>로그인 화면으로 가기</a>");
	} else {
		out.print(usernameSess + " 님이 로그인 하셨습니다!");
		out.print("<a href='logoutProc.jsp'>[로그아웃]</a>");
	}
}
%>