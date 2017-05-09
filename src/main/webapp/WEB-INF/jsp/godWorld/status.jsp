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
	<p>基本属性/<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=350&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">普通属性</a>/<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=351&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">高级属性</a><br>
	&lt;<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=352&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">称号</a>&gt;${role.roleName }<br>
	性别:<c:if test="${role.sex==0 }">男</c:if><c:if test="${role.sex==1 }">女</c:if><br>
	等级:${role.lv }级/上限${role.lvTop }级<br>
	PK:关,PK点数:0<br>
	--<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=353&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">隐藏</a>--<br>
	<font color="green">体质:${role.vit }/上限:${role.vitTop }</font>&nbsp;&nbsp;<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=354&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50"><font color="red">+</font></a><br>
	<font color="green">力量:${role.str }/上限:${role.strTop }</font>&nbsp;&nbsp;<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=355&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50"><font color="red">+</font></a><br>
	<font color="green">敏捷:${role.agi }/上限:${role.agiTop }</font>&nbsp;&nbsp;<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=356&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50"><font color="red">+</font></a><br>
	<font color="green">智力:${role.zl }/上限:${role.zlTop }</font>&nbsp;&nbsp;<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=356&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50"><font color="red">+</font></a><br>
	总属性点:${role.vit+role.str+role.agi+role.zl }<br>
	<font color="red">未分配属性点:${role.freeProperty }</font><br>
	生命:${role.nowHp }/${role.hp }<br>
	内力:${role.nowMp }/${role.mp }<br>
	攻击力:${role.atk }<br>
	防御力:${role.def }<br>
	命中:${role.hit }<br>
	闪避:${role.evad }<br>
	暴击率:${role.crit }<br>
	幸运:${role.lk }<br>
	悟性:${role.iq }<br>
	经验:${role.exp }/${role.upExp }<br>
	银子:${role.gold }两<br>
	钱庄存款:0<br>
	负重:${fz}/${role.backpack }<br>
	仓库:0/1360<br>
	注入内力:<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=358&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">0</a><br>
	--------<br>
	<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=359&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">技能</a>|<a href="${pageContext.request.contextPath}/game/showBackpack?roleId=${role.id}">物品</a>|<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=35b&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">装备</a>|<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=35c&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">好友</a><br>
	<br>
	<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=35d&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">队友</a>|<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=35e&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">侠友</a>|<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=35f&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">吹牛</a><br>
	<br>
	|<a href="http://xxzgame7.yytou.com/gCmd.do?cmd=360&amp;sid=65z7wp3ilml5fi7zncd1sp&amp;gid=g50">友谊(0)</a>--------<br>
	<a href="${pageContext.request.contextPath}/game/toGameWorld?id=${role.id}">返回游戏</a><br>
	</p>
</body>
</html>