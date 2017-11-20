<%@ page import="Demo.*" %>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Integer num = (Integer)session.getAttribute("num");
	ArrayList<Message> messageList = (ArrayList<Message>)application.getAttribute("messageList");
	if (messageList != null) {
		int n = num.intValue();
		out.print(messageList.get(n).getMessage());
		
	}
%>
</body>
</html>