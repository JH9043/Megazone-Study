<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="memberBean1" class="beans.MemberBean" scope="request" />
<jsp:useBean id="memberBean2" class="beans.MemberBean" scope="request" />

<jsp:setProperty name="memberBean1" property="name" value="홍길동" />
<jsp:getProperty name="memberBean1" property="name" /><br /><br />

<jsp:setProperty name="memberBean2" property="name" value="홍길동" />
<jsp:getProperty name="memberBean2" property="name" />
<br /><br />
<a href = "memberBeanTest2.jsp?name=john&age=100&telnum=01000000000"> 눌러주세요! </a>

<%
// memberBean.setName("홍길동");
// out.print("성명 : " + memberBean.getName());
%>