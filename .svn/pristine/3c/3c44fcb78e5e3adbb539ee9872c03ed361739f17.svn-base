<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<title>无标题文档</title>

<script type="text/javascript" src="<%=path%>/adminhoutai/admin/admins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/adminhoutai/admin/news/js/check.js"></script>
<script type="text/javascript" >
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
		$("#content").val(null);
		})
	
	})
</script>
</head>

<body>
		
		<table width="100%"   align="center"  style="border:1px solid gray;" cellspacing="0"  >
		<form action="addfeedback.action" method="post">
			<input type="hidden" id="type" name="type" value=""/>
			
			<input type="hidden" name="userid" value="${userb.userid}"/>
			
			<tr><td width="50%" id="fk" style="border-right:2px solid; gray ">反馈建议</td><td width="50%" id="tj">推荐好文</td></tr>
			<tr><td colspan="2"><input type="text" style=" width: 99%;height:300px" name="content" id="content"  value="写出你的想法"></input></td></tr>		
          <tr><td colspan="2" style="width:100%">百宝箱账号:${userb.userid}</td></tr>
          	<tr><td colspan="2" align="center"> <input type="submit" value="提交" width="40%" style="background-color:blue; color: white; width: 40%"/> </td></tr>
           </form>
             </table>
   
</body>
</html>
