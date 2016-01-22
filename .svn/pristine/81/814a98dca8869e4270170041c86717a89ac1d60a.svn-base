<%@ page contentType="text/html; charset=UTF-8" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%@ include file="../../common/head.jsp"%>

<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path %>/Css/style.css" rel="stylesheet" type="text/css">
	
<title>百保箱</title>
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
                    <span class="title fr">APP介绍</span>
                </div>
        	</span>
        </span>
    </div>
    <div class="photobox"><img class="app" src="<%=path%>/images/APP.png"></div>
    
    
    <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">2.</span>
                    <span class="title fr">保险资讯</span>
                </div>
        	</span>
        </span>
    </div>
    <div class="databox">
   	 <c:forEach items="${newsPage.result}" var="news" varStatus="status"> 
   <a href=" <c:url value='newsdetail.action?id=${news.id}&pageNo=1'/>" >
    	<img class="fl img${status.index + 1}" src="<%=urlx%>${news.image} " width="330px;" height="248px;">
    </a>
    </c:forEach>   
    </div>
    
    
    <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">3.</span>
                    <span class="title fr">保险资料</span>
                </div>
        	</span>
        </span>
    </div>
    <div class="Information1024">
    	    	<div class="mainleft fl">
            <h1 class="fl"><a class="fl" href=" <c:url value='newsdetail.action?id=${newsPage.result[0].id}&pageNo=1'/>" >${newsPage.result[0].title}<span class="fr recommendation">&nbsp;&nbsp;今日推荐</span></a></h1>
            <h2 class="Slightly"> <%-- ${fn:substring(newsPage.result[0].content, 0, 10)} --%></h2>
			<div class="newlist">
            	<ul class="fl">
            	<c:forEach items="${inforPage1.result}" var="infor" > 
            		<li><span>${fn:substring(infor.time, 0, 11)}</span><a href=" <c:url value='studyDetail.action?id=${infor.id}&pageNo=1' />"  >${fn:substring(infor.title, 0, 17)}</a></li>
               
               </c:forEach>
                </ul>
            	<ul class="fr">
            	 <c:forEach items="${inforPage2.result}" var="infor" >
            		<li><span>${fn:substring(infor.time, 0, 11)}</span><a href=" <c:url value='studyDetail.action?id=${infor.id}&pageNo=1'/>" >${fn:substring(infor.title, 0, 17)}</a></li>
            	  </c:forEach>
                </ul>
                
            </div>
        </div>
    

        
        
    	<div class="mainright fr">
    	
         <a class="fr imgnews1" href=" <c:url value='newsdetail.action?id=${newsPage.result[0].id}&pageNo=1'/>" ><img src="<%=urlx%>${newsPage.result[0].image} " width="320px" height="139px"></a> 
           <a class="fr imgnews2" href=" <c:url value='newsdetail.action?id=${newsPage.result[1].id}&pageNo=1'/>" ><img src="<%=urlx%>${newsPage.result[1].image} " width="320px" height="139px"></a>
        </div>
    </div>
    
         <%@ include file="foot.jsp"%>
    
</body>
</html>
