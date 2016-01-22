<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<head>
<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path%>/AppWeb/css/news.css" rel="stylesheet" type="text/css"> 

<title>保险资讯</title>
</head>

<body>

  
    <%@ include file="heart.jsp" %>
     <div class="banner"><img src="<%=path%>/images/banner (1024).png"></div>
     <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">1.</span>
                    <span class="title fr">保险资讯</span>
                </div>
        	</span>
        </span>
    </div>
   
		<table align="center" class="all" cellpadding="0"> 
    <tr>
    <c:forEach items="${pageSupport.result}" var="news" varStatus="NA" >
     <td >
     <a href=" <c:url value='apnewsdetail.action?id=${news.id}&pageNo=1'/>" >
     <div class="bso">
     <div><img src="<%=urlx%>${news.image}"  width="210px" height="150px" /></div>
     <div class="title">${fn:substring(news.title, 0, 10)} </div>
     <div class="djl">点击量（${news.clicks}）</div>
      
     <div class="imgg">
     <c:if test="${news.top==1}">
     <img src="<%=path%>/images/xw_03.png" height="25px" align="middle" />
      </c:if>
     </div>
 	  
 	 </div>
 	 </a>
     </td>
     
     	<c:if test="${NA.count%3==0}">
				</tr>
			<tr>
			</c:if>
		</c:forEach>
    
    </table>
       <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="apshouyenews.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="apshouyenews.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
    
    
   

    
         <%@ include file="foot.jsp"%>
    
</body>
</html>
