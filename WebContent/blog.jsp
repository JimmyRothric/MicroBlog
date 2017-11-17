<%@ page import="Demo.*" %>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blog</title>
</head>
<body>
<%	if (session == null || session.getAttribute("loggedin") == null) {
	//check if user has logged in
%>	
	<jsp:forward page="login.jsp"></jsp:forward>
<%
		return;
	}
%>
<form action="BlogServlet" method="post">
<div style="float:right">${username}</div>

<input type="text" name="message" style="height:25px;width:400px"/>

<input type="submit" name="SendBtn" value="发送 "/><p>
<%
	Boolean sent = (Boolean)session.getAttribute("SendBtn");
	if (sent != null && sent.booleanValue()) {
		session.setAttribute("SendBtn", new Boolean(false));
	}
%>
<%
	ArrayList<Message> message = (ArrayList<Message>)application.getAttribute("messageList");
	if (message != null) {
		for (Message m:message){
			out.print("<pre>" + m.printMessage() + "</pre>");
		}
	} else {
		return;
	}
	
%>

</form>
</body>
</html>