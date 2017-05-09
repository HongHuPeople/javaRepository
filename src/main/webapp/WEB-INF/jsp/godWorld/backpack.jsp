<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../base.jsp"%>
<title><%=gyTitle%></title>
<style type="text/css">
</style>
</head>
<body>
	<p>[我的物品]<br/>
	银两:${role.gold }两<br/>
	负重:${fz}/${role.backpack }<br/>
	仓库:0/1360<br/>
	<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&type=1">装备</a> <a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&type=0">药品</a> <a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&type=2">其它</a><br/>
	你身上有物品:<br/>
	<c:forEach items="${page.list }" var="list" varStatus="status">
		<a href="${pageContext.request.contextPath}/game/showGoodsDetil?id=${list.id }&thisPage=${page.thisPage}">${page.startRow+status.index+1 }.${list.goodsId.name }x${list.num }</a>&nbsp;<a href="${list.id }">使用</a><br/>
	</c:forEach>
	<!-- 分页 START -->
	<c:if test="${page.thisPage>2 }">
		<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&thisPage=1">首页</a>
	</c:if> 
	<c:if test="${page.thisPage>1 }">
		<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&thisPage=${page.thisPage-1}">上页</a>
	</c:if>
	<c:if test="${page.totalPage>0 }">
		${page.thisPage }/${page.totalPage } 
	</c:if> 
	<c:if test="${page.thisPage<page.totalPage }">
		<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&thisPage=${page.thisPage+1}">下页</a>
	</c:if> 
	<c:if test="${page.totalPage-page.thisPage>=2 }">
		<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}&thisPage=${page.totalPage}">末页</a>
	</c:if> <br/>
	<!-- 分页 END -->
	<a href="gCmd.do?cmd=40&amp;sid=mqvrwg3ioabdiv8jt7z4da&amp;gid=g50">我的摊位</a><br/>
	----------<br/>
	<a href="gCmd.do?cmd=41&amp;sid=mqvrwg3ioabdiv8jt7z4da&amp;gid=g50">我的装备</a><br/>
	<a href="${pageContext.request.contextPath}/gRole/toStatus?id=${role.id}">我的状态</a><br/>
	<a href="${pageContext.request.contextPath}/game/toGameWorld?id=${role.id}">返回游戏</a><br/>
	</p>
</body>
</html>