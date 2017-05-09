<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sweetalert.css">
<script src="${pageContext.request.contextPath}/js/sweetalert.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/base.js"></script>
<title>注册</title>
<script type="text/javascript">
	$(function(){
		swal({
			  title: " Hey Gay ! ",
			  text: "Wait 2 seconds to enter the home page.",
			  imageUrl: "${pageContext.request.contextPath}/img/thumbs-up.jpg",
			  timer: 2000,
			  showConfirmButton: false
		});		
	});
	
	function signUp(){
		var username = $('#username').val();
		var password = $('#password').val();
		var phone = $('#phone').val();
		var name = $('#name').val();
		var age = $('#age').val();
		var sex = $("input[name='sex']:checked").val();
		
		if(isNull(username)){
			$('#username').focus();
			swal({
				  title: "请输入用户名",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(password)){
			$('#password').focus();
			swal({
				  title: "请输入密码",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(phone)){
			$('#phone').focus();
			swal({
				  title: "请输入号码",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(name)){
			$('#name').focus();
			swal({
				  title: "请输入姓名",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(age)){
			$('#age').focus();
			swal({
				  title: "请输入年龄",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(sex)){
			swal({
				  title: "请选择性别",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		
		$.ajax({
			type : 'POST',//请求类型 post/get
			url : "${pageContext.request.contextPath}/user/signUp", //请求地址
			data : {
				"username" : username,
				"password" : password,
				"phone" : phone,
				"name" : name,
				"age" : age,
				"sex" : sex,
			},//请求参数 此处是json格式
			dataType : 'json',//返回数据类型json/xml/text
			success : function(data) {//请求成功进这里  data是后台返回的参数
				if (data.code == 200) {
					swal({
						  title: data.msg,
						  text: "Wait 2 seconds to enter the home page.",
						  imageUrl: "${pageContext.request.contextPath}/img/thumbs-up.jpg",
						  timer: 2000,
						  showConfirmButton: false
					});
					setTimeout(toSignInPage,2000);
				} else {
					swal(data.msg);
				}
			},
			error : function(data) {//请求失败进这里
				swal("请求失败!");
			}
		});
	}
	
	function toSignInPage(){
		location.href = "signIn.jsp";
	}
</script>
</head>
<body>
	<center>
		帐号：<input type="text" id="username"><br>
		密码：<input type="password" id="password"><br>
		号码：<input type="text" id="phone"><br>
		姓名：<input type="text" id="name"><br>
		年龄：<input type="text" id="age"><br>
		性别：男<input type="radio" checked="checked" name="sex" value="0"> 女<input type="radio" name="sex" value="1"><br>
		<button onclick="signUp()">注册</button>
	</center>
</body>
</html>