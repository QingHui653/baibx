<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<!DOCTYPE html>  

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>


<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/giftdetail.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/js/gift.js"></script>

<title>无标题文档</title>
 <script>

 	
 	
 	function wave()
 	{
 				var url="jiaru.action";
 			 var giftname= '${giftdetail.giftname }';
 			 var price='${giftdetail.disprice }';
 			var giftid='${giftdetail.giftid }';
 			var number=$("#nu").val();
			//alert(number);
		 $.ajax({
			url:url,
			type:"post",
			data:{giftname:giftname,price:price,giftid:giftid,number:number},
			dataType:"json",
			 success : function(data) {
				te(data);
			
			},
       		 error:function(){  
           		 alert("加入失败");  
            }  	  
			}); 
 	}
 	
 	 	
 		function te(data) {
	  if(data.messageHelper.result=="S"){
			 alert("加入成功");
			 }
			 else{
			  alert("加入失败");
			 }
  	} 
 	
 	
/* 	$(function(){
 	function wave(data) {
	  if(data.messageHelper.result=="S"){
			 alert("加入成功");
			 }
			 else{
			  alert("加入失败");
			 }
  	}  
 	
 
 		
 	$("#ziti").click(function(){
 			 
 			  var url="jiaru.action";
 			 var giftname= '${giftdetail.giftname }';
 			 var price='${giftdetail.disprice }';
 			var giftid='${giftdetail.giftid }';
 			var number=$("#nu").val();
			//alert(number);
		 $.ajax({
			url:url,
			type:"post",
			data:{giftname:giftname,price:price,giftid:giftid,number:number},
			dataType:"json",
			 success : function(data) {
				wave(data);
			
			},
       		 error:function(){  
           		 alert("加入失败");  
            }  	  
			}); 
		 
 	})  
 	
 	})*/
 </script>

</head>

<body>

	
    	<table width="100%" height="100%" class="all">
    	
    	<form action="goumai.action" method="post" id="subform" name="subform">
    	
    	<input type="hidden" name="userid" value="${userid}">
    	<input type="hidden" name="giftname" value="${giftdetail.giftname }">
			<input type="hidden" name="price" value="${giftdetail.disprice }">
			<input type="hidden" name="giftid" value="${giftdetail.giftid }">
    	<tr><td colspan="3"><img src="<%=urlx%>${giftdetail.giftImage }" height="180px" /></td></tr>
        <tr><td colspan="2"><div>${giftdetail.giftname}</div><div>￥${giftdetail.disprice}&nbsp;<del>市场价￥${giftdetail.giftprice}</del></div></td><td class="ys">已售<br />${giftdetail.sold}</td></tr>
         
          <tr><td><div>购买数量</div></td><td><input type="button" id="j" value="一" c /><input type="text" value="1" name="number" class="number" id="nu"  /><input type="button" value="十" id="jj" /></td><td class="ys">库存<br />${giftdetail.number }</td></tr>
          <tr><td colspan="3" style="text-align:left"><span >简介：</span><br />${giftdetail.giftshow }</td></tr>
          </table>
   
       		<table  width="100%" class="button" cellpadding="0" border="0" >																																			<!-- window.demo.clickOnAndroid	 -->										
          <tr><td width="50%" align="center" class="liji" ><a onclick="document.getElementById('subform').submit();"><div class="ziti"  >立即购买<div></a></td><td width="50%" align="center" class="jiaru"><a id="j" onclick="wave()"><div class="ziti" id=ziti >加入购物车<div></a></td></tr>
    	
    		</form>
    	</table>
     
   

</body>
</html>
