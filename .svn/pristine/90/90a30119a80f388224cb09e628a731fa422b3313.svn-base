<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../common/head.jsp"%>

<title>无标题文档</title>


</head>

<body>
 <div class="lists">

		<table width="100%" border="0" align="center" >
			
			<tr>
			<c:choose>
				<c:when test="${userb.type=='user'}">
					<td colspan="2" align="center">
					
					<input type="checkbox" checked="checked" />购买百保箱业务员版</td>
				</c:when>
				<c:when test="${userb.type=='custom'}">
						<td colspan="2" align="center">	<input type="checkbox" checked="checked" />购买百保箱客户版</td>
				</c:when>
			</c:choose>
 			</tr>
 			<tr>
 				<c:choose>
				
				<c:when test="${payinformation.productgroup=='twoYear'}">
					<td colspan="2" align="center">	<input type="checkbox" checked="checked" />使用期限2年(730天)
					</td>
				</c:when>
				<c:otherwise>
					<td colspan="2" align="center">	<input type="checkbox" checked="checked" />使用期限1年(365天)
					</td>
				</c:otherwise>
				</c:choose>
 			</tr>
 			<tr>
 				<c:choose>
 				<c:when test="${payinformation.gold!=null}">
				<td colspan="2" align="center">	<input type="checkbox" checked="checked" />使用${payinformation.gold}个金元宝抵押${payinformation.gold/100}元
				</td>
				</c:when>
				</c:choose>
 			</tr>
 			<tr>
 				<td colspan="2" align="center">
 					<input type="checkbox" checked="checked" />还需支付${ payinformation.price}元
 				</td>
 			</tr>
 			<tr>
 				<td colspan="2" align="center">
 				<input type="button" value="订单无误确认支付"/>
 				</td>
 				</tr>
 			
 		
 	
 		
 		
 			
 			
 		
 			
 			
 			
                </table>
                
   </div>
</body>
</html>
