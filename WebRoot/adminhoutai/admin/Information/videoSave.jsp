<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<style type="text/css">
.ta{background-color: activecaption;margin-top: 40px;}
.ta tr td{ padding-top: 5px; padding-left: 5px;}
</style>

    
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div>
    
  
			
			  <form action="upload.action" method="post"  enctype="multipart/form-data">
			
			
			    <table  class="ta" align="center">
     <th>上传视频</th>
    <tr>  <td>标题：</td><td><input type="text" name="title" ></td></tr>
    <tr> <td>推荐人：</td><td><input type="text" name="referee"></td></tr>
    
    <tr> <td>是否置顶：</td><td>	<select name="top">
 		<option value="1">是</option>
 		<option value="0">否</option>
 	</select></td></tr>
    <tr><td> 资料类型：</td><td><select name="type">
 		<option value="video">保险视频</option>
 	</select></td></tr>
    <tr> <td> 视频地址：</td><td>  <input type="text" name="content">*优酷分享通用代码SRC</td></tr>
 
   
      <tr> <td colspan="2" align="center"><input type=submit value="确 定" width="50px"/></td></tr>

   </table>
    
 
			
			
			
			
			
    </form>
    </div>
  </body>
</html>
