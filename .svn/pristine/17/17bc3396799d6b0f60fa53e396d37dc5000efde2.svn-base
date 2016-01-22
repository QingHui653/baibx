<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<link href="<%=path%>/Css/detail.css" rel="stylesheet" type="text/css">
<title>无标题文档</title>


</head>

<body>
 		<table align="center" width="700px" class="table">
    	<tr><td colspan="2" class="title">     
        	<c:if test="${feedback.type=='1'}">类型:建议</c:if>
        	<c:if test="${feedback.type=='2'}">类型:推荐好文</c:if>
      </td></tr>
        <tr><td>${fn:substring(feedback.time, 0, 10)}</td>
        	<td class="title">状态:<c:if test="${feedback.accept=='0'}">未审核</c:if>
        			<c:if test="${feedback.accept=='1'}">已采纳</c:if>
        			<c:if test="${feedback.accept=='2'}">未采纳</c:if>
        			</td>
        </tr>
        
        
        <tr><td class="im" colspan="2">${feedback.content }</td></tr>
		<c:if test="${feedback.accept=='0'}">
		<tr><td align="right" width="50%">
    		<div class="fe">
    				<a href="accept.action?id=${feedback.id}&accept=1" class="a" onclick="window.close();" >采纳</a>
    	</div>
    			</td>
    	
    	<td width="50%" align="left">
    	<div  class="fe" ><a href="accept.action?id=${feedback.id}&accept=2"  class="a" onclick="window.close();">不采纳</a>
    		</div>
    		
    			</td>
    			
    	</tr>
    	</c:if>
    </table>
</body>
</html>
