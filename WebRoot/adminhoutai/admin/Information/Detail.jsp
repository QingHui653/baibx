<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/detail.css" rel="stylesheet" type="text/css" />
<title>${information.title}</title>
<style type="text/css">
.ia{text-decoration: none;color: #000000}
</style>
</head>

<body>
	<div class="cshu">
	<input type="hidden" name="url" value="addshoucan.action?resouceid=${information.id}&type=${information.type}&title=${information.title}&userid=a123">
	</div>
	<table width="100%" class="all">
    	<tr><td  colspan="3">${information.title}</td></tr>
           <tr><td width="33%">${fn:substring(information.time, 0, 10)}
          <%--  <fmt:formatDate value="${information.time}" type="date"/> --%></td>
           		<c:choose>
        		<c:when test="${information.referee==null}"></c:when>
        		<c:when test="${not empty information.referee}"><td width="33%" align="right">${information.referee}推荐</td></c:when>
        		</c:choose>
           <td width="33%"></td></tr>
           <c:choose>
           	<c:when test="${information.type=='video'}">   		
      		 <tr><td colspan="3"><br><iframe height="120%" width="100%" src="${information.content}" frameborder=0 allowfullscreen></iframe></td></tr>
           	</c:when>
           	<c:otherwise>
           	<tr><td colspan="3">${information.content}</td></tr> 
           </c:otherwise>  
          
           </c:choose>
           
        
    </table>
    
       <c:if test="${!empty userb}">
    <table width="100%" class="mp" style="padding-top: 15%">
    	<tr><td colspan="3"><img src="<%=path%>/adminhoutai/admin/images/dli.png" width="100%" /></td></tr>
        <tr><td width="25%"><img src="<%=path%>/adminhoutai/admin/images/rw.png"  width="100%"  /></td>
        	<td width="50%" align="center"><span>${userb.name}</span><br /><span>${userb.insurer}</span></td>
            <td width="25%"><img src="<%=path%>/adminhoutai/admin/images/tub.png" width="100%" /></td></tr>
		<tr> <td width="90%" colspan="3" class="call"  ><a href="tel:${userb.phone}" class="ia">${userb.phone }</a></td></tr>  	
    </table>
        </c:if>

</body>
</html>
