<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<style type="text/css">
.ta{background-color: activecaption;margin-top: 40px; width: 800px;}
.ta tr td{ padding-top: 5px; padding-left: 5px;}
</style>
    
    
    <title>资料页面</title>

  </head>
  
  <body>
    <div>
    
    <form action="updatestudy.action" method="post" enctype="multipart/form-data">
    	
<%--     
   标题: <input type="text" name="title" value="${information.title}"><br>
   
    资料类型 :
 	<select name="type">
 		<option value="video" >保险视频</option>
 		<c:if test="${information.type!='video'}">
 		<option value="Increase" <c:if test="${information.type=='Increase'}">selected="selected"</c:if>>增员技巧</option>
 		<option value="EarlyResources" <c:if test="${information.type=='EarlyResources'}">selected="selected"</c:if>>早会资源</option>
 		<option value="Marketing" <c:if test="${information.type=='Marketing'}">selected="selected"</c:if>>营销技能</option>
 		<option value="DevelopCustomer" <c:if test="${information.type=='DevelopCustomer'}">selected="selected"</c:if>>主顾开拓</option>
 		<option value="MasterShare" <c:if test="${information.type=='MasterShare'}">selected="selected"</c:if>>高手分享</option>
 		<option value="InsuranceRules" <c:if test="${information.type=='InsuranceRules'}">selected="selected"</c:if>>投保规则</option>
 		<option value="Success" <c:if test="${information.type=='Success'}">selected="selected"</c:if>>成功激励</option>
 		<option value="Industry" <c:if test="${information.type=='Industry'}">selected="selected"</c:if>>行业知识</option>	
 		</c:if>
 	</select>
 	<c:if test="${information.type!='video'}">  
    文件:${fn:substring(information.file, 14, 100)}
     	
      <input type="file" name="file"> <br>
      </c:if>
       推荐人:<input type="text" name="referee" value="${information.referee }">	
    点击量:<input type="text" name="clicks" value="${information.clicks}">
 是否置顶 :
 	<select name="top">
 			<c:choose>
 				<c:when test="${information.top=='1'}">
 					<option value="1" > 是</option>
 					<option value="0" > 否</option>
 				</c:when>
 				<c:when test="${information.top=='0'}">
 					<option value="0" > 否</option>
 					<option value="1" > 是</option>
 				</c:when>
 			</c:choose>

 	</select>

   </br>
     	<c:if test="${information.type=='video'}">
     	 <tr> <td> 视频地址：</td><td>  <input type="text" name="content">*优酷分享通用代码SRC</td></tr>
     	</c:if>
   	<c:if test="${information.type!='video'}">
	<FCK:editor instanceName="content" height="250pt" value="${information.content}" >
			 
			</FCK:editor>
			</c:if>
			 <input type=submit value="确 定"/>
			
			 --%>
			
			
			
			    <table  class="ta" align="center">
     <th align="center">修改资料</th>
     <input type="hidden" name="id" value="${information.id}">
    <tr>  <td>标题：</td><td><input type="text" name="title" value="${information.title}" ></td></tr>
   <tr> <td>资料类型：</td><td><select name="type">
 		<option value="video" >保险视频</option>
 		<c:if test="${information.type!='video'}">
 		<option value="Increase" <c:if test="${information.type=='Increase'}">selected="selected"</c:if>>增员技巧</option>
 		<option value="EarlyResources" <c:if test="${information.type=='EarlyResources'}">selected="selected"</c:if>>早会资源</option>
 		<option value="Marketing" <c:if test="${information.type=='Marketing'}">selected="selected"</c:if>>营销技能</option>
 		<option value="DevelopCustomer" <c:if test="${information.type=='DevelopCustomer'}">selected="selected"</c:if>>主顾开拓</option>
 		<option value="MasterShare" <c:if test="${information.type=='MasterShare'}">selected="selected"</c:if>>高手分享</option>
 		<option value="InsuranceRules" <c:if test="${information.type=='InsuranceRules'}">selected="selected"</c:if>>投保规则</option>
 		<option value="Success" <c:if test="${information.type=='Success'}">selected="selected"</c:if>>成功激励</option>
 		<option value="Industry" <c:if test="${information.type=='Industry'}">selected="selected"</c:if>>行业知识</option>	
 		</c:if>
 	</select></td></tr>
 	<c:if test="${information.type!='video'}">  
    <tr> <td>文件：</td><td>${fn:substring(information.file, 14, 100)}   <input type="file" name="file"></td></tr>
    </c:if>
    <tr> <td>推荐人：</td><td><input type="text" name="referee" value="${information.referee }">	</td></tr>
      <tr> <td>点击量：</td><td> <input type="text" name="clicks" value="${information.clicks}">
   </td></tr>
    <tr> <td>是否置顶：</td><td>
   <select name="top">
 			<c:choose>
 				<c:when test="${information.top=='1'}">
 					<option value="1" > 是</option>
 					<option value="0" > 否</option>
 				</c:when>
 				<c:when test="${information.top=='0'}">
 					<option value="0" > 否</option>
 					<option value="1" > 是</option>
 				</c:when>
 			</c:choose>

 	</select>
 	</td></tr>
   <tr> 
 	  	<c:if test="${information.type=='video'}">
     	<td> 视频地址：</td><td>  <input type="text" name="content" value="${information.content}">*优酷分享通用代码SRC</td>
     	</c:if>
   	<c:if test="${information.type!='video'}">
  	<td colspan="2">
	<FCK:editor instanceName="content" height="250pt" value="${information.content}" >
			 
			</FCK:editor>
		</td>	
			</c:if>
 	</tr>
  
  
  
  
   
      <tr> <td colspan="2" align="center"><input type=submit value="确 定" width="50px"/></td></tr>

   </table>
		
			 
			 
			 
			 
			 
			 
    </form>
    </div>
  </body>
</html>
