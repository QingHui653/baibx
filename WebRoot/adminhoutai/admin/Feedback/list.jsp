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
                    <td height="20" colspan="10" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">用户反馈列表</td>
                    </tr>
                  <tr>
				   
                    <td  height="20" align="center" bgcolor="#EEEEEE">ID</td>
                    <td  align="center" bgcolor="#EEEEEE">类型</td>
                    <td  align="center" bgcolor="#EEEEEE">内容</td>
                    <td  align="center" bgcolor="#EEEEEE">推荐人</td>
                    <td  align="center" bgcolor="#EEEEEE">推荐时间</td>
                    <td  align="center" bgcolor="#EEEEEE">是否采纳</td>
                     <td  align="center" bgcolor="#EEEEEE">采纳人</td>
                    <td  align="center" bgcolor="#EEEEEE">操作</td>

                  
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Payinformation"> 
                 <tr align="center">
	 		
                    <td height="20" bgcolor="#FFFFFF">${Payinformation.id}</td>
                    <td bgcolor="#FFFFFF">
                    
                    	<c:if test="${Payinformation.type=='1'}">建议</c:if>
                    	<c:if test="${Payinformation.type=='2'}">推荐好文</c:if>
                 
                    </td> 
                    <td bgcolor="#FFFFFF">   ${fn:substring(Payinformation.content, 0, 40)}</td> 
                    <td bgcolor="#FFFFFF">${Payinformation.userid}</td> 
                    <td bgcolor="#FFFFFF">
                    ${fn:substring(Payinformation.time, 0, 10)}</td> 
                	  <td bgcolor="#FFFFFF">
                    	<c:if test="${Payinformation.accept=='0'}">未审核</c:if>
                    	<c:if test="${Payinformation.accept=='1'}">已采纳</c:if>
                    	<c:if test="${Payinformation.accept=='2'}">未采纳</c:if>
                    </td>
                      <td bgcolor="#FFFFFF">${Payinformation.adminid}</td> 
                      <td bgcolor="#FFFFFF"><a href="Feeddetail.action?id=${Payinformation.id}" target="_blank"> <!-- onclick="window.close();" --> 查看详情</a></td> 
                
                   </tr>  
    		</c:forEach> 
    	
				
                  
                </table>
                 <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="listFeedback.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="listFeedback.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
   </div>
</body>
</html>
