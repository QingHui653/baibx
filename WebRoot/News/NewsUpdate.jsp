<%@ include file="../common/head.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>

<html>
 
    
    <title>My JSP 'index.jsp' starting page</title>

  </head>
  
  <body>
    <div>
    <th> 修改新闻</th>
    <form action="newupdate.action" method="post">
   标题: <input type="text" name="title" value="${news.title}">
   <input type="hidden" name="top" value="${news.top}">
    <input type="hidden" name="id" value="${news.id}">

   </br>
	<FCK:editor instanceName="content" height="250pt" value="${news.content}" >
			 
			</FCK:editor>
			 <input type=submit value="确 定"/>
    </form>
    </div>
  </body>
</html>
