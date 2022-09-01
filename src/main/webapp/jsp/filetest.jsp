<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.File" %>
    <%@ page import = "java.io.Writer/*" %>
<%
	// JSON 파일 객체 (실제 파일이 아님)
	File jsonFile = new File("C:/eclipse_workspace/Subject2/src/main/webapp/json/members.json");
	// 파일이 있으면
	if (jsonFile!=null){
		if (jsonFile.exists()){
			
		} else {
			//없으면 새로 파일을 만들어라
			jsonFile.createNewFile();
		}
	}
	
	// JSON 파일에 데이터를 문자단위로 쓰는 스트림 (버퍼림 적용)
	BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile));