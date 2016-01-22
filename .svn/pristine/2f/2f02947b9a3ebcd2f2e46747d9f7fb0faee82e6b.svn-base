<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/js/giftlistcheck.js"></script>
</head>

<body>
 <div class="lists">
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0"></table>

          	 <tr>
               <td height="20"><span>
               <input id="selAll" type="button" value="全选" />
               <input id="reverSel" type="button" value="反选" />
                <input id="unSelAll" type="button" value="全不选" /></span>
               
                 <input  type="button"  value="添加礼品" id="add"/>
	              <input  type="button"  value="删除礼品" id="del" />
	             
                  </td>
          	 </tr>
              <tr>
                <td height="40" class="font42"><table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					                  <tr>
                    <td height="20" colspan="10" align="center" bgcolor="#EEEEEE"class="tablestyle_title" style="text-align:center;">礼品信息列表</td>
                    </tr>
                  <tr>
				    <td width="5%" align="center" bgcolor="#EEEEEE">
                    <input  class="btn btn-default" type="checkbox" id="operAll" />
                    
                    选择</td>
                    <td width="5%" height="20" align="center" bgcolor="#EEEEEE">礼品ID</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">礼品名字</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">图片</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">原价</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">折扣价</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">库存</td>
                    <td width="8%" align="center" bgcolor="#EEEEEE">已售</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">说明</td>
                       <td width="8%" align="center" bgcolor="#EEEEEE">操作</td>
                  </tr>
                 <c:forEach items="${pageSupport.result}" var="Giftdetail"> 
 
    			 
                 <tr align="center">
	 				 <td bgcolor="#FFFFFF"><input type="checkbox" name="id" value="${Giftdetail.giftid}" ></td>
                    <td height="20" bgcolor="#FFFFFF">${Giftdetail.giftid}</td>
                    <td bgcolor="#FFFFFF">${fn:substring(Giftdetail.giftname, 0, 10)}</td>
                    <td bgcolor="#FFFFFF">
                    <c:choose>
                    <c:when test="${Giftdetail.giftImage!=null}">
                     <img src="<%=urlx %>${Giftdetail.giftImage}"  width="100px" height="50px" alt="" />
                    </c:when>
                    </c:choose>
                   </td>
                    <td bgcolor="#FFFFFF"> ${Giftdetail.giftprice} </td>
                    <td bgcolor="#FFFFFF"> ${Giftdetail.disprice}</td>
                    <td bgcolor="#FFFFFF">${Giftdetail.number}</td>
                     <td bgcolor="#FFFFFF">${Giftdetail.sold}</td>
                     <td bgcolor="#FFFFFF">${fn:substring(Giftdetail.giftshow, 0, 30)}</td>
                    
                    <td bgcolor="#FFFFFF">  <a href="goupgift.action?giftid=${Giftdetail.giftid}">修改</a>| <a href="deleteGift.action?giftid=${Giftdetail.giftid}"  onclick="return del()">删除</a></td>
                  </tr>    
    		</c:forEach> 
                </table>
        
                  
    <table width="100%" class="sxye">
    	<tr>
    		<td align="right" width="50%">
    			<c:choose>
    		<c:when test="${pageSupport.startPage!=1}">
    		
    			<a href="houtailistgift.action?pageNo=${pageSupport.prePage}">上一页</a>
    					</c:when>	
    	</c:choose>
    			</td>
    	
    	<td width="50%" align="left"> 
    	<c:choose>
    		<c:when test="${pageSupport.nextPage<=pageSupport.totalPages}">
    		
    			<a href="houtailistgift.action?pageNo=${pageSupport.nextPage}">下一页</a>
    			</c:when>
    			</c:choose>
    			</td>
    			
    	</tr>
    
     </table>
                
   </div>
</body>
</html>
