<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form action="Register" method="post">
<div style="float:right">
<input type="button" value="返回 " onclick = "this.form.action='login.jsp';this.form.submit()"/>
</div>
<table>
	<tr>
		<td>用户名：</td>
		<td><input type="text" name="username"/></td>
	</tr>
	<tr>
		<td>设置密码：</td>
		<td><input type="password" name="password0"/> </td>
	</tr>
	<tr>
		<td>确认密码：</td>
		<td><input type="password" name="password1"/> </td>
	</tr>
</table>
<input type="submit" value="注册 " style="width:252px;height:30px;"/>
</form>

<%	
	String registerInfo0 = (String)request.getAttribute("registerError0");
	String registerInfo1 = (String)request.getAttribute("registerError1");
	if (registerInfo0 != null) {
	%>	
	<script language="javascript">
		alert("<%=registerInfo0%>");
	</script>
<%
	} else if (registerInfo1 != null){
%>
	<script language="javascript">
		alert("<%=registerInfo1%>");
	</script>
<%
	} else {
		return;
	}
%>
</body>
</html>