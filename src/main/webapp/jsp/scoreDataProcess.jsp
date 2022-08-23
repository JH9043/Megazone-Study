<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String responseText = request.getParameter("responseText");
	String st[] = responseText.split(",");
	int engTotal = 0;
	int mathTotal = 0;
	
	for (int i = 0; i<st.length; i++){
		if (i%3==1){
			engTotal += Integer.parseInt(st[i]);
		}
		else if(i%3==2){
			mathTotal += Integer.parseInt(st[i]);
		}
	}
	out.print(engTotal+","+mathTotal);


%>