<%@ page contentType="text/html; charset=UTF-8" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%@ include file="../../common/head.jsp"%>

<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
	 	<link href="<%=path %>/Css/myuser.css" rel="stylesheet" type="text/css">
  		
<title>百宝箱首页</title>
</head>

<body>
  <%@ include file="heart.jsp" %>
 
  		<div class="banner" style="width:100%; height:360px; background-image:url(../../images/my-account-number-bg.png) "><img src="<%=path %>/images/my-account.png"></div>
   		
	<table class="sheet" cellpadding="0" cellspacing="0"> 
        <tr><td><div class="fl title">我的帐号</div></td><td><div class="fr attribute">${myUser.userid}</div></td></tr>
        <tr><td><div class="fl title">激活状态</div></td><td><div class="fr attribute">
        <c:if test="${myUser.status=='weijihuo'}">未激活</c:if>
        <c:if test="${myUser.status=='jihuo'}">已激活</c:if>
        <c:if test="${myUser.status=='dongjie'}">已冻结</c:if>
       <c:if test="${myUser.status=='zhuxiao'}">已注销</c:if>
     
        </div></td></tr>
        <tr><td><div class="fl title">激活日期</div></td><td><div class="fr attribute">${myUser.renewaltime}</div></td></tr>
        <tr><td><div class="fl title">使用剩余天数</div></td><td><div class="fr attribute">${myUser.day}</div></td></tr>
        <tr><td><div class="fl title">可查看的险种</div></td><td><div class="fr attribute">${myUser.xianzhong}</div></td></tr>
        <tr><td><div class="fl title">险种所属公司</div></td><td><div class="fr attribute">${myUser.xianzhonggs}</div></td></tr>
        <tr><td><div class="fl title">金元宝枚数</div></td><td><div class="fr attribute">${myUser.gold}</div></td></tr>
 	</table>
   		
   
     <%@ include file="foot.jsp"%>
    
</body>
</html>
