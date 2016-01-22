<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/detail.css" rel="stylesheet" type="text/css" />
<title>${news.title}</title>
</head>

<body>
<div class="cshu">
	<input type="hidden" name="url" value="addshoucan.action?resouceid=${news.id}&type=news&title=${news.title}&userid=${userb.userid}">
	</div>
	<table width="100%" class="all">
    	<tr><td  colspan="3" style="text-align: center;font-size: 20px;" >${news.title}</td></tr>
           <tr><td width="33%" style="font-size: 14px;color: #666666"> ${fn:substring(news.time, 0, 10)}
           <%-- <fmt:formatDate value="${news.time}" type="date"/> --%></td>
           		<c:choose>
        		<c:when test="${news.chuchu==null}"></c:when>
        		<c:when test="${not empty news.chuchu}"><td width="60" colspan="2" align="right" style="font-size: 14px;color:orange;text-align: right;padding-right: 3px;">新闻出处:${news.chuchu}</td></c:when>
        		</c:choose>
          
           <tr><td colspan="3">${news.content}<%-- <img src="<%=urlx%>${news.image}" width="100%" /> --%></td></tr>
    </table>
    
       <c:if test="${!empty userb}">
    <table width="100%" class="mp" >
    	<tr><td colspan="3"><img src="<%=path%>/adminhoutai/admin/images/dli.png" width="100%" /></td></tr>
        <tr><td width="25%"><img src="<%=path%>/adminhoutai/admin/images/rw.png"  width="100%"  /></td>
        	<td width="50%" align="center"><span>${userb.name}</span><br /><span>${userb.insurer}</span></td>
            <td width="25%"><img src="<%=path%>/adminhoutai/admin/images/tub.png" width="100%" /></td></tr>
		<tr> <td width="90%" colspan="3" class="call"  >${userb.phone }</td></tr>  	
    </table>
        </c:if>
        

</body>
</html>
