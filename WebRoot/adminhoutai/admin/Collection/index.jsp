<%@ include file="../../../common/head.jsp"%>

<%@ page contentType="text/html; charset=UTF-8" %>
<link href="Css/newall.css" type="text/css" rel="stylesheet">

<script   src="JS/te.js"  type="text/javascript"></script>
<!-- <script src="JS/studyall.js" type="text/javascript"></script> -->

<title>所有收藏</title>
</head>

<body>
			<table width="100%" border="0" height="100%" align="center" id="qqq">
		 
	
        	<th align="center" width="100%" colspan="2" bgcolor="#E3E3E3" id="one">
      		 收藏列表
        </th>
        		<form action="mohulist.action" method="get">
        			<input type="text" name="title" />
        			<input type="submit" value="OK"></button>
        		</form>
        
             <c:forEach items="${pageSupport.result}" var="Collection"> 
        	<tr height="20%" class="a" >
            	<td width="70%" align="left" class="s" height="100px">
            	<c:if test="${Collection.top==1}">
            	<img src="/baibx/images/re.png" width="15px" height="20px" />
            	</c:if>
            	<a href=" <c:url value='${Collection.url }'/>" > ${Collection.title}</a>
                </td> 
            </tr>
              </c:forEach>

           <tr><td> <a href="shoucanlist.action?PageNo=${pageSupport.nextPage}">下一页</a></td></tr>
           
        </table>

</body>
</html>
