<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/news/js/newscheck.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	 <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
				 <input  type="button"  value="添加新闻" id="add"/>
	              <input  type="button"  value="删除新闻" id="del" />
	             
                  </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="10" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">新闻信息列表</td>
                    </tr>
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td>
                    <td width="5%" height="20" align="center" bgcolor="#EEEEEE">新闻ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">标题</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">图片</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">内容</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">发布时间</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">置顶</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">点击量</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">推荐人</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="news"> 
 
    			 
                 <tr align="center">
	 				 <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${news.id}" ></td>
                    <td height="20" bgcolor="#FFFFFF">${news.id}</td>
                    <td bgcolor="#FFFFFF">${fn:substring(news.title, 0, 10)}</td>
                    <td bgcolor="#FFFFFF">
                    <c:choose>
                    <c:when test="${news.image!=null}">
                     <img src="<%=urlx %>${news.image}"  width="100px" height="50px" alt="" />
                    </c:when>
                    </c:choose>
                   </td>
                    <td bgcolor="#FFFFFF"><a href="updatenews.action?id=${news.id}">具体内容点击</a> <%-- ${fn:substring(news.content, 0, 10)} --%> </td>
                    <td bgcolor="#FFFFFF">  ${news.time}</td>
                    <td bgcolor="#FFFFFF">${news.top}</td>
                     <td bgcolor="#FFFFFF">${news.clicks}</td>
                      <td bgcolor="#FFFFFF">${news.referee}</td>
                    <td bgcolor="#FFFFFF">  <a href="updatenews.action?id=${news.id}">修改</a>| <a href="deletenews.action?id=${news.id}"  onclick="return del()">删除</a></td>
                  </tr>  
    		</c:forEach> 
                  <%--   <c:choose>
        <c:when test="${pageSupport.result[0]==null}">
        </c:when>
        <c:when test="${pageSupport.prePage>0}">
          <tr>
        <th align="center" width="100%" colspan="10" bgcolor="#E3E3E3" id="one">
         <a href=" <c:url value='newsall.action?pageNo=${pageSupport.prePage}'/>"style="text-decoration: none;">上一页</a>	
         <a href=" <c:url value='newsall.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
      </c:when>
          <c:otherwise>
           <tr>
        <th align="center" width="100%" colspan="10" bgcolor="#E3E3E3" id="one">     	
         <a href=" <c:url value='newsall.action?pageNo=${pageSupport.nextPage}'/>"style="text-decoration: none;">下一页</a>
        </th>
        </tr>
          </c:otherwise>
          </c:choose>
					</td>
                    </tr>  --%>  
                  
                </table>
                <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    	<c:when test="${pageSupport.startPage!=1}"><a href="newsall.action?pageNo=${pageSupport.prePage}">上一页</a></c:when>	
    	</c:choose></td>
    	<td width="50%" align="left"> 
    	<c:choose><c:when test="${pageSupport.nextPage<=pageSupport.totalPages}"><a href="newsall.action?pageNo=${pageSupport.nextPage}">下一页</a></c:when>
    	</c:choose>
    	</td>
    	</tr>
    	</table>  
   </div>
</body>
</html>
