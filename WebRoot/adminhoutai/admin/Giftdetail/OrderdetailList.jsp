<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/ordetail.css" rel="stylesheet" type="text/css" />
<style type="text/css">
	
	.icon  {	
		border: solid 1px gray;
		text-align: center;	
	}
</style>
</head>

<body>


        
   <table width="100%" class="dd" cellpadding="0" cellspacing="0">
    <tr><td class="lef">订单编号：</td><td>${orderb.orderid}</td></tr>
    <tr><td class="lef">支付状态：</td><td><c:if test="${orderb.status=='Y'}">支付成功</c:if>
    	<c:if test="${orderb.status=='W'}"><a class="a" href="weizhif.action?orderid=${orderb.orderid}">未支付</a></c:if>
   </td></tr>
     <c:if test="${orderb.logistics!=null}">
    <tr><td class="lef">物流编号：</td><td>${orderb.logistics}</td></tr></c:if>
 
  </table>
        
        
        	<table width="100%" class="alls" cellpadding="0" cellspacing="0">
 
	<tr><td >名称</td><td class="name">数量</td><td>总价</td></tr>
		<c:forEach items="${orderdetails}" var="Orderdetail">
    	<tr><td ><a href="giftdetail.action?giftid=${Orderdetail.giftid}" class="a">  ${Orderdetail.giftname}</a></td><td class="name">${Orderdetail.number}</td><td>${Orderdetail.price}</td></tr>
	</c:forEach>
        <tr><td colspan="3" class="as">合计&nbsp;<span class="spa">${orderb.price}</span>元<br />本次交易成功可获赠<span class="spa"><fmt:parseNumber var="i" type="number" integerOnly="true"  value="${orderb.price}" /> ${i}</span>枚金元宝</td></tr>
    </table>
 
	<table width="100%" class="all" cellpadding="0" cellspacing="0" align="center">
            <tr><td class="fi" >收件人</td><td>${orderb.name}</td></tr>
             <tr><td class="fi">收件人电话</td><td>${orderb.phone}</td></tr>
              <tr><td class="fi">收件人地址</td><td>${orderb.address}</td></tr>  
    </table> 
   
</body>
</html>
