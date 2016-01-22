<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>



    
    <title>My JSP 'index.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <div>
    <th>用户状态修改</th>
    <form action="updatestatus.action" method="post">
    <input type="hidden" name="id" value="${userb.id}" >
   用户账号: <input type="text" name="title" value="${userb.userid}"  readonly="readonly"><br>

 
状态:
 	<select name="status">
 		<c:choose>
 				<c:when test="${userb.status=='jihuo'}">
 					<option value="jihuo">激活</option>
 					<option value="dongjie">冻结</option>
 					<option value="zhuxiao">注销</option>
 					<option value="weijihuo">未激活</option>
 				</c:when>
 				<c:when test="${userb.status=='dongjie'}">
 					<option value="dongjie">冻结</option>
 					<option value="jihuo">激活</option>
 					<option value="zhuxiao">注销</option>
 					<option value="weijihuo">未激活</option>
 				</c:when>
 				<c:when test="${userb.status=='zhuxiao'}">
 					<option value="zhuxiao">注销</option>
 						<option value="jihuo">激活</option>
 						<option value="dongjie">冻结</option>
 					<option value="weijihuo">未激活</option>
 				</c:when>
 				<c:when test="${userb.status=='weijihuo'}">
 				<option value="weijihuo">未激活</option>
 					<option value="jihuo">激活</option>
 					<option value="dongjie">冻结</option>
 					<option value="zhuxiao">注销</option>
 				</c:when>
 					<c:when test="${userb.status==null}">
 				<option value="weijihuo">未激活</option>
 					<option value="jihuo">激活</option>
 					<option value="dongjie">冻结</option>
 					<option value="zhuxiao">注销</option>
 				</c:when>		
 			</c:choose>	
 	</select>
  <br>

	
			 <input type=submit value="确 定"/>
    </form>
    </div>
  </body>
</html>
