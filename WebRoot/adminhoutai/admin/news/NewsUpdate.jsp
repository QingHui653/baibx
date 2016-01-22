<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>
<%@ include file="../../../common/head.jsp"%>


    
    
    <title>My JSP 'index.jsp' starting page</title>

  </head>
  
  <body>
    <div>
    <th> 修改新闻</th>
    <form action="newupdate.action" method="post" enctype="multipart/form-data">
    	<input type="hidden" name="id" value="${news.id}">
    
   标题: <input type="text" name="title" value="${news.title}"><br>
     图片: 
     	<img alt="" src="<%=urlx%>${news.image}" width="100px" height="50px">
      <input type="file" name="image"> <br>
       推荐人:<input type="text" name="referee" value="${news.referee }">	
    点击量:<input type="text" name="clicks" value="${news.clicks}">
     新闻出处:<input type="text" name="chuchu" value="${news.chuchu}">
 是否置顶 :
 	<select name="top">
 			<c:choose>
 				<c:when test="${news.top=='1'}">
 					<option value="1" > 是</option>
 					<option value="0" > 否</option>
 				</c:when>
 				<c:when test="${news.top=='0'}">
 					<option value="0" > 否</option>
 					<option value="1" > 是</option>
 				</c:when>
 			</c:choose>

 	</select>

   </br>
	<FCK:editor instanceName="content" height="250pt" value="${news.content}" >
			 
			</FCK:editor>
			 <input type=submit value="确 定"/>
    </form>
    </div>
  </body>
</html>
