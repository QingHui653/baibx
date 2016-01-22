<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/huashu.css" rel="stylesheet" type="text/css" />
<title></title>
<style type="text/css">
.ia{text-decoration: none;color: #000000}
</style>
</head>

<body>
<table width="100%" height="100%" >
	   <table width="100%" style="padding-top: 4%">
        	<tr><td style="height:295px;"valign="top"> 
            	<%-- <input type="text" value="${invitation.content}" style="width:100%; height:100%; border:none" readonly="readonly" />
            	 --%>
            	 ${invitation.content}
            	 
             </td></tr>
            <tr><td class="share">资料分享</td></tr>
            <c:forEach items="${collections }" var="collection">
             <tr><td class="co"><a href="${collection.url}">${collection.title}</a>    </td></tr>
             </c:forEach>
             <tr><td class="share">我的名片</td></tr>
        </table>
    
       <c:if test="${!empty userb}">
    <table width="100%" class="mp">
    	<tr><td colspan="3"><img src="<%=path%>/adminhoutai/admin/images/dli.png" width="100%" /></td></tr>
        <tr><td width="25%"><img src="<%=path%>/adminhoutai/admin/images/rw.png"  width="100%"  /></td>
        	<td width="50%" align="center"><span>${userb.name}</span><br /><span>${userb.insurer}</span></td>
            <td width="25%"><img src="<%=path%>/adminhoutai/admin/images/tub.png" width="100%" /></td></tr>
		<tr> <td width="90%" colspan="3" class="call"  ><a href="tel:${userb.phone}" class="ia">${userb.phone }</a></td></tr>  	
    </table>
        </c:if>
        </table>
        
        
	<div class="bdsharebuttonbox" data-tag="share_1"><span style='float:left;line-height:36px'>分享到：
            </span>
	<a class="bds_mshare" data-cmd="mshare"></a>
	<a class="bds_qzone" data-cmd="qzone" href="#"></a>
	<a class="bds_tsina" data-cmd="tsina"></a>
	<a class="bds_baidu" data-cmd="baidu"></a>
	<a class="bds_renren" data-cmd="renren"></a>
	<a class="bds_tqq" data-cmd="tqq"></a>
    <a class="bds_weixin" data-cmd="weixin"></a>
	<a class="bds_more" data-cmd="more">更多</a>
	
</div>
<script>
	//alert(document.URL+'${userb.userid}');
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

</body>
</html>
