<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/quer.css" rel="stylesheet" type="text/css" />

</head>

<body>
          <table width="100%" class="all" cellpadding="0" cellspacing="0" align="center">
            <tr><td class="fi" >收件人</td><td>${orderb.name}</td></tr>
             <tr><td class="fi">收件人电话</td><td>${orderb.phone}</td></tr>
              <tr><td class="fi">收件人地址</td><td>${orderb.address}</td></tr>
            
    </table>
	<table width="100%" class="alls" cellpadding="0" cellspacing="0">
	<tr><td >名称</td><td class="name">数量</td><td>总价</td></tr>
	<c:forEach items="${orderdetails}" var="orderdetails">
   <tr><td ><a href="giftdetail.action?giftid=${orderdetails.giftid}" style="text-decoration: none; color:#F00"> ${orderdetails.giftname }</a></td><td class="name">${orderdetails.number }</td><td>${orderdetails.price}</td></tr>
	</c:forEach>
    	
        <tr><td colspan="3" class="as">合计&nbsp;<span class="spa">${orderb.price}</span>元<br />本次交易成功可获赠<span class="spa">${orderb.price}</span>枚金元宝</td></tr>
          <tr><td colspan="3" > <a href="paydingDans.action?price=${orderb.price}&orderid=${orderb.orderid}"><div class="ziti"> 确认支付<div> </a> </td></tr>
    </table>
    
          
          
          
   
</body>
</html>
