<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String responseText = request.getParameter("responseText");
	String st[] = responseText.split(",");
	int engTotal = 0;
	int mathTotal = 0;
	//
// 	int studentCount = 3;
// 	int subjectCount = 2;
// 	int[] studentsTotal = new int[studentsCount];
// 	float[] studentsAvg = new float[studentsCount];
// 	DecimalFormat df = new DecimalFormat("##.00");
	
// 	for (int i =0; i<strArr.length; i++){
// 		if (i%studentsCount ==0){
// 			studentsTotal[(int)i/studentsCount] = Integer.parseInt(strArr[i+1]) + Integer.parseInt(strArr[i+2]);
// 			studentsAvg[(int)i/studentCount] = studentsTotal[(int)i/studentsCount] / subjectCount;
// 			studentsAvgStr[(int)i/studentsCount] = df.format((double)(studentsAvg[(int)i/studentsCount]));
// 		}
// 	}
	
	for (int i = 0; i<st.length; i++){
		if (i%3==1){
			engTotal += Integer.parseInt(st[i]);
		}
		else if(i%3==2){
			mathTotal += Integer.parseInt(st[i]);
		}
	}
	
// 	for (int i = 0; i<st.length; i++){
// 		if (i%3==1){
// 			subTotal = Integer.parseInt(st[i]) + Integer.parseInt(st[i+1])
		
// 		}
// 	}
	
	
	out.print(engTotal+","+mathTotal);


%>