<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>


</head>

<body>
 <div class="lists">
 
 		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="11" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">礼品支付列表</td>
                    </tr>
                  <tr>
				   
                    <td  height="20" align="center" bgcolor="#EEEEEE">订单ID</td>
                    <td  align="center" bgcolor="#EEEEEE">购买人ID</td>
                    <td  align="center" bgcolor="#EEEEEE">支付账号</td>
                    <td  align="center" bgcolor="#EEEEEE">支付时间</td>
                    <td  align="center" bgcolor="#EEEEEE">支付状态</td>
                    <td  align="center" bgcolor="#EEEEEE">支付金额</td>
                    <td  align="center" bgcolor="#EEEEEE">收件人</td>
                    <td  align="center" bgcolor="#EEEEEE">收件人电话</td>
                    <td  align="center" bgcolor="#EEEEEE">收件地址</td>
                      <td align="center" bgcolor="#EEEEEE">物流编号</td>
                  <td align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Orderb"> 
                 <tr align="center">
	 		
                    <td height="20" bgcolor="#FFFFFF">${Orderb.orderid}</td>
                    <td bgcolor="#FFFFFF">${Orderb.userid}</td> 
                    <td bgcolor="#FFFFFF">${Orderb.payment}</td> 
                    <td bgcolor="#FFFFFF">${Orderb.time}</td> 
                    <td bgcolor="#FFFFFF">
                    <c:if test="${Orderb.status=='W'}">未支付</c:if>
       			 <c:if test="${Orderb.status=='Y'}">支付成功</c:if>
                    </td> 
                    <td bgcolor="#FFFFFF">${Orderb.price}</td> 
                    <td bgcolor="#FFFFFF">${Orderb.name}</td> 
                    <td bgcolor="#FFFFFF">${Orderb.phone}</td> 
                    <td bgcolor="#FFFFFF">
                   	${Orderb.address}
                   </td> 
                    <td bgcolor="#FFFFFF">
                     <c:if test="${Orderb.logistics==null}">未发货</c:if>
                   <c:if test="${Orderb.logistics!=null}">${Orderb.logistics}</c:if>
                    </td>
                    <td bgcolor="#FFFFFF"><a href="wuliuyemian.action?orderid=${Orderb.orderid }">填写物流编号</a></td> 
                  <%--   <c:choose>
                    	<c:when test="${Userb.status=='dongjie'}"><td bgcolor="#FFFFFF">冻结</td></c:when>
                   		<c:when test="${Userb.status=='jihuo'}"><td bgcolor="#FFFFFF">激活</td></c:when>
                   		<c:when test="${Userb.status=='weijihuo'}"><td bgcolor="#FFFFFF">未激活</td></c:when>
                   		<c:when test="${Userb.status=='zhuxiao'}"><td bgcolor="#FFFFFF">注销</td></c:when>
                    </c:choose> --%>
                      <%--  <td align="center" bgcolor="#EEEEEE"><a href="updateStatusPage.action?id=${Payinformation.id}">修改</a></td> --%>
                   </tr>  
    		</c:forEach> <%-- 
                    <c:choose>
        <c:when test="${pageSupport.result[0]==null}">
        </c:when>
        <c:when test="${pageSupport.prePage>0}">
          <tr>
        <th align="center" width="100%" colspan="11" bgcolor="#E3E3E3" id="one">
         <a href=" <c:url value='paylist.action?pageNo=${pageSupport.prePage}'/>"style="text-decoration: none;">上一页</a>	
         <a href=" <c:url value='paylist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
      </c:when>
          <c:otherwise>
           <tr>
        <th align="center" width="100%" colspan="11" bgcolor="#E3E3E3" id="one">     	
         <a href=" <c:url value='paylist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
          </c:otherwise>
          </c:choose>
					</td>
                    </tr>   --%> 
                  
                </table>
                <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    	<c:when test="${pageSupport.startPage!=1}"><a href="oblist.action?pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="oblist.action?pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table>  
   </div>
</body>
</html>
