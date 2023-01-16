<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="24kb" autoFlush="true" %>

<%
	for (int i=0; i<30000000; i++){
		out.write("A"); //버퍼에 출력
	}
	out.flush(); //버퍼 내의 데이터를 요청 측에 전송
%>