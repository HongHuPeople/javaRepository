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
	<p>维护公告一</p>
	<p>维护公告二</p>
	<p>维护公告三</p>
	<p><a href="${pageContext.request.contextPath}/game/toGameWorld?id=${role.id}">进入</a></p>
</body>
</html>