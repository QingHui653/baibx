<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html >
<!-- <link href="/baibx/AppWeb/css/styles.css" rel="stylesheet" type="text/css"> -->

<head>
<%String x = request.getContextPath();%>

 
  </head>
 
<body>
	<%-- 	<div class="welcome">
    		<div class=""> ${userl.userid}你好，欢迎来到百保箱！<div class="fr">
    		
    				<c:if test="${userl==null}"><a href="<%=x %>/AppWeb/entry.jsp">[登录]</a></c:if>
    		<c:if test="${userl!=null}"><a href="apexit.action">[退出]</a>	</c:if>
    		
    		
    		</div><div class="Telephone fr">客服热线：400-000-000</div></div>
    </div>
       
	<div class="nav">
    	<ul class="fr">
        	<li><a class="shouye" href="appindex.action">首页</a></li>
            <li><a class="jieshao" href="<%=x %>/AppWeb/introduction.jsp">APP介绍</a></li>
            <li><a class="ziliao" href="<%=x %>/AppWeb/ziliao.jsp">保险资料</a></li>
            <li><a class="zixun" href="apshouyenews.action">保险资讯</a></li>
            <li><a class="zixun" id="my" href="apmyuserpage.action?userid=${userl.userid}">我的帐号</a></li>
        </ul>
    </div> --%>
    
    <div class="welcome">
    		<div class="">你好，欢迎来到百保箱！<div class="fr"><%-- <a href="<%=x %>/AppWeb/entry.jsp">[登录]</a> --%><c:if test="${userl==null}"><a href="<%=x %>/AppWeb/entry.jsp">[登录]</a></c:if>
    		<c:if test="${userl!=null}"><a href="apexit.action">[退出]</a>	</c:if></div><div class="Telephone fr">客服热线：4000584800&nbsp;&nbsp;&nbsp;&nbsp;</div></div>
    </div>
       
	<div class="nav">
    	<ul class="">
        	<li><a class="shouye" href="appindex.action">首页</a></li>
            <li><a class="jieshao" href="<%=x %>/AppWeb/introduction.jsp">APP介绍</a></li>
            <li><a class="ziliao" href="<%=x %>/AppWeb/ziliao.jsp">保险资料</a></li>
            <li><a class="zixun" href="apshouyenews.action">保险资讯</a></li>
            <li><a class="zixun" id="my"  href="apmyuserpage.action?userid=${userl.userid}">我的帐号</a></li>
        </ul>
    </div>
   
    
    <script  src="<%=x %>/JS/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script>
	
		
	
	$(function(){
	
		if('${userl.userid}'==""||'${userl.userid}'==null){
			$("#my").click(function(){
				alert("登入的用户才能查看");
		
				return false;
			})
		}else{
			return true;
		}
	
	
	
		$(".nav a").click(function(){
		$(".nav a").css("backgroundColor","white")
		$(this).css("backgroundColor","orange")
			
			})
			
		})
	
	
	</script>   
    
   
</body>
</html>
