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
	<tr>
		<td></td>
		<td align="right">
		<input type="submit" value="注册  "/></td>
	</tr>
</table>

</form>
</body>
</html>