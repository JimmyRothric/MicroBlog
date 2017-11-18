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

<div style="float:right">${username}<br/>
<input type="button" name="LogoffBtn" value="注销 " onclick = "this.form.action='login.jsp';this.form.submit()"/>
</div>

<table>
	<tr>
		<td><textarea name="title" style="height:30px;width:400px"/></textarea></td>
	</tr>
	<tr>
		<td><textarea name="content" style="height:100px;width:400px"/></textarea></td>
	</tr>
	<tr>	
		<td align="right"><input type="submit" name="SendBtn" value="发送 "/></td>
	</tr>
</table>
<%
	ArrayList<Message> message = (ArrayList<Message>)application.getAttribute("messageList");
	if (message != null) {
		for (Message m:message){
			out.print("<b>" + m.getUserName()+ "</b>\t<small>" + m.getTime() + "</small>");
			out.print("<br/><big><pre>" + m.getTitle() + "</pre></big><br/>");
		}
	} else {
		return;
	}
	
%>

</form>
</body>
</html>