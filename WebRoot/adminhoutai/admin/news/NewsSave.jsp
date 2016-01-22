<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<%@ include file="../../../common/head.jsp"%>
	 
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div>
    <th>发布新闻</th>
    <form action="save.action" method="post"  enctype="multipart/form-data">
   标题: <input type="text" name="title" value=""><br>
  图片: <input type="file" name="image"> <br>
  推荐人:<input type="text" name="referee">
 新闻出处:<input type="text" name="chuchu">
  
 是否置顶 :
 	<select name="top">
 		<option value="1">是</option>
 		<option value="0">否</option>
 	</select>
    <input type="hidden" name="id" >
    
   </br>
	<FCK:editor instanceName="content" height="250pt" value="" >
			 
			</FCK:editor>
			 <input type=submit value="确 定"/>
    </form>
    </div>
  </body>
</html>
