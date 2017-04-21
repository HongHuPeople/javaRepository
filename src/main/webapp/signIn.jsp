<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sweetalert.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/signInPage.css">
<script src="${pageContext.request.contextPath}/js/sweetalert.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/base.js"></script>

<title> Hong Hu </title>
<style media="screen">
</style>
<script type="text/javascript">
	function toLogin() {
		var uName = $('#username').val();
		var pwd = $('#password').val();
		if(isNull(uName)){
			$('#username').focus();
			swal({
				  title: "请输入用户名",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		if(isNull(pwd)){
			$('#password').focus();
			swal({
				  title: "请输入密码",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		$.ajax({
			type : 'POST',//请求类型 post/get
			url : "${pageContext.request.contextPath}/user/signIn", //请求地址
			data : {
				"userName" : uName,
				"password" : pwd
			},//请求参数 此处是json格式
			dataType : 'json',//返回数据类型json/xml/text
			success : function(data) {//请求成功进这里  data是后台返回的参数
				if (data.code == 200) {
					swal({
						  title: "登录成功!",
						  text: "Wait 2 seconds to enter the home page.",
						  imageUrl: "${pageContext.request.contextPath}/img/thumbs-up.jpg",
						  timer: 2000,
						  showConfirmButton: false
					});
					setTimeout(toHomePage,2000);
				} else {
					swal(data.msg);
				}
			},
			error : function(data) {//请求失败进这里
				swal("请求失败!");
			}
		});
	}
	
	function toHomePage(){
		location.href = "${pageContext.request.contextPath}/user/homePage";
	}
	//登录回车事件
	$(document).keydown(function(e){
		if(e.keyCode == 13) {
			var h = $("#signInDiv").is(":hidden");
			if(!h){
				toLogin();
			}
		}
	});
	
	//关于我们
	function aboutUs(){
		swal("洪湖水浪打浪");
	}
	//显示登录框  让用户名框获取焦点
	function showSignInDiv(){
		$('#signInDiv').show();
		$('#username').focus();
	}
	//首页==刷新页面
	function reloadPage(){
		location.reload();
	}
</script>
</head>
<body>
	<div class="all">
		<div class="top">
			<div class="top_right">
				<a href="#" onclick="reloadPage()">首页</a>丨<a href="#" onclick="showSignInDiv()">登陆</a>丨<a href="signUp.jsp">注册</a>丨<a href="#" onclick="aboutUs()">关于我们</a>
			</div>
		</div>
		<div class="content">
			<div class="content_center" align="center">
			</div>
			<div class="content_right">
				<div id="signInDiv" class="content_signIn" align="center">
					<p>
						帐 号: <input type="text" id="username" autocomplete="off">
					</p>
					<p>
						密 码: <input type="password" id="password" autocomplete="off">
					</p>
					<button onclick="toLogin()"> 登录 </button>
				</div>
			</div>
		</div>
		<div class="bottom">
			<div class="bottom_left">
			</div>
			<div class="bottom_center">
			</div>
			<div class="bottom_right">
			</div>
		</div>
	</div>
</body>
</html>