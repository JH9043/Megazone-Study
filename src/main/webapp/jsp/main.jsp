<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:include page="jspf/top.jsp" flush="false">
	<jsp:param name="name" value="홍길동" />
	<jsp:param name="age" value="20" />
</jsp:include>

<%-- <%@ include file="jspf/top.jsp" %> //코드만 갖고 온다 --%>

<%
//int topInt = 1000; //include 디렉티브 사용시만 가능
%>

<br />
<br />
<br />
main.jsp
<br />
<br />
<br />
<jsp:include page="jspf/bottom.jsp" flush="false" />

<%-- <%@ include file="jspf/bottom.jsp" %> --%>