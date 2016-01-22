<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../common/head.jsp"%>
<title>无标题文档</title>


</head>

<body>
 <div class="lists">
 
 		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="10" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">用户支付状态列表</td>
                    </tr>
                  <tr>
				   
                    <td  height="20" align="center" bgcolor="#EEEEEE">ID</td>
                    <td  align="center" bgcolor="#EEEEEE">手机账号</td>
                    <td  align="center" bgcolor="#EEEEEE">产品代码</td>
                    <td  align="center" bgcolor="#EEEEEE">产品类型</td>
                    <td  align="center" bgcolor="#EEEEEE">金额</td>
                    <td  align="center" bgcolor="#EEEEEE">所用金元宝</td>
                    <td  align="center" bgcolor="#EEEEEE">接收短信手机号码</td>
                    <td  align="center" bgcolor="#EEEEEE">支付账号</td>
                    <td  align="center" bgcolor="#EEEEEE">支付时间</td>
                      <td align="center" bgcolor="#EEEEEE">支付状态</td>
                  
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Payinformation"> 
                 <tr align="center">
	 		
                    <td height="20" bgcolor="#FFFFFF">${Payinformation.id}</td>
                    <td bgcolor="#FFFFFF">${Payinformation.userid}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.productcode}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.productgroup}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.price}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.gold}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.phone}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.payment}</td> 
                    <td bgcolor="#FFFFFF">
                   	${Payinformation.paytime}
                   
                   </td> 
                    <td bgcolor="#FFFFFF">
                    	<c:if test="${Payinformation.status=='W'}">未支付</c:if>
                    	<c:if test="${Payinformation.status==null}">未支付</c:if>
                    	<c:if test="${Payinformation.status=='Y'}">支付成功</c:if>
                    </td>
                  <%--   <c:choose>
                    	<c:when test="${Userb.status=='dongjie'}"><td bgcolor="#FFFFFF">冻结</td></c:when>
                   		<c:when test="${Userb.status=='jihuo'}"><td bgcolor="#FFFFFF">激活</td></c:when>
                   		<c:when test="${Userb.status=='weijihuo'}"><td bgcolor="#FFFFFF">未激活</td></c:when>
                   		<c:when test="${Userb.status=='zhuxiao'}"><td bgcolor="#FFFFFF">注销</td></c:when>
                    </c:choose> --%>
                      <%--  <td align="center" bgcolor="#EEEEEE"><a href="updateStatusPage.action?id=${Payinformation.id}">修改</a></td> --%>
                   </tr>  
    		</c:forEach> 
                   <%--  <c:choose>
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
                    </tr>  --%> 
                  
                </table>
                                </table>
            	<table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    	<c:when test="${pageSupport.startPage!=1}"><a href="paylist.action?pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="paylist.action?pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table> 
                
   </div>
</body>
</html>
