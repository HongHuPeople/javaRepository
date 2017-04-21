<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="base.jsp"%>
<title>主页</title>
<style type="text/css">
.nav ul {
	margin: 0px auto;
	height: 38px;
	padding: 0;
}

.nav ul li {
	float: left;
	list-style-type: none;
}

.nav ul li a {
	width: 80px;
	height: 28px;
	line-height: 28px;
	background: red;
	color: #FFF;
	margin: 5px 10px;
	font-size: 12px;
	display: block;
	text-align: center;
	text-decoration: none;
}

.nav ul li a:hover {
	width: 78px;
	height: 26px;
	line-height: 28px;
	border: 1px solid red;
	color: red;
	background: #FFF;
}
</style>
<script type="text/javascript">
	$(function(){
		swal({
			  title: "Welcome My World !",
			  text: "Wait 2 seconds to enter the home page.",
			  imageUrl: "${pageContext.request.contextPath}/img/thumbs-up.jpg",
			  timer: 2000,
			  showConfirmButton: false
		});
	});
</script>
</head>
<body>
	<div class="nav">
		<center>
			<ul>
				<li><a href="#">首页</a></li>
				<li><a href="#">导航1</a></li>
				<li><a href="#">导航2</a></li>
				<li><a href="#">导航3</a></li>
				<li><a href="#">导航4</a></li>
				<li><a href="${pageContext.request.contextPath}/gRole/toRolePage">神的世界</a></li>
				<li><a href="#">导航6</a></li>
			</ul>
		</center>
	</div>
</body>
</html>