<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/js/accodechecks.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>
          	 <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
                
                <input  type="button"  value="随机增加10个激活码(1年期)" id="add" />
                 <input  type="button"  value="随机增加10个激活码(2年期)" id="add2" />
	              <input  type="button"  value="删除激活码" id="del" />
	             
                  </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="9" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">激活码信息列表</td>
                    </tr>
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td>
                    <td width="5%" height="20" align="center" bgcolor="#EEEEEE">ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">激活码序列</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">生成类型</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">是否已被使用</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">使用者Userid</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">用户手机设备ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">用户手机网卡地址</td>
      
                       <td width="8%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Activation"> 
 
    			 
                 <tr align="center">
	 				 <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${Activation.id}" ></td>
                    <td height="20" bgcolor="#FFFFFF">${Activation.id}</td>
                    <td bgcolor="#FFFFFF">${Activation.accode}</td>
           <td bgcolor="#FFFFFF"> <c:if test="${Activation.type=='X'}">系统生成</c:if><c:if test="${Activation.type=='G'}">购买生成</c:if></td>
                    <td bgcolor="#FFFFFF"> <c:if test="${Activation.flag=='0'}">未使用</c:if><c:if test="${Activation.flag=='1'}">已使用</c:if></td>
                    <td bgcolor="#FFFFFF">  ${Activation.userid}</td>
                    <td bgcolor="#FFFFFF">${Activation.equipmentId}</td>
                     <td bgcolor="#FFFFFF">${Activation.macaddress}</td>
                   
                    <td bgcolor="#FFFFFF"> <%--  <a href="updatenews.action?id=${Activation.id}">修改</a>| --%> <a href="acdelete.action?id=${Activation.id}"  onclick="return del()">删除</a></td>
                  </tr>  
    		</c:forEach>    
                </table>
                <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="aclist.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="aclist.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table> 
                
   </div>
</body>
</html>
