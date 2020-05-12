<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration<String> sessVars=session.getAttributeNames();
		boolean flag=false;
		while(sessVars.hasMoreElements()){
			if(sessVars.nextElement().equals("num")){
				flag=true;
				break;
			}
		}
		if(flag){
			int number=(int)session.getAttribute("num");
			if(number%5==0)
				out.println("The last number(entered) "+number+" is divisible by 5");
			else
				out.println("The last number(entered) "+number+" is not divisible by 5");
		}
	%>
	
	<form action="InputValidation.jsp" method="post">
		Enter a multiple of 5:<input type="text" name="num"><br>
		<input type="submit">
	</form>
</body>
</html>