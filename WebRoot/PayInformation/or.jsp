<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../common/head.jsp" %>
<head>
<link href="Css/zhifu.css" rel="stylesheet" type="text/css">

<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<title></title>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" >
		 	
 	function wave()
 	{
 				var url="querenzf.action";
 				var phone='${payinformation.phone}';
 				 var userid='${userb.userid}';
 				var id='${payinformation.id}';
 			
			
		 $.ajax({
			url:url,
			type:"post",
			data:{phone:phone,userid:userid,id:id},
			dataType:"json",
			 success : function(data) {
				te(data);
			
			},
       		 error:function(){  
           		 alert("支付失败");  
            }  	  
			}); 
 	}
 	
 	 	
 		function te(data) {
	  if(data.messageHelper.result=="S"){
			  alert("支付成功");
			 }
			 else{
			  alert("支付失败");
			 }
  	} 
 	


</script>
</head>

<body>
<table width="100%" height="90%" class="all" bgcolor="#FFFFFF">
<table width="100%" style="padding-top:4%">
<tr><td width="20%"></td><td width="60%" align="center"> <img  src="images/ddxq.png" width="100%" class="daohang" align="middle" /></td><td  width="20%"></td></tr>
</table>
    
   	 <table class="list3" style="margin-left:5%" >
   	 
    <tr>
    <c:choose>
				<c:when test="${userb.type=='user'}">
    <td  style="padding-top:5%; font-size:150%" ><input type="checkbox" checked="checked" /><u>购买百宝箱业务员版</u></td>
    	</c:when>
    	<c:when test="${userb.type=='custom'}">
    	<td  style="padding-top:5%; font-size:150%" ><input type="checkbox" checked="checked" /><u>购买百宝箱客户版</u></td>
    
    	</c:when>
    	</c:choose>
    </tr>
        <tr>
        <c:choose>
				<c:when test="${payinformation.productgroup=='twoYear'}">
        <td  style="padding-top:8%; font-size:150%"   ><input type="checkbox" checked="checked" /><u>使用期限2年(730天)</u></td>
       			 </c:when>
       			 		<c:when test="${payinformation.productgroup=='twoYear'}">
        <td  style="padding-top:8%; font-size:150%"   ><input type="checkbox" checked="checked" /><u>使用期限1年(365天)</u></td>
       			 </c:when>
       			 </c:choose>
        </tr>
        <tr>
        <c:choose>
 		<c:when test="${payinformation.gold!=null}">
        <td  style="padding-top:8%; font-size:150%"  ><input type="checkbox"  checked="checked"/><u>使用${payinformation.gold}个金元宝抵押${payinformation.gold/100}元</u>
        </td>
        </c:when>
        </c:choose>
        </tr>
        <tr><td style="padding-top:8%; font-size:150%"   ><input type="checkbox" checked="checked" /><u>还需支付${ payinformation.price}</u></td></tr>
        <tr><td style="padding-top:8%; font-size:150%;"><u>温馨提示：支付成功后，我们将发送<br /><br>激活码到${ payinformation.phone}，请仔细确认<br /><br />订单和手机号码。</u></td> </tr>
	</table>
        
        	
          	<table  class="button1">
            	<tr><td  width="100%" style="padding-bottom:3%; padding-top:2%">
            	<input type="button" value="订单有误,返回修改" class="ywu" onclick="location.href='youwudd.action?userid=${userb.userid}&id=${payinformation.id}'" /> 
            	</td></tr>
                <tr><td  width="100%" style="padding-top:8%">
                <input type="submit" value="订单无误,确认支付" class="wwu"  onclick="window.demo.clickOnAndroid()"  /> 
                </td></tr>
            </table>
    
   
   </table>
</body>
</html>
