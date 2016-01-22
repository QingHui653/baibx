<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%-- <%@ include file="../../common/head.jsp"%> --%>

<html >
<head>
<%String x = request.getContextPath();%>
<link href="<%=x %>/Css/style.css" rel="stylesheet" type="text/css">

  <title></title>
  </head>
 
<body>
	<div class="welcome">
    	<div class="center1024">
    		<div class=""> ${userl.userid}你好，<c:if test="${userl==null}">欢迎来到百保箱!</c:if><c:if test="${userl!=null}">欢迎登入到百保箱PC端!</c:if><div class="fr" >
    		<c:if test="${userl==null}"><a href="<%=x %>/web/bbx/login.jsp">[登录]</a></c:if>
    		<c:if test="${userl!=null}"><a href="exit.action">[退出]</a>	</c:if>
    				
    		</div><div class="Telephone fr">客服热线：4000584800</div></div>
        </div>																				
    </div>
       
	<div class="nav">
    	<ul class="fr">
        	<li><a class="shouye" href="index.action">首页</a></li>
            <li><a class="jieshao" href="<%=x %>/web/bbx/app.jsp">APP介绍</a></li>
            <li><a class="ziliao" href="<%=x %>/web/bbx/ziliao.jsp">保险资料</a></li>
            <li><a class="zixun" href="shouyenews.action">保险资讯</a></li>
      		  <li><a class="zixun" id="my" href="myuserpage.action?userid=${userl.userid}">我的帐号</a></li>
        </ul>
    </div>
    
    <script  src="<%=x %>/JS/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script>
	
		
	
	$(function(){
		
		if('${userl.userid}'==""|'${userl.userid}'==null){
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
