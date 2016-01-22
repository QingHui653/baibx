<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<head>
<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path%>/Css/slist.css" rel="stylesheet" type="text/css">
<title>保险资料</title>
</head>

<body>

   <!-- <iframe frameborder="0" width="100%" height=506px; src="top.html" name="top"></iframe> -->
    <%@ include file="heart.jsp" %>
     <div class="banner"><img src="<%=path %>/images/banner (1024).png"></div>
     <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">1.</span>
                    <span class="title fr">保险资料</span>
                </div>
        	</span>
        </span>
    </div>
   		<table align="center" class="table" width="700px">
   		 <c:forEach items="${pageSupport.result}" var="Information"> 
        	<tr>
            	<td>
            	<a href=" <c:url value='studyDetail.action?id=${Information.id}&pageNo=1'/>" >
         		<div>${fn:substring(Information.title, 0, 22)} <div class="right">${Information.time}</div></div>
 				<div class="djl">点击量（${Information.clicks}）</div>
                 <div class="imgg">
                  <c:if test="${Information.top==1}">
                  <img src="<%=path%>/images/xw_03.png" height="25px" align="middle" />
                   </c:if>
                  </div>
                </a>
                </td>
            </tr>
        	</c:forEach>
        </table>
		
			<table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    					
    			<a href="studyslist.action?PageNo=${pageSupport.prePage}&type=${pageSupport.result[0].type}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    					
    			<a href="studyslist.action?PageNo=${pageSupport.nextPage}&type=${pageSupport.result[0].type}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
    
   

    
         <%@ include file="foot.jsp"%>
    
</body>
</html>
