<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<title>支付结果</title>
</head>
	<body>

		<c:if test="${type=='ok'}">
		<div style="text-align: center;margin-top: 30%"><div style="font-size: 25px;">支付成功</div><div style="font-size: 10px">点击左上角返回</div>
		</div>
		</c:if>
		<c:if test="${type=='no'}">
		<div style="text-align: center;margin-top: 30%"><div style="font-size: 25px;">支付失败</div><br><div style="font-size: 10px">点击左上角返回</div>
		</div>
		</c:if>	
	
	
	
	
	
	
	
	
	</body>
	</html>
