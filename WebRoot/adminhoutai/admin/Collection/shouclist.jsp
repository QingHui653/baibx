<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/shouc.css" rel="stylesheet" type="text/css" />
<title>无标题文档</title>
<script type="text/javascript">
	 function getid(id){
		//alert($(this).css('color'));
			
		//var color=$("#"+id).css("color");	
		//alert(color);
		var idd=id;
		var url="zhidingshoucan.action";
			$.ajax({
			url:url,
			type:"get",
			data:{id:idd},
			dataType:"json",
			success:function(data){
			 	if(data.messageHelper.result=='1'){
			 		$("#"+id).css("color","#CCCCCC");
			 	}
			 	else if(data.messageHelper.result=='0'){
			 		$("#"+id).css("color","#CC0000");
			 	}
			 },
			  error:function(){  
           		 alert("失败");  
            }  	  
			 
			 })
		
		}

	
	
	
	
	
</script>
</head>

<body>

	<table  class="all">
	
	 <c:forEach items="${pageSupport.result}" var="Collection"> 
    	<tr>
    	<c:if test="${Collection.top==1}">
    		<td class="zhiding"  id="${Collection.id}" width="15%" style="color:#CC0000"  onclick="return getid(this.id)" ><input type="hidden" id="aid" value="${Collection.id}"/>置顶</td>
    	</c:if>
    	<c:if test="${Collection.top==0}">
    		<td class="zhiding"  id="${Collection.id}" width="15%" style="color:#CCCCCC" onclick="return getid(this.id)"> <input type="hidden" id="aid" value="${Collection.id}"/>置顶</td>
    	</c:if>
    	<td class="title" width="85%"><a href="${Collection.url }">${Collection.title}</a></td>
    	</tr>
     </c:forEach>
    </table>
    
    <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="shoucanlist.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="shoucanlist.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
</body>
</html>