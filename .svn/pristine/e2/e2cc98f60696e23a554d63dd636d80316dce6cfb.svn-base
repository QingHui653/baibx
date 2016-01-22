<%@ include file="../common/head.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<link href="Css/newall.css" type="text/css" rel="stylesheet">

<script   src="JS/te.js"  type="text/javascript"></script>
<script src="JS/newall.js" type="text/javascript"></script>

<title>所有新闻</title>
</head>

<body>
			<table width="100%" border="0" height="100%" align="center" id="qqq">
		 
	
        	<th align="center" width="100%" colspan="2" bgcolor="#E3E3E3" id="one">新闻列表</th>
        	
             <c:forEach items="${pageSupport.result}" var="news"> 
        	<tr height="20%" class="a" >
            	<td width="70%" align="left" class="s" height="100px">
            	<c:if test="${news.top==1}">
            	<img src="/baibx/images/re.png" width="15px" height="20px" />
            	</c:if>
            	<a href=" <c:url value='findnews.action?id=${news.id}&pageNo=1'/>" > ${news.title}</a>
                	<br /> <br/><br/>
                	<fmt:formatDate pattern="yyyy-MM-dd" value="${news.time}" />
                	<p align="right">${news.clicks}</p>
                			
                	</td>
                <td width="30%" align="center" class="x"  height="100px">
                	 <c:choose>
                    <c:when test="${news.image!=null}">
                    	 <img src="${news.image}"  width="100px" height="50px" alt="" />
                    </c:when>
                    </c:choose>
                    </td>  
                 <%-- <fmt:formatDate pattern="yyyy-MM-dd" value="${news.time}" /> --%>
                <%-- <fmt:formatDate value="${news.time}" type="date"/> --%>
                  
            </tr>
              </c:forEach>
              
          <input type="hidden" value="${pageSupport.nextPage}" id="PageNo"/>
            <input type="hidden" value="1000" id="totalPage"/> 
        </table>

</body>
</html>
