<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../common/head.jsp"%>

<script  src="JS/payinform.js" type="text/javascript" ></script>

<title>无标题文档</title>


</head>

<body>
 <div class="lists">
 <c:if test="${!empty userb}">
		<form action="order.action" method="post">
		<input type="hidden" name="userid" value="${userb.userid}" />
		<table width="100%" border="0" align="center" >
			<c:choose>
				<c:when test="${userb.type=='user'}">
					<tr>
					<td colspan="2" align="center">
					业务员(查看全部险种)
					</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="radio" name="productgroup" value="oneYear" id="oneYear" />1年260元
						<input  type="hidden" id="oneYearValue" value="260"/>
						<input type="radio" name="productgroup" value="twoYear"  id="twoYear"/>2年480元
						<input  type="hidden" id="twoYearValue" value="480"/>
						</td>
						
					</tr>
				</c:when>
				<c:when test="${userb.type=='custom'}">
					<tr>
					<td colspan="2" align="center">
						客户(选看2个保险种)
					</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							50元一年一份<br/>
							购买<input  type="text" id="cu"   name="productgroup" value="" style="color: rgb(255,0,0); border-left: medium none; border-right: medium none; border-top: medium none; border-bottom: 1px solid rgb(192,192,192)"/>份
							
						</td>
					</tr>
				</c:when>
			</c:choose>
			<c:choose>
			<c:when test="${userb.gold!=0}">
			<tr>
 				<td colspan="2" align="center" >
 				<input type="checkbox" name="gold" value="${userb.gold}" id="gold" />使用金元宝抵押<input type="text" id="goldprice" value="${userb.gold/100}" readonly="readonly" style="background:#CCCCCC"/>元
 				</td>	
 			</tr>
 			<tr><td colspan="2" align="center">您的百保箱藏有${userb.gold}个金元宝,可以抵充${userb.gold/100}元</td></tr>
 			</c:when>
 			</c:choose>
 		<tr>
 			
 			<td colspan="2" align="center">支付金额<input type="text" name="price" value="" id="price"  readonly="readonly"/>元人民币</td>
 		</tr>
 		<tr>
 			
 			<td colspan="2" align="center">支付平台 支付宝图标</td>
 		</tr>	
 		
 		<tr>
 			<td  colspan="2" align="center">激活码接收手机号码 <input type="text" name="phone" value="" /></td>
 		</tr>
 		<tr>
 			<td  colspan="2" align="center"> <input type="submit" value="确认订单" /></td>
 		</tr>
 </table>
         </form>    
         </c:if>   
   </div>
</body>
</html>
