<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<!DOCTYPE html> 
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<link href="<%=path%>/adminhoutai/admin/css/fkui.css" rel="stylesheet" type="text/css" />
<title></title>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" >
	
	 	
 	function wave()
 	{
 				var url="addfeedback.action";
 			 var type= document.getElementById("type").value;
 			 var userid='${userb.userid}';
 			var content=document.getElementById("content").value;
 			
			//alert(number);
		 $.ajax({
			url:url,
			type:"post",
			data:{type:type,userid:userid,content:content},
			dataType:"json",
			 success : function(data) {
				te(data);
			
			},
       		 error:function(){  
           		 alert("反馈失败");  
            }  	  
			}); 
 	}
 	
 	 	
 		function te(data) {
	  if(data.messageHelper.result=="S"){
			
			 document.getElementById("content").value="";
			  alert("反馈成功");
			 }
			 else{
			  alert("反馈失败");
			 }
  	} 
 	
	
	
	$(function(){
		$("#fk").click(function(){
		$("#fk").css("background-color","red");
		$("#tj").css("background-color","White");
		$("#type").val(1);
	
		})
		
		$("#tj").click(function(){
		$("#tj").css("background-color","red");
		$("#fk").css("background-color","White");
		$("#type").val(2);
		
		})
		
		$("#content").click(function(){
		var xx=$("#content").val();
		//alert(xx);
		if("写出你的想法"==xx)
		$("#content").val(null);
		})
	
	})
</script>
</head>

<body>
	<table width="100%" height="100%" >
	<form action="addfeedback.action" method="post">
		<table cellspacing="0" class="all" width="100%" height="100%">
        	<input type="hidden" id="type" name="type" value="1"/>
        	<input type="hidden" name="userid" value="${userb.userid}"/>
        	<tr><td  class="fkui" id="fk" style="background-color: red;">反馈建议</td><td class="tuij" id="tj">推荐好文</td></tr>
        	<tr><td colspan="2" class="neir"><textarea class="input" name="content"  id="content" >写出你的想法</textarea></td></tr>
            </table>
            <table width="100%" height="100%" cellspacing="0" class="b">
             <tr><td width="40%" style="padding-left:10%; text-align:right;">百宝箱账号：</td> <td width="40%" align="left">${userb.userid}</td></tr>
          	<tr><td colspan="2" align="center" class="button"> 
          	 </form>																<!-- window.demo.clickOnAndroid() -->
          	  <input type="submit" value="提交" class="tijiao" onclick="wave()" /> </td>
            </tr>
     
        </table>
   
</table>
</body>
</html>
