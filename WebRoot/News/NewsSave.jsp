<%@ include file="../common/head.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>


<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>

  </head>
  
  <body>
    <div>
    <th>发布新闻</th>
    <form action="save.action" method="post">
   标题: <input type="text" name="title" value="">
   <input type="hidden" name="top" value="0">
    <input type="hidden" name="id" value="">
    
   </br>
	<FCK:editor instanceName="content" height="250pt" value="" >
			 
			</FCK:editor>
			 <input type=submit value="确 定"/>
    </form>
    </div>
  </body>
</html>
