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
 
    <form action="addgift.action" method="post"  enctype="multipart/form-data">
    <table  class="ta" align="center">
     
    <tr>  <td>商品名称：</td><td><input type="text" name="giftname" value=""></td></tr>
    <tr> <td>商品图片：</td><td><input type="file" name="giftImage"></td></tr>
    
    <tr> <td>商品库存：</td><td><input type="text" name="number"></td></tr>
    <tr><td> 商品已售：</td><td><input type="text" name="sold"></td></tr>
    <tr> <td> 商品原价：</td><td><input type="text" name="giftprice"></td></tr>
     <tr><td>商品折扣价：</td><td><input type="text" name="disprice"></td></tr>
      <tr> <td>商品详情：</td><td><textarea cols="40" rows="5" class="input" name="giftshow"  id="content" ></textarea></td></tr>
       <tr> <td colspan="2" align="center"><input type=submit value="确 定" width="50px"/></td></tr>

   </table>
    
 

			
    </form>
    </div>
  </body>
</html>
