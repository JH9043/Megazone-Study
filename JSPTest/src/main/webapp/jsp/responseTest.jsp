<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Collection" %>
<%
	//out.write(""); out.flush();
	out.print(response.getBufferSize()+"<br />");
	out.print(response.getCharacterEncoding()+"<br />");
	out.print(response.getContentType()+"<br />");
	out.print(response.getStatus()+"<br />");
	
	Collection collection = response.getHeaderNames();
	System.out.println(collection.size()); //System.out.println 여기서는 콘솔에 찍힌다
	Iterator it = collection.iterator();
	while (it.hasNext()){
		String headerName = (String)it.next();
		out.print(headerName + "=" + response.getHeader(headerName) + "<br />");
	}
	
// 	out.print(response.set+"<br />");
	
	
%>
