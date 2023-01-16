<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<jsp:useBean id="productBean" class="bean.Productbean" scope="application" />
<jsp:setProperty name="productBean" property="*" />

<jsp:forward page="View.jsp" />