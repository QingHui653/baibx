<%@ page contentType="text/html; charset=UTF-8" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%@ include file="../../common/head.jsp"%>

<!-- <meta http-equiv='refresh' content='0;url=newss.action'> -->
<link href="<%=path %>/Css/login.css" rel="stylesheet" type="text/css">
	
<title>百宝箱登入页面</title>

	<script type="text/javascript">
		if('${error}'!=""){
		alert('${error}');
		}
		if('${pass}'!=""){
		alert('${pass}');
		}
		
	
	
	</script>    


</head>

<body>
			<div class="logobox"><a href="index.action"><span class="fl leftlogo">百保箱</span></a></div>
    
    <div class="bannerbox">
    	<div class="box1024">
        	<div class="fr enterbox">
            	<h1>百保箱会员</h1>
            	<form action="userblogin.action" method="post" id="subform">
                <div class="accountbox"><div class="fr textbox"><input type="text" name="userid"></div></div>
                <div class="passwordbox"><div class="fr textbox"><input type="password" name="password"></div></div>
                <a class="enterbutton" id="enterbutton"  name="submit" onclick="document.getElementById('subform').submit();" >登录</a>
                </form>
            </div>
    	</div>
    </div>   

         <%@ include file="foot.jsp"%>
    
</body>
</html>
