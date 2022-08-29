<%@ page language="java" contentType="text/xml; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="score.ScoreProcess" %>

<%
int studentCount = 3;
final String[] studentNames = new String[studentCount];
studentNames[0] = "홍길동";
studentNames[1] = "이순신";
studentNames[2] = "강감찬";

final int[] korScores = new int[studentCount];
korScores[0] = 60;
korScores[1] = 40;
korScores[2] = 90;
final int[] engScores = new int[studentCount];
engScores[0] = 60;
engScores[1] = 40;
engScores[2] = 90;
final int[] mathScores = new int[studentCount];
mathScores[0] = 60;
mathScores[1] = 40;
mathScores[2] = 90;
final int[] scoreTotals = new int[studentCount];


for (int i = 0; i < studentCount; i++){
	scoreTotals[i] = ScoreProcess.getTotal(korScores[i], engScores[i], mathScores[i]);
}
%>

<students>
<% for (int i = 0; i < studentCount; i++) { %>
	<student>
		<name><%=studentNames[i]%></name>
		<kor><%=korScores[i]%></kor>
		<eng><%=engScores[i]%></eng>
		<math><%=mathScores[i]%></math>
		<total><%=scoreTotals[i]%></total>
	</student>
<% } %>
</students>
