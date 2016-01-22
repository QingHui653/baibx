<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%> 
<link href="<%=path%>/AppWeb/css/styles.css" rel="stylesheet" type="text/css">
<title>百保箱首页</title>
</head>

<body>
	<%@ include file="heart.jsp" %>
    
    <div class="banner"><img src="<%=path%>/AppWeb/images/banner (1024).png"></div>
    
    
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
    <div class="photobox"><img class="app" src="<%=path%>/AppWeb/images/APP.png"></div>
    
    
    <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">2.</span>
                    <span class="title fr">保险资料</span>
                </div>
        	</span>
        </span>
    </div>
    <div class="databox">
    	<div style=" width:951px; margin:auto;">
       
      <c:forEach items="${newsPage.result}" var="news" varStatus="status"> 
   <a href=" <c:url value='apnewsdetail.action?id=${news.id}&pageNo=1'/>" >
    	<img class="fl img${status.index + 1}" src="<%=urlx%>${news.image} ">
    </a>
    </c:forEach>         
            
            
            
            
    	</div>

    </div>
    
    <div class="Column">
		<span class="Arrow">
        	<span class="centerbox">
        		<div class="fl line"></div>
		    	<div class="fr line"></div>
                <div class="caption">
                	<span class="number fl">3.</span>
                    <span class="title fr">保险资讯</span>
                </div>
        	</span>
        </span>
    </div>
    <div class="Information1024">
    	<div class="mainleft fl">
            <h1 class="fl"><a href="<c:url value='apnewsdetail.action?id=${newsPage.result[0].id}&pageNo=1'/>">${newsPage.result[0].title} </a></h1>
           <%--  <h2 class="Slightly"><a href="<c:url value='apnewsdetail.action?id=${newsPage.result[1].id}&pageNo=1'/>">${newsPage.result[1].title} </a></h2>						 --%>
        </div> 
        
    	<div class="mainright fr">
        	<a class="fr imgnews1" href="<c:url value='apnewsdetail.action?id=${newsPage.result[0].id}&pageNo=1'/>"><img src="<%=urlx%>${newsPage.result[0].image} " width="320px" height="200px"></a>
        </div>              	
    </div>
    <div class="newlist">
            	<ul class="fl">
            		<!-- <li><a href="">保险增员必备的八个关键点八个关键点</a></li>
            		<li><a href="">成功增员医护人员八个关键点</a></li>
            		<li><a href="">跟《水浒传》学增员八个关键点</a></li>
            		<li><a href="">这样增员，你造吗？八个关键点</a></li>
            		<li><a href="">主管增员十大财富八个关键点</a></li>
            		<li><a href="">跟《水浒传》学增员八个关键点</a></li>  -->
            		<c:forEach items="${inforPage1.result}" var="infor" >
            		<li><a href=" <c:url value='apstudyDetail.action?id=${infor.id}&pageNo=1'/>" >${fn:substring(infor.title, 0, 17)}</a></li>
            	  </c:forEach>                   
                </ul>
            	<ul class="fr">
            	<!-- 	<li><a href="">保险增员必备的八个关键点八个关键点</a></li>
            		<li><a href="">成功增员医护人员八个关键点</a></li>
            		<li><a href="">跟《水浒传》学增员八个关键点</a></li>
            		<li><a href="">这样增员，你造吗？八个关键点</a></li>
            		<li><a href="">主管增员十大财富八个关键点</a></li>
            		<li><a href="">跟《水浒传》学增员八个关键点</a></li>     -->
            		 <c:forEach items="${inforPage2.result}" var="infor" >
            		<li><a href=" <c:url value='apstudyDetail.action?id=${infor.id}&pageNo=1'/>" >${fn:substring(infor.title, 0, 17)}</a></li>
            	  </c:forEach>                
                </ul>
                
            </div>
    
 <%@ include file="foot.jsp"%> 
    
    
</body>
</html>