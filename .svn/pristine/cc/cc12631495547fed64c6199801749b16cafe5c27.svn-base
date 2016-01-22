<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<style type="text/css">
.ta{background-color: activecaption;margin-top: 40px; width: 800px;}
.ta tr td{ padding-top: 5px; padding-left: 5px;}
</style>
    
    
    <title>My JSP 'index.jsp' starting page</title>

  </head>
  
  <body>
    <div>
    
    <form action="upload.action" method="post" enctype="multipart/form-data">
    	
			
			
	<table  class="ta" align="center">
     <th align="center">添加资料</th>
     
    <tr>  <td>标题：</td><td><input type="text" name="title" ></td></tr>
   <tr> <td>资料类型：</td><td>
   			<select name="type">
 	
 		<option value="Increase">增员技巧</option>
 		<option value="EarlyResources">早会资源</option>
 		<option value="Marketing">营销技能</option>
 		<option value="DevelopCustomer">主顾开拓</option>
 		<option value="MasterShare">高手分享</option>
 		<option value="InsuranceRules">投保规则</option>
 		<option value="Success">成功激励</option>
 		<option value="Industry">行业知识</option>	
 	</select>
   
   
 		</td></tr>
  
    <tr> <td>文件：</td><td><input type="file" name="file"></td></tr>

    <tr> <td>推荐人：</td><td><input type="text" name="referee"></td></tr>
    
    <tr> <td>是否置顶：</td><td>
  					<select name="top">
 		<option value="1">是</option>
 		<option value="0">否</option>
 	</select>
 	</td></tr>
   <tr> 
 	  	
   
  	<td colspan="2">
	 <FCK:editor instanceName="content" height="250pt" value="" >
			 
			</FCK:editor>
		</td>	
		
 	</tr>
      <tr> <td colspan="2" align="center"><input type=submit value="确 定" width="50px"/></td></tr>

   </table>
		
			 
			 
			 
			 
			 
			 
    </form>
    </div>
  </body>
</html>
