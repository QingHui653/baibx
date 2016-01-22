<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../common/head.jsp"%>
<script  src="JS/payinform.js" type="text/javascript" ></script>

<head>
<link href="Css/zhifu.css" rel="stylesheet" type="text/css">

<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<title>无标题文档</title>
</head>

<body>
 <c:if test="${!empty userb}">
 <form action="order.action" method="post">
 <input type="hidden" name="userid" value="${userb.userid}" />
<table width="100%" height="90%" class="all">
<table width="100%">
  <img  src="images/2.png" width="100%" class="daohang" />
</table>
  <c:choose>
		<c:when test="${userb.type=='user'}">
<table class="tasalesman">
  
  <tr><td width="3%"></td><td class="tachoose" >业务员<br />（查看全部险种）
 	</td><td width="3%"></td></tr>
	<tr><td width="3%"></td><td class="tachoosess"><input type="radio"  class="radio" name="productgroup" value="oneYear" id="oneYear" />1年260元</span></td><td width="3%"></td></tr>
  <input  type="hidden" id="oneYearValue" value="260"/>
  
   <tr><td width="3%"></td><td class="tachoosess"><input type="radio"  class="radio" name="productgroup" value="twoYear"  id="twoYear" />2年480元</span></td><td width="3%"></td></tr>
   <input  type="hidden" id="twoYearValue" value="480"/>
  </table>
  </c:when>
  	<c:when test="${userb.type=='custom'}">	
  		 <table class="tasalesman">
  
  <tr><td width="3%"></td><td class="tachoose" >客户<br />（选看两个险种）
 	</td><td width="3%"></td></tr>
	<tr><td width="3%"></td><td class="tachoosess">50元/年/份</td><td width="3%"></td></tr>
   <tr><td width="3%"></td><td class="tachoosess">购买<input type="text"  id="cu" name="productgroup" class="goumai" />份</span></td><td width="3%"></td></tr>
  </table>
  
  
  </c:when>
	</c:choose>			
    
    <table class="list2">
    <c:choose>
    <c:when test="${userb.gold!=0}">
        <tr><td ><input type="checkbox"  name="gold" value="${userb.gold}" id="gold"/><span>使用<img class="yuanbao" src="images/yuanbao.png" width="20">
			<input type="text" class="input" id="goldprice" value="${userb.gold/100}" readonly="readonly" />元 </span></td></tr>
        <tr><td  ><span>您的&nbsp;<img src="images/qianbao.png" width="20">&nbsp;藏有${userb.gold}个金元宝</span><br /><br /><span>最多可以抵充${userb.gold/100}元</span></td></tr>
        </c:when>
      </c:choose>
        <tr><td  ></td></tr>
        <tr><td  ><span>支付金额<input type="text" class="input" name="price" value="" id="price"  readonly="readonly" />元人民币</span></td></tr>
        <tr><td  ><span>支付平台&nbsp;&nbsp;&nbsp;<img src="images/logo.png" width="100"></span></td></tr>
        <tr><td  ><span>支付宝账号<input type="text" name="payment" class="input" /></span></td></tr>
        <tr><td  ><span>激活码接收手机号码<input type="text" class="input" name="phone" value="" /></span></td></tr>
        <tr><td  ><img src="images/!.png" width="20" ><span>填入付费后软件使用者手机号码</span></td></tr>
        
		</table>
        
        	<table  class="list2bu" t><tr><td  width="100%">
        	<!-- <input type="submit" value="提交订单" class="bu" /> -->
        	<input type="submit" value="提交订单" class="ywu"  /> 
        	</tr></td></table>
          
    
   
   </table>
   </form>
   </c:if>
</body>
</html>
