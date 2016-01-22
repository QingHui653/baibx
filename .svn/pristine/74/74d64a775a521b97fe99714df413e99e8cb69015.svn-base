<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>我的订单</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/orlist.css" rel="stylesheet" type="text/css" />



</head>

<body>
<%-- 
		<c:forEach items="${pageSupport.result}" var="Orderb">
				<div  class="icon" style="padding-bottom: 3px; margin: 3px;"   >
					<table>
					<tr><td>订单编号:${Orderb.orderid}</td></tr>
					<tr>
					<td>状态${Orderb.status}</td>
					</tr>
					<tr>
					<td>收件地址${Orderb.address}</td>
					</tr>
					<tr>
					<td>物流编号${Orderb.logistics}</td>
					</tr>
					</table>
					<a href="orderdetail.action?orderid=${Orderb.orderid}">查看详情 </a>
				</div>
		
			</c:forEach> --%>
         	
         <c:forEach items="${pageSupport.result}" var="Orderb">
         		   <table width="100%" class="all">
    	<tr><td class="zt">订单编号：</td><td>${Orderb.orderid}</td></tr>
   		 <tr><td class="zt">状态：</td><td>
   		 <c:if test="${Orderb.status=='W'}">
   		 <a href="weizhif.action?orderid=${Orderb.orderid}">未支付</a></c:if>
   		  <c:if test="${Orderb.status=='Y'}">已支付</c:if>
   		 </td></tr>
         <tr><td class="zt">收货地址：</td><td>${Orderb.address}</td></tr>
         <tr><td class="zt">物流编号：</td><td>
         <c:if test="${Orderb.logistics!=null}">${Orderb.logistics}</c:if>
          <c:if test="${Orderb.logistics==null}"></c:if>
         
         </td></tr>
         <tr><td class="xq" colspan="2"><a href="orderdetail.action?orderid=${Orderb.orderid}">查看详情</a></td></tr>
 		   </table>
         
         
   			</c:forEach>
   			<table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="dingdanlist.action?userid=${userid}&pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="dingdanlist.action?userid=${userid}&pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
</body>
</html>
