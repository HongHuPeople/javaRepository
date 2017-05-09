<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String frontPath = path + "";
	String gyTitle = new String("神の世界".getBytes("ISO8859-1"));
	
	java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	java.util.Date currentTime = new java.util.Date();//得到当前系统时间
	String str_date1 = formatter.format(currentTime); //将日期时间格式化 
	String str_date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式 
%>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sweetalert.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/allCSS.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/sweetalert.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/base.js"></script>
