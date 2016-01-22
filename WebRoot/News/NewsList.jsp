<%@ include file="../common/head.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<link  href="Css/te.css" type="text/css" rel="stylesheet"/>
<link href="Css/cate.css" type="text/css" rel="stylesheet">

<script   src="JS/te.js"  type="text/javascript"></script>
<script type="text/javascript">
var totalheight = 0;     //定义一个总的高度变量
function lota()
{ 
    totalheight = parseFloat($(window).height()) + parseFloat($(window).scrollTop());     //浏览器的高度加上滚动条的高度 

    if ($(document).height() <= totalheight)     //当文档的高度小于或者等于总的高度的时候，开始动态加载数据
    { 
   
    	var list = [];
		var ddx=$("#PageNo").val();
		var totalPage=$("#totalPage").val();
        //加载数据
    var numA= parseInt(ddx);
	var numB= parseInt(totalPage);
	
	// alert("当前页面"+numA);
	//alert("总页面"+numB); 
       var url="/baibx/jsonpage.action";
		 if(numA<=numB){
		$.ajax({
			url:url,
			type:"post",
			data:{pageNo:ddx},
			dataType:"json",
			 success : function(data) {
			  var ddx=$("#PageNo").val(data.pageSupport.nextPage);
			  var ddx=$("#totalPage").val(data.pageSupport.totalPages);
			 for(var i=0;i<data.pageSupport.result.length;i++)
			{
				var time=data.pageSupport.result[i].time;
				var date=time.substr(0,10); 
				
				//alert(date);
			
				//var formatDate = df.format(data.pageSupport.result[i].time);
			$("#qqq").append("<tr class='a'><td class='s'> <a href='findnews.action?id="+data.pageSupport.result[i].id+"&pageNo=1'>"+data.pageSupport.result[i].title+"</a></td><td class='x'>"+date+"</td><td class='s'> <a href='updatenews.action?id="+data.pageSupport.result[i].id+"'>修改</a></td><td class='s'> <a href='deletenews.action?id="+data.pageSupport.result[i].id+"'>删除</a></td></tr>");
			 } 
			},
       		 error:function(){  
           		 alert("失败");  
            }  	  
			}); 
			
		}
    } 
} 

$(window).scroll( function() { 
    //console.log("滚动条到顶部的垂直高度: "+$(document).scrollTop()); 
    //console.log("页面的文档高度 ："+$(document).height());
    //console.log('浏览器的高度：'+$(window).height());
    lota();
}); 
</script>


<title>所有新闻</title>
</head>

<body>
			<table width="100%" border="0" height="100%" align="center" id="qqq">
		 
	
        	<th align="center" width="100%" colspan="2" bgcolor="#E3E3E3" id="one">新闻列表</th>
             <c:forEach items="${pageSupport.result}" var="news"> 
        	<tr height="20%" class="a" >
            	<td width="70%" align="center" class="s">
            	<a href=" <c:url value='findnews.action?id=${news.id}&pageNo=1'/>" style="text-decoration: none;"> ${news.title}</a>
                	</td>
                <td width="30%" align="center" class="x">
                 <fmt:formatDate pattern="yyyy-MM-dd" value="${news.time}" />
                <%-- <fmt:formatDate value="${news.time}" type="date"/> --%>
                </td>   
                <td><a href=" <c:url value='updatenews.action?id=${news.id}'/>" style="text-decoration: none;">修改</a></td> 
            	<td><a href=" <c:url value='deletenews.action?id=${news.id}'/>" style="text-decoration: none;">删除</a></td>
            </tr>
              </c:forEach>
              
          <input type="hidden" value="${pageSupport.nextPage}" id="PageNo"/>
            <input type="hidden" value="1000" id="totalPage"/> 
        </table>

</body>
</html>
