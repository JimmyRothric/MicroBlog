<%@ page import="Demo.*" %>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Content</title>
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
<div style="float:right">${username}<br/>
<input type="button" name="backBtn" value="返回首页" onclick = "this.form.action='blog.jsp';this.form.submit()"/>
</div>
<%
	Integer num = (Integer)session.getAttribute("num");
	ArrayList<Message> messageList = (ArrayList<Message>)application.getAttribute("messageList");
	if (messageList != null) {
		int n = num.intValue();
		out.print(messageList.get(n).getMessage());
	}
%>
<form action="BlogServlet" method="post">

<input type="submit" name="" value="评论">

</form>
</body>
</html>