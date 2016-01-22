<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/news/js/check.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="4" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">用户状态列表</td>
                    </tr>
                  <tr>
				   
                    <td  height="20" align="center" bgcolor="#EEEEEE">用户ID</td>
                    <td  align="center" bgcolor="#EEEEEE">手机账号</td>
                      <td align="center" bgcolor="#EEEEEE">激活状态</td>
                     <td align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Userb"> 
                 <tr align="center">
	 		
                    <td height="20" bgcolor="#FFFFFF">${Userb.id}</td>
                    <td bgcolor="#FFFFFF">${Userb.userid}</td> 
                    
                    <c:choose>
                    	<c:when test="${Userb.status=='dongjie'}"><td bgcolor="#FFFFFF">冻结</td></c:when>
                   		<c:when test="${Userb.status=='jihuo'}"><td bgcolor="#FFFFFF">激活</td></c:when>
                   		<c:when test="${Userb.status=='weijihuo'}"><td bgcolor="#FFFFFF">未激活</td></c:when>
                   		<c:when test="${Userb.status=='zhuxiao'}"><td bgcolor="#FFFFFF">注销</td></c:when>
                   		<c:when test="${Userb.status==null}"><td bgcolor="#FFFFFF">未激活</td></c:when>
                    </c:choose>
                       <td align="center" bgcolor="#EEEEEE"><a href="updateStatusPage.action?id=${Userb.id}">修改</a></td>
                   </tr>  
    		</c:forEach> 
                 <%--    <c:choose>
        <c:when test="${pageSupport.result[0]==null}">
        </c:when>
        <c:when test="${pageSupport.prePage>0}">
          <tr>
        <th align="center" width="100%" colspan="4" bgcolor="#E3E3E3" id="one">
         <a href=" <c:url value='statuslist.action?pageNo=${pageSupport.prePage}'/>"style="text-decoration: none;">上一页</a>	
         <a href=" <c:url value='statuslist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
      </c:when>
          <c:otherwise>
           <tr>
        <th align="center" width="100%" colspan="4" bgcolor="#E3E3E3" id="one">     	
         <a href=" <c:url value='statuslist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
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
    	<c:when test="${pageSupport.startPage!=1}"><a href="statuslist.action?pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="statuslist.action?pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table>    
                
   </div>
</body>
</html>
