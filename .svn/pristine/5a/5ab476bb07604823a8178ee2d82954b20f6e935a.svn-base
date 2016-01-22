<%@ page contentType="text/html; charset=UTF-8" %>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%
String z = request.getContextPath();
%>
<link href="/baibx/Css/style.css" rel="stylesheet" type="text/css">
<title></title>
</head>

<body>
   <div class="Footer">
    	<ul class="footerlist">
        	<li><a href="<%=z%>/web/bbx/guanyu.jsp">关于我们</a></li>
            <li><a href="<%=z%>/web/bbx/shengming.jsp">负责声明</a></li>
            <li><a href="<%=z%>/web/bbx/lianxiwomen.jsp">联系我们</a></li>
            <!-- <li><a href="">诚聘英才</a></li> -->
            <li><a class="bordernone" id="ff"  href="PCFankui.action?userid=${userl.userid}" target="_blank">意见反馈</a></li>        
        </ul>
        <div class="suggestions">投诉与建议：bbxapp@163.com</div>
        <div class="Copyright">© 2008-2015 BBXAPP.COM（百宝箱）增值电信经营许可证号：粤ICP备15057777号</div>
    </div>
    
       
    <script  src="<%=z %>/JS/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script>
	
		
	
	$(function(){
		
		if('${userl.userid}'==""|'${userl.userid}'==null){
			$("#ff").click(function(){
			alert("登入的用户才能反馈");
				return false;
			})
		}else{
			return true;
		}
	
	
	
	
			
		})
	
	
	</script>    
    
    
    
    
</body>
</html>
