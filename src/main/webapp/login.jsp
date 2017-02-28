<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
<title>登录</title>
<script type="text/javascript">
	function toLogin(){
		var uName = $('#userName').val();
		var pwd = $('#password').val();
		$.ajax({ 
			type:'POST',
			url: "${pageContext.request.contextPath}/user/login", 
			data:{"userName":uName,"password":pwd},
			dataType:'json',
			success: function(data){
				if(data.code==200){
					alert(data.msg);
					location.href="${pageContext.request.contextPath}/user/showUser";
				}else{
					alert(data.msg);
				}
	      	},
	      	error:function(data){
	      		alert(222);
	      	}
		});
	}
</script>
</head>
<body>
	userName:<input type="text" id="userName"><br>
	password:<input type="password" id="password">
	<button onclick="toLogin()">LOGIN</button>
</body>
</html>