<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/js/groupcheck.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	 <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
             
               
               
                  <input  type="button"  value="删除群成员" id="del" />
	             
                  </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="14" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">
        		
           	        客户群信息列表</td>
                    </tr>
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td>
                    <td width="5%" height="20" align="center" bgcolor="#EEEEEE">ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">姓名</td>
                  
                    <td width="8%" align="center" bgcolor="#EEEEEE">手机号码</td>
  					<td width="8%" align="center" bgcolor="#EEEEEE">性别</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">年龄</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">职业</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">生日</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">住址</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">类型</td>
                     
<!--                     <td width="8%" align="center" bgcolor="#EEEEEE">上次拜访时间</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">下次预约时间</td> -->
                    <td width="8%" align="center" bgcolor="#EEEEEE">是否是百宝箱用户</td>
                     <td width="8%" align="center" bgcolor="#EEEEEE">备注</td>
           <td width="8%" align="center" bgcolor="#EEEEEE">谁的群</td>
                     <td width="8%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Groupuser"> 
 
    			 
                 <tr align="center">
	 				 <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${Groupuser.id}" ></td>
                    <td height="20" bgcolor="#FFFFFF">${Groupuser.id}</td>
                     <td bgcolor="#FFFFFF"> ${Groupuser.name} </td>
                     <td bgcolor="#FFFFFF"> ${Groupuser.phoneid} </td>
                     <td bgcolor="#FFFFFF"> ${Groupuser.sex} </td>
                      <td bgcolor="#FFFFFF"> ${Groupuser.age} </td>
                      <td bgcolor="#FFFFFF"> ${Groupuser.occupation} </td>
                       <td bgcolor="#FFFFFF"> ${Groupuser.birth} </td>  
                       <td bgcolor="#FFFFFF"> ${Groupuser.address} </td>
                       <td bgcolor="#FFFFFF"> ${Groupuser.type}          </td>
           <%--             <td bgcolor="#FFFFFF"> ${Groupuser.lastvisit} </td>
                       <td bgcolor="#FFFFFF"> ${Groupuser.nextappointment} </td> --%>
                       <td bgcolor="#FFFFFF"> <c:if test="${Groupuser.usertag=='1'}">百宝箱用户</c:if> 
                       <c:if test="${Groupuser.usertag=='0'}">不是</c:if>  </td>
                       <td bgcolor="#FFFFFF"> ${Groupuser.remarks} </td>
                              <td bgcolor="#FFFFFF"> ${Groupuser.userid} </td>
          		    <td bgcolor="#FFFFFF"> <a href="deletegroup.action?id=${Groupuser.id}"  onclick="return del()">删除</a></td>
                   </tr>    
    		</c:forEach> 
                </table>
        
                  
    <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="Customergroup.action?grouptype=${pageSupport.result[0].grouptype}&pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="Customergroup.action?grouptype=${pageSupport.result[0].grouptype}&pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
                
   </div>
</body>
</html>
