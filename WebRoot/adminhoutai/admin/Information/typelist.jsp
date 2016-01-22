<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>资料列表</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/js/studylistcheck.js"></script>
<script>
	$(function(){
		$("#bu").click(function(){
		
		window.location.reload();
		})
	})
</script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	 <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
                
               <c:if test="${type=='video'}"><a href="Information/videoSave.jsp"><input  type="button"  value="添加视频" /></a></c:if>
               <c:if test="${type!='video'}">
                <input  type="button"  value="添加资料" id="add"/>
	            
               </c:if>
               
                  <input  type="button"  value="删除资料" id="del" />
	              
	              <input  type="button"  value="刷新页面" id="bu" />
                  </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="9" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">
        		<c:if test="${pageSupport.result[0].type=='video'}">保险视频</c:if>            
       	         <c:if test="${pageSupport.result[0].type=='Increase'}">增员技巧</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='EarlyResources'}">早会资源</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='Marketing'}">营销技能</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='DevelopCustomer'}">主顾开拓</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='MasterShare'}">高手分享</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='InsuranceRules'}">投保资格</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='Success'}">成功激励</c:if>  
       	         <c:if test="${pageSupport.result[0].type=='Industry'}">行业知识</c:if>      
                    信息列表</td>
                    </tr>
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td>
                    <td width="5%" height="20" align="center" bgcolor="#EEEEEE">ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">头条</td>
                  
                    <td width="8%" align="center" bgcolor="#EEEEEE">发布时间</td>
  <td width="8%" align="center" bgcolor="#EEEEEE">具体内容</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">推荐人</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">是否置顶</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">点击量</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Information"> 
 
    			 
                 <tr align="center">
	 				 <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${Information.id}" ></td>
                    <td height="20" bgcolor="#FFFFFF">${Information.id}</td>
                    <td bgcolor="#FFFFFF">${fn:substring(Information.title, 0, 10)}</td>
                    <td bgcolor="#FFFFFF">${fn:substring(Information.time, 0, 10)}</td>
                     <td bgcolor="#FFFFFF">
       			 <a href="StudyUpdatePage.action?id=${Information.id}" >具体内容点击</a>              
                     </td>
                    <td bgcolor="#FFFFFF"> ${Information.referee} </td>
                    <td bgcolor="#FFFFFF"> ${Information.top}</td>
                    <td bgcolor="#FFFFFF">${Information.clicks}</td>
     
                   
                    <td bgcolor="#FFFFFF">  <a href="StudyUpdatePage.action?id=${Information.id}" target="_blank">修改</a>| <a href="deleteStudy.action?id=${Information.id}&type=${Information.type}"  onclick="return del()">删除</a></td>
                  </tr>    
    		</c:forEach> 
                </table>
        
                  
    <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    			<a href="typelist.action?PageNo=${pageSupport.prePage}&type=${pageSupport.result[0].type}">
    			上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    			
    			<a href="typelist.action?PageNo=${pageSupport.nextPage}&type=${pageSupport.result[0].type}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
                
   </div>
</body>
</html>
