<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>

<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/or.css" rel="stylesheet" type="text/css" />


</head>

<body>
<%-- 
		<table width="100%" class="icon"  align="center"  style="border:1px solid gray;" cellspacing="0"  >
			<c:forEach items="${Map}" var="item">
		 	<tr>
		 	<td width="30%">	
			<img src="<%=urlx%>${item.value.giftImage } " width="200px"  />
			</td><td width="40%">${item.value.giftname}</td>
			<td width="30%">${item.value.disprice}x${item.value.number}=${item.value.giftprice}</td>
			</tr>
			</c:forEach>
			<form action="dingdan.action" method="post">
			<tr>
				<td colspan="3">合计:${nu}</td>
				<input type="hidden" name="price" value="${nu}"/>
			</tr>
			<tr>
				<td>收件人:</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>收货地址:</td><td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>电话号码:</td><td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>支付宝账号:</td><td><input type="text" name="payment"></td>
			</tr>
			<tr><td><input type="submit" value="确认订单"/></td></tr>
        	</form>
          </table> --%>
          
          
          <c:if test="${nu!=null}">
          <table width="100%" class="all" cellpadding="0" cellspacing="0">
          <c:forEach items="${Map}" var="item">
    	<tr><td ><img src="<%=urlx%>${item.value.giftImage }" height="60px" /></td><td class="name">${item.value.giftname}</td><td>${item.value.disprice}x${item.value.number}=${item.value.giftprice}</td></tr>
</c:forEach>
    	<form action="dingdan.action" method="post" id="subform">
        <tr><td colspan="3">合计${nu}</td></tr>
        <input type="hidden" name="price" value="${nu}"/>
      
        <input type="hidden" name="userid" value="${userid}">
    </table>
    <table width="100%" class="or" align="center">
    	<tr><td >收件人</td><td><input type="text" class="le"  name="name"/></td></tr>
        	<tr><td >收货地址</td><td><input type="text" class="le"   name="address"/></td></tr>
    		<tr><td >电话号码</td><td><input type="text" class="le"  name="phone"/></td></tr>
            	<!-- <tr><td >支付宝账号</td><td><input type="text" class="le"  name="payment" /></td></tr> -->
                <tr><td colspan="2" > <a onclick="document.getElementById('subform').submit();" ><div class="ziti">确认订单<div> </a>  </td></tr>
               <tr><td colspan="2" > <a href="fhui.action?PageNo=1" ><div class="ziti">购买有误。重新购买<div> </a>  </td></tr> 
    </table>
          </form>
          
          </c:if>
          <c:if test="${nu==null}">
       			<h1>购物车空的<a href="listgift.action?PageNo=1&userid=${userid}">立即选购</a></h1>   
          </c:if>
       
   
</body>
</html>
