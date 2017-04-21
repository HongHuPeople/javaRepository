<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../base.jsp"%>
<title>创建角色</title>
</head>
<script type="text/javascript">
	function toCreateRole(){
		var roleName = $('#roleName').val();
		if(isNull(roleName)){
			$('#roleName').focus();
			swal({
				  title: "请输入角色名称",
				  timer: 1000,
				  showConfirmButton: false
			});
			return;
		}
		$.ajax({
			type : 'POST',//请求类型 post/get
			url : "${pageContext.request.contextPath}/gRole/createRole", //请求地址
			data : {
				"roleName" : roleName
			},//请求参数 此处是json格式
			dataType : 'json',//返回数据类型json/xml/text
			success : function(data) {//请求成功进这里  data是后台返回的参数
				if (data.code == 200) {
					swal({
						  title: "注册成功",
						  text: "Wait 2 seconds to enter the home page.",
						  imageUrl: "${pageContext.request.contextPath}/img/thumbs-up.jpg",
						  timer: 2000,
						  showConfirmButton: false
					});
					setTimeout(toRolePage,2000);
				} else {
					swal(data.msg);
				}
			},
			error : function(data) {//请求失败进这里
				swal("请求失败!");
			}
		});
		
		function toRolePage(){
			location.href = "${pageContext.request.contextPath}/gRole/toRolePage";
		}
	}
</script>
<body>
	<p>${user.name }您还没有角色,请先创建一个角色</p>
	请输入角色名称：<input type="text" id="roleName"><br>
	<button onclick="toCreateRole()">创建</button>
</body>
</html>