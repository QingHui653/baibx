<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="../../common/head.jsp"%>
<head>
<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path%>/AppWeb/css/detail.css" rel="stylesheet" type="text/css">
<title>保险资讯</title>
</head>

<body>

   <!-- <iframe frameborder="0" width="100%" height=506px; src="top.html" name="top"></iframe> -->
    <%@ include file="heart.jsp" %>
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
   
	<table align="center" width="700px" class="table">
    	<tr><td colspan="2" class="title">${news.title}</td></tr>
        <tr><td>${fn:substring(news.time, 0, 10)}</td>
        <c:choose>
        	<c:when test="${news.referee==null}"></c:when>
        	<c:when test="${not empty news.referee}"> <td>${news.referee}推荐</td></c:when>
        </c:choose>
       
        </tr>
        <tr><td class="im" colspan="2">${news.content }</td></tr>
    	<tr><td> <div class="bdsharebuttonbox" data-tag="share_1"><span style='float:left;line-height:36px'>分享到：
            </span>
	<a class="bds_mshare" data-cmd="mshare"></a>
	<a class="bds_qzone" data-cmd="qzone" href="#"></a>
	<a class="bds_tsina" data-cmd="tsina"></a>
	<a class="bds_baidu" data-cmd="baidu"></a>
	<a class="bds_renren" data-cmd="renren"></a>
	<a class="bds_tqq" data-cmd="tqq"></a>
    <a class="bds_weixin" data-cmd="weixin"></a>
	<a class="bds_more" data-cmd="more">更多</a>
	
</div></td></tr>
    </table>

<script>


	window._bd_share_config = {
		common : {
			bdText : '自定义分享内容',	
			bdDesc : '自定义分享摘要',
			bdUrl : document.URL,
			
			bdPic : '自定义分享图片'
		},
		share : [{
			"bdSize" : 16
		}],
		slide : [{	   
			bdImg : 0,
			bdPos : "right",
			bdTop : 100
		}],
		image : [{
			viewType : 'list',
			viewPos : 'top',
			viewColor : 'black',
			viewSize : '16',
			viewList : ['qzone','tsina','huaban','tqq','renren']
		}],
		selectShare : [{
			"bdselectMiniList" : ['qzone','tqq','kaixin001','bdxc','tqf']
		}]
	}
	with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src=		'http://bdimg.share.baidu.com/static/api/js/share.js?cdnversion='+~(-new Date()/36e5)];
	</script>
    
    
   

    
         <%@ include file="foot.jsp"%>
    
</body>
</html>
