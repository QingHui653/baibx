<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/quer.css" rel="stylesheet" type="text/css" />

</head>

<body>

          
          
          
          <table width="100%" class="all" cellpadding="0" cellspacing="0" align="center">
    		

            <tr><td class="fi" >收件人</td><td>${sOrderb.name}</td></tr>
             <tr><td class="fi">收件人电话</td><td>${sOrderb.phone}</td></tr>
              <tr><td class="fi">收件人地址</td><td>${sOrderb.address}</td></tr>
            
           
    </table>
	<table width="100%" class="alls" cellpadding="0" cellspacing="0">
	<c:forEach items="${Map}" var="item">
    	<tr><td ><img src="<%=urlx%>${item.value.giftImage }"height="60px" /></td><td class="name">${item.value.giftname}</td><td>${item.value.disprice}x${item.value.number}=${item.value.giftprice}</td></tr>
	</c:forEach>
    	
        <tr><td colspan="3" class="as">合计&nbsp;<span class="spa">${sOrderb.price}</span>元<br />本次交易成功可获赠<span class="spa"><fmt:parseNumber var="i" type="number" integerOnly="true"  value="${sOrderb.price}" /> ${i}</span>枚金元宝</td></tr>
          <tr><td colspan="3" > <a href="paydingDan.action?price=${sOrderb.price}&orderid=${sOrderb.orderid}&userid=${userid}"><div class="ziti"> 确认支付<div> </a> </td></tr>
    </table>
    
          
          
          
   
</body>
</html>
