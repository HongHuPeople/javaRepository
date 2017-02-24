<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../lib/jquery-3.1.1.js"></script>
<title>登录</title>
<script type="text/javascript">
	function toLogin(){
		var uName = $('#userName').val();
		alert(uName);
	}
</script>
</head>
<body>
	userName:<input type="text" id="userName"><br>
	password:<input type="password" id="password">
	<button onclick="toLogin()"></button>
</body>
</html>