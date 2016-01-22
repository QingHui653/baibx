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
              <li><a id="list_1" href="<%=path%>/web/bbx/guanyu.jsp" style=" background-color:#F90;color: #FFF;">关于我们</a></li>
              <li><a id="list_2" href="<%=path%>/web/bbx/shengming.jsp">负责声明</a></li>
              <li><a id="list_3" href="<%=path%>/web/bbx/lianxiwomen.jsp">联系我们</a></li>
              <li><a id="list_4" href="PCFankui.action?userid=${userl.userid}" target="_blank">意见与反馈</a></li>
            </ul>
        </div>
        <div class="list_r">
             <div class="help">
               <p><strong>深圳保销营销策划有限公司成立于2012年，是国内第一家保险营销策划类公司，有多年的营销策划经验和先进的营销理念，设计实用性的营销辅助工具帮助保险从业人员提高业务成交率，深受保险业界欢迎和喜爱，近年业务已遍布全国，公司顺应移动互联网趋势与时俱进，不断提升策划服务水平和服务工具的实用性，逐渐成长为倍具潜力的朝阳企业。2015年9月， “百保箱”APP安卓版、“百保箱”APP IOS版、“百保箱”微信公众平台（微信号：bbxapp）、“百保箱”主页（www.bbxapp.com）将正式同时上线，为广大保险从业人员提供学习资料、获取保险资讯、制作计划书等服务，力争为
全国300万保险从业人员打造出一个实用和高效的营销服务体系。</strong></p>
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
