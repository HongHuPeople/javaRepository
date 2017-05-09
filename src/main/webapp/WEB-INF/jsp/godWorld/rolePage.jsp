<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../base.jsp"%>
<title><%=gyTitle%></title>
</head>
<body>
	<c:forEach var="role" items="${roleList }">
		<p>角色：${role.roleName}&nbsp;&nbsp;&nbsp;&nbsp;等级：${role.lv}&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/game/toNoticePage?id=${role.id}">进入</a></p>
	</c:forEach>
</body>
</html>