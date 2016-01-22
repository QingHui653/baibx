<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/mingp.css" rel="stylesheet" type="text/css" />
<title>个人名片</title>
<style type="text/css">
.ia{text-decoration: none;color:white}
</style>
</head>

<body>
<c:if test="${userb.type=='user'}">
	<table width="100%" height="100%" >
	<table class="all">
    	<tr><td><img src="<%=urlx%>${userb.heart}" width="70%"  height="137px"/></td></tr>
        <tr><td>${userb.name}</td></tr>
		<tr><td class="cc"><a href="tel:${userb.phone}" class="ia">${userb.phone}</a></td></tr>  
        <tr><td>百宝箱认证保险代理人</td></tr>
     </table>
     <table class="xxi" cellspacing="0"  cellpadding="0">
     	<tr><td colspan="2" class="renz">认证信息</td></tr>
     	<tr><td width="26%">保险公司:</td><td width="80%" >${userb.insurer}</td></tr>
            <tr><td width="26%">所属公司:</td><td width="80%">${userb.company}</td></tr>
        <tr><td width="26%">目前职位:</td><td width="80%">${userb.position}</td></tr>
        <tr><td width="26%">员工工号:</td><td width="80%">${userb.employeenumber}</td></tr>
     	<tr><td width="26%">公司地址:</td><td width="80%">${userb.address}</td></tr>
     </table>
     
    <table class="zhengs" cellspacing="0"  cellpadding="0" width="100%">
    
    <c:if test="${userb.honorphotos!=null}">
    <c:set value="${fn:split(userb.honorphotos,'|') }" var="ps"></c:set>
 		
   	 <tr><td colspan="2" class="renz">证书与风采展示</td></tr>
   	 <c:forEach items="${ps}" var="s">
     	<tr><td class="zshu"><img src="<%=urlx%>${s}" width="70%" height="137px" /></td></tr>
     </c:forEach>
     </c:if>	
        <%-- <tr><td class="zshu"><img src="<%=path%>/adminhoutai/admin/images/tub.png" /></td></tr>
        <tr><td class="zshu"><img src="<%=path%>/adminhoutai/admin/images/tub.png" /></td></tr>
        <tr><td class="zshu"><img src="<%=path%>/adminhoutai/admin/images/tub.png" /></td></tr>
         --%>
     </table>
   
</table>
</c:if>
</body>
</html>

