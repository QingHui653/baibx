<%@ page contentType="text/html; charset=UTF-8" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%@ include file="../../common/head.jsp"%>
<meta name="viewport" content="target-densitydpi=device-dpi, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="<%=path %>/AppWeb/css/entry.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>百保箱登录</title>
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
	<div class="logobox"><span class="fl leftlogo">百保箱</span></div>
    
        	<div class="fr enterbox">
            	<h1>会员登录</h1>
            	<form action="apuserblogin.action" method="post" id="subform">
                <div class="">
                <div class="accountbox"><input type="text" name="userid"  class="input"/></div>
                <div class="passwordbox"><input type="password" name="password" class="input"/></div>
                <a class="enterbutton" name="submit" onclick="document.getElementById('subform').submit();" >登录</a>
                 </form>
                </div>
            </div>
    
    
</body>
</html>