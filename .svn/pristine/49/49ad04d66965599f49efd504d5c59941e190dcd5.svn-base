<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/new.css" rel="stylesheet" type="text/css" />
<title>所有新闻</title>
</head>

<body>

	<table  class="all">
	 <c:forEach items="${pageSupport.result}" var="news"> 
    	<tr>     
        	<td width="35%" height="20%"  >
        	 <a href=" <c:url value='findnews.action?id=${news.id}&pageNo=1'/>" > <img src="<%=urlx%>${news.image}"   class="titleimg" /></a>
        		</td>
			<td width="65%"  height="20%" class="con" >
			        	
            <div>
            <a href=" <c:url value='findnews.action?id=${news.id}&pageNo=1'/>" >${fn:substring(news.title, 0, 22)}  </a>
             </div>
             
            <div style="padding-top:4%"><div class="liulang"> ${news.clicks}浏览</div>
           <c:if test="${news.top==1}">
            <div ><img src="<%=path%>/adminhoutai/admin/images/xw_03.png" class="re" /></div>
            </c:if>
            </div>
            </td>
           
        </tr>
        </c:forEach>
    </table>
   <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="allnews.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="allnews.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
</body>
</html>