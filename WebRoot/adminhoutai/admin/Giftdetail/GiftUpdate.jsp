<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>My JSP 'index.jsp' starting page</title>
<style type="text/css">
.ta{background-color: activecaption;}
.ta tr td{ padding-top: 5px; padding-left: 5px;}
</style>

  </head>
  
  <body>
    <div>
 
    <form action="updategift.action" method="post"  enctype="multipart/form-data">
    <table  class="ta" align="center">
     	<input type="hidden" name="giftid" value="${giftdetail.giftid}">
    <tr>  <td>商品名称：</td><td><input type="text" name="giftname" value="${giftdetail.giftname}"></td></tr>
    <tr><img src="<%=urlx %>${giftdetail.giftImage}"  width="200px" height="150px" alt="" /> <td>商品图片：</td> <td>${fn:substring(giftdetail.giftImage, 14, 100)} <input type="file" name="giftImage"></td></tr>
    
    <tr> <td>商品库存：</td><td><input type="text" name="number" value="${giftdetail.number}"></td></tr>
    <tr><td> 商品已售：</td><td><input type="text" name="sold" value="${giftdetail.sold}"></td></tr>
    <tr> <td> 商品原价：</td><td><input type="text" name="giftprice" value="${giftdetail.giftprice}"></td></tr>
     <tr><td>商品折扣价：</td><td><input type="text" name="disprice" value="${giftdetail.disprice}"></td></tr>
      <tr> <td>商品详情：</td><td><textarea cols="40" rows="5" class="input" name="giftshow"  id="content" > ${giftdetail.giftshow}</textarea></td></tr>
       <tr> <td colspan="2" align="center"><input type=submit value="确 定" width="50px"/></td></tr>

   </table>
    
 

			
    </form>
    </div>
  </body>
</html>
