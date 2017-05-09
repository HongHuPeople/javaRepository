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
	<p>[我的物品]<br/>
	${backpack.goodsId.name }x${backpack.num }<br/>
	简介：${backpack.goodsId.description }<br/>
	重量:${backpack.goodsId.weight }<br/>
	类别:<c:if test="${backpack.goodsId.type==0 }">药品</c:if><c:if test="${backpack.goodsId.type==1 }">装备</c:if><c:if test="${backpack.goodsId.type==2 }">其它</c:if><br/>
	${showDetil }<br/>
	<a href="gCmd.do?cmd=7c&amp;sid=um3u373iofs4l98jxveorx&amp;gid=g50">使用</a> <a href="gCmd.do?cmd=7d&amp;sid=um3u373iofs4l98jxveorx&amp;gid=g50">丢弃</a> <a href="gCmd.do?cmd=7e&amp;sid=um3u373iofs4l98jxveorx&amp;gid=g50">丢弃全部</a><br/>
	<a href="gCmd.do?cmd=7f&amp;sid=um3u373iofs4l98jxveorx&amp;gid=g50">挂出销售</a><br/>
	----------<br/>
	<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${backpack.roleId}&thisPage=${thisPage}">返回列表</a><br/>
	<a href="gCmd.do?cmd=81&amp;sid=um3u373iofs4l98jxveorx&amp;gid=g50">我的装备</a><br/>
	<a href="${pageContext.request.contextPath}/game/toGameWorld?id=${backpack.roleId}">返回游戏</a><br/>
	</p>
</body>
</html>