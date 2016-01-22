<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/news/js/check.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	<!--  <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
                 <input  type="button"  value="添加新闻" id="add"/>
	              <input  type="button"  value="删除新闻" id="del" />
	             
                  </td>
          	 </tr> -->
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="20" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">用户信息列表</td>
                    </tr>
                  <tr>
			<!-- 	    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td> -->
                    <td  height="20" align="center" bgcolor="#EEEEEE">用户ID</td>
                    <td  align="center" bgcolor="#EEEEEE">手机号</td>
                     <td  align="center" bgcolor="#EEEEEE">真实姓名</td>
                     <td  align="center" bgcolor="#EEEEEE">性别</td>
                    <td  align="center" bgcolor="#EEEEEE">密码</td>
                    <td  align="center" bgcolor="#EEEEEE">客户类型</td>
                    <td  align="center" bgcolor="#EEEEEE">验证码</td>
                    <td  align="center" bgcolor="#EEEEEE">激活码</td>
                    <td  align="center" bgcolor="#EEEEEE">金元宝</td>
                       <td  align="center" bgcolor="#EEEEEE">注册时间</td>
        <!--                <td  align="center" bgcolor="#EEEEEE">目前职务</td>
                       <td  align="center" bgcolor="#EEEEEE">公司地址</td>
                       <td  align="center" bgcolor="#EEEEEE">保险公司</td>
                       <td  align="center" bgcolor="#EEEEEE">所属公司</td> -->
                       <td align="center" bgcolor="#EEEEEE">激活状态</td>
                       <td  align="center" bgcolor="#EEEEEE">激活日期</td>
                     <!--   <td  align="center" bgcolor="#EEEEEE">员工工号</td> -->
         <!--               <td  align="center" bgcolor="#EEEEEE">保险代理人ID</td> -->
                       
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Userb"> 
 
    			 
                 <tr align="center">
	 				<%--  <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${Userb.id}" ></td> --%>
                    <td height="20" bgcolor="#FFFFFF">${Userb.id}</td>
                    <td bgcolor="#FFFFFF">${Userb.userid}</td>
                    <td bgcolor="#FFFFFF">${Userb.name}</td>
                     <td bgcolor="#FFFFFF">${Userb.sex}</td>
                      <td bgcolor="#FFFFFF">${Userb.password}</td>
                       <td bgcolor="#FFFFFF">${Userb.type}</td>
                        <td bgcolor="#FFFFFF">${Userb.verifycode}</td>
                         <td bgcolor="#FFFFFF">${Userb.acticode}</td>
                          <td bgcolor="#FFFFFF">${Userb.gold}</td>
                                    <td bgcolor="#FFFFFF"> ${Userb.regtime}
             
                           <%-- <td bgcolor="#FFFFFF">${Userb.position}</td>
                            <td bgcolor="#FFFFFF">${Userb.address}</td>
                             <td bgcolor="#FFFFFF">${Userb.insurer}</td>
                             <td bgcolor="#FFFFFF">${Userb.company}</td> --%>
                             <td bgcolor="#FFFFFF">${Userb.status}</td>
                             <td bgcolor="#FFFFFF">${Userb.renewaltime}</td>
  <%--           	                 <td bgcolor="#FFFFFF">${Userb.employeenumber}</td> --%>
           	<%-- 		  <td bgcolor="#FFFFFF">${Userb.insurerperson}</td> --%>
                    <%-- 
                     <fmt:formatDate pattern="yyyy-MM-dd" value="${Userb.regtime}" /> --%>
                    </tr>  
    		</c:forEach> 
    		
    		
                  <%--   <c:choose>
        <c:when test="${pageSupport.result[0]==null}">
        </c:when>
        <c:when test="${pageSupport.prePage>0}">
          <tr>
        <th align="center" width="100%" colspan="19" bgcolor="#E3E3E3" id="one">
         <a href=" <c:url value='userlist.action?pageNo=${pageSupport.prePage}'/>"style="text-decoration: none;">上一页</a>	
         <a href=" <c:url value='userlist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
      </c:when>
          <c:otherwise>
           <tr>
        <th align="center" width="100%" colspan="19" bgcolor="#E3E3E3" id="one">     	
         <a href=" <c:url value='userlist.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
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
    	<c:when test="${pageSupport.startPage!=1}"><a href="userlist.action?pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="userlist.action?pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table>  
                
   </div>
</body>
</html>
