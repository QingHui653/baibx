<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<head>
<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path%>/AppWeb/css/ziliao.css" rel="stylesheet" type="text/css">
<title>保险资料</title>
</head>

<body>

   <!-- <iframe frameborder="0" width="100%" height=506px; src="top.html" name="top"></iframe> -->
    <%@ include file="heart.jsp" %>
     <div class="banner"><img src="<%=path%>/images/banner (1024).png"></div>
   
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
  	<table align="center" class="aaaa">
    
    	<tr><td><a href="apstudyslist.action?PageNo=1&type=video"><div><div><img src="<%=path%>/images/study_video.png" /></div><div align="center" class="title">保险视频</div></div></a></td>	
        <td class="co"><a href="apstudyslist.action?PageNo=1&type=Increase"><div><div><img src="<%=path%>/images/study_add.png" /></div><div align="center" class="title">增员技巧</div></div></a></td>
        <td><a href="apstudyslist.action?PageNo=1&type=EarlyResources"><div><div><img src="<%=path%>/images/study_resource.png" /></div><div align="center" class="title">早会资源</div></div></a></td>
        </tr>
        
         	<tr><td><a href="apstudyslist.action?PageNo=1&type=Marketing"><div><div><img src="<%=path%>/images/sduty_skill.png" /></div><div align="center" class="title">营销技能</div></div></a></td>
        <td class="co"><a href="apstudyslist.action?PageNo=1&type=DevelopCustomer"><div><div><img src="<%=path%>/images/study_zhugu.png" /></div><div align="center" class="title">主顾开拓</div></div></a></td>
        <td><a href="apstudyslist.action?PageNo=1&type=MasterShare"><div><div><img src="<%=path%>/images/study_share.png" /></div><div align="center" class="title">高手分享</div></div></a></td>
        </tr>
            
            	<tr><td><a href="apstudyslist.action?PageNo=1&type=InsuranceRules"><div><div><img src="<%=path%>/images/study_zige.png" /></div><div align="center" class="title">投保资格</div></div></a></td>
        <td class="co"><a href="apstudyslist.action?PageNo=1&type=Success"><div><div><img src="<%=path%>/images/study_jili.png" /></div><div align="center" class="title">成功激励</div></div></a></td>
        <td><a href="apstudyslist.action?PageNo=1&type=Industry"><div><div><img src="<%=path%>/images/study_knowledge.png" /></div><div align="center" class="title">行业知识</div></div></a></td>
        </tr>

      
    </table>
  
    
    
   

    
         <%@ include file="foot.jsp"%>
    
</body>
</html>
