<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>   --%>
<%@ include file="../../common/head.jsp"%> 

<html >
<head>

<link href="<%=path %>/Css/style2.css" rel="stylesheet" type="text/css">

  <title></title>
  </head>
 
<body>
	<%@include file="heart.jsp" %>
	
	
<div class="help-list">        
	<div class="lcjs">
    <table width="100%" height="114" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="22%">
                <div class="lc_1">
                </div>
            </td>
            <td width="4%">
                <div class="lc_x">
                </div>
            </td>
            <td width="22%">
                <div class="lc_2">
                </div>
            </td>
            <td width="4%">
                <div class="lc_x">
                </div>
            </td>
            <td width="22%">
                <div class="lc_3">
                </div>
            </td>
            <td width="4%">
                <div class="lc_x">
                </div>
            </td>
            <td width="22%">
                <div class="lc_4">
                </div>
            </td>
        </tr>
    </table>
</div>

    <div class="list_ts">
        </div>
    <div class="list_bg">
            
        <div class="list_l">
            <ul>
              <li id="list_bt">帮助中心</li>
              <li><a id="list_1" href="<%=path%>/web/bbx/guanyu.jsp">关于我们</a></li>
              <li><a id="list_2" href="<%=path%>/web/bbx/shengming.jsp">负责声明</a></li>
              <li><a id="list_3" href="<%=path%>/web/bbx/lianxiwomen.jsp" style=" background-color:#F90;color: #FFF;">联系我们</a></li>
              <li><a id="list_4" href="PCFankui.action?userid=${userl.userid}" target="_blank">意见与反馈</a></li>
            </ul>
        </div>
        <div class="list_r">
             <div class="help">
               <p><strong>如需要我们提供任何帮助，都可以与我们联系。<br />
邮箱:bbxapp@163.com<br />
QQ:1605813616<br />
微博：百保箱官方微博<br />
微信公众号：百保箱（微信号：bbxapp）<br />
电话：4000584800
</strong></p>
             </div>
        </div>
	</div>
</div>
                
	
 <script  src="<%=path %>/JS/jquery-1.9.1.min.js" type="text/javascript" ></script>
	<script>
	
		
	
	$(function(){
		
		if('${userl.userid}'==""|'${userl.userid}'==null){
			$("#list_4").click(function(){
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
