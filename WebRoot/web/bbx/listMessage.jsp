<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<head>
	<%-- <meta http-equiv='refresh' content='0;url=http://192.168.1.203:8080/wangbds/wbFBActivity.action?wangbaid=20'> --%>
<%-- <link href="<%=path %>/Css/style.css" rel="stylesheet" type="text/css"> --%>
<title>我的消息</title>
  </head>
  
  <body>
  	<table width="100%">
  			<tr>
  				<td  align="center" style="background-color: #DDDDDD">历史消息</td>
  			</tr>
  			
  			<c:forEach items="${list}" var="Message">
  			
  			<tr>
  			
  				<td width="100%" style=" border-bottom: 3px solid #DDDDDD; padding-left:2%;line-height: 22px;"><div>${fn:substring(Message.time, 0, 11)}</div>
  				<div>${Message.content}</div> 
  				<div style="float: right;">【百保箱】</div>
  				</td>
  			</tr>
  			</c:forEach>
  			
  		</table> 
  
  </body>
</html>
