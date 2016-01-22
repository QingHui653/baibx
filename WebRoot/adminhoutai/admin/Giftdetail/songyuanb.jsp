<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>我的订单</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/orlist.css" rel="stylesheet" type="text/css" />



</head>

<body>

         	
         <c:forEach items="${pageSupport.result}" var="Orderb">
         		   <table width="100%" class="all">
    	<tr><td class="zt">订单编号：</td><td>${Orderb.orderid}</td></tr>
   		
         <tr><td class="zt">已送元宝：</td><td><fmt:parseNumber var="i" type="number" integerOnly="true"  value="${Orderb.price}" /> ${i}</td></tr>
       
         <tr><td class="xq" colspan="2"><a href="orderdetail.action?orderid=${Orderb.orderid}">查看详情</a></td></tr>
 		   </table>
         
         
   			</c:forEach>
   			<table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    	<c:when test="${pageSupport.startPage!=1}"><a href="songyuanb.action?userid=${userid}&pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="songyuanb.action?userid=${userid}&pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table>
</body>
</html>
