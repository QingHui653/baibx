<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<!DOCTYPE html>  
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/gift.css" rel="stylesheet" type="text/css" />
<title>${information.title}</title>
</head>

<body>
		<table  class="all">
       		 <tr>
       		 <c:forEach items="${pageSupport.result}" var="Giftdetail" varStatus="NA" >
           	

            	<td width="50%" valign="middle" style="border-right:#CCC 1px solid;padding-top: 2% ">
                      <a href="giftdetail.action?giftid=${Giftdetail.giftid}&userid=${userid}" class="aa">  
           <img src="<%=urlx%>${Giftdetail.giftImage }" width="140px  class="img" align="middle" /><br />
 
         	<div style="text-align: center;">${Giftdetail.giftname}</div>
 
           <div style="text-align: center;">现价:${Giftdetail.disprice}</div><div style="text-align:center;">原价<del>${Giftdetail.giftprice}</del></div>
           </a>
           </td>
        	 <c:if test="${NA.count%2==0}">
				</tr>
			<tr>
			</c:if>
         </c:forEach>		
          </tr>      
		</table>
    	</table>
    	
   <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    					
    			<a href="listgift.action?PageNo=${pageSupport.prePage}&userid=${userid}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">		
    			<a href="listgift.action?PageNo=${pageSupport.nextPage}&userid=${userid}">下一页</a>
    			
    			
    			</c:when>
    			</c:choose>
    			</td>
    	</tr>

     </table>
  
</body>
</html>
