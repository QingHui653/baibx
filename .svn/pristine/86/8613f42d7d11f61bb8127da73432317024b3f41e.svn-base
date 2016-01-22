<%@ include file="../common/head.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<link  href="Css/te.css" type="text/css" rel="stylesheet"/>

<script type="text/javascript" src="JS/te.js"></script>


<title>${news.title}</title>
</head>			

    
<body>

			<table width="100%" border="0" height="100%" align="center" id="ttt">
        	<th align="center" width="100%" colspan="3" bgcolor="#E3E3E3" id="one" style="font-size:30px ">${news.title}</th>
        	<tr>
        	<td align="left" style="font-size: 18px" width="35%">发布时间:<fmt:formatDate value="${news.time}" type="date"/></td>
        	<td align="left" style="font-size: 18px" width="31%">
        	<c:choose>
        		<c:when test="${news.referee==null}"></c:when>
        		<c:when test="${not empty news.referee}">${news.referee}推荐</c:when>
        	</c:choose>
        	
        
        	</td>
        	<td align="left" style="font-size: 18px" width="32%"></td>
        	</tr>
        	<tr>
      		<td>${news.content} </td>
     		 </tr>
        </table>
        <c:if test="${!empty userb}">
        	
        	<table width="100%">
        <th align="center" width="100%" colspan="3" bgcolor="#E3E3E3" id="one" style="font-size:30px ">百宝箱助您做最专业的保险代理人</th>
        	<tr>
        		<td width="35%"><img src="<%=urlx%>${userb.heart}" height="50px" width="100px"/></td>
        			<td width="33%" align="center">${userb.name}<br/><br/> ${userb.insurer}</td>
        				<td width="32%"> 百宝箱图标</td>
        	</tr>
        	<tr>
 				<td colspan="2" align="center">
 				${userb.phone }
 				
				</td>	
 			</tr>
        	</table>
        </c:if>
        
</body>

</html>
 