
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<link href="<%=path%>/AppWeb/css/styles.css" rel="stylesheet" type="text/css">
<%-- <link href="<%=path%>/AppWeb/css/my.css" rel="stylesheet" type="text/css"> --%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的账号</title>
</head>

<body>
<%@ include file="heart.jsp" %>
   <div class="banner"><img src="<%=path%>/images/my-account.png"></div>

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
        <tr><td><div class="fl title">可查看的险种</div></td><td><div class="fr attribute"><c:if test="${myUser.xianzhong==null}">无</c:if><c:if test="${myUser.xianzhong!=null}">${myUser.xianzhong}</c:if></div></td></tr>
        <tr><td><div class="fl title">险种所属公司</div></td><td><div class="fr attribute"><c:if test="${myUser.xianzhonggs==null}">无</c:if><c:if test="${myUser.xianzhonggs!=null}">${myUser.xianzhonggs}</c:if></div></td></tr>
        <tr><td><div class="fl title">金元宝枚数</div></td><td><div class="fr attribute">${myUser.gold}</div></td></tr>
 	</table>
 <%@ include file="foot.jsp"%>
</body>
</html>
