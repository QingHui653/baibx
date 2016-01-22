<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../common/head.jsp"%><title>后台登入</title>
<link href="adminhoutai/style.css" type="text/css" rel="stylesheet"></link>
</head>
<%
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("UTF-8");
%>
<script language=JavaScript>
//表单验证

function isChinese(name) //中文值检测
{
if(name.length == 0)
return false;
for(i = 0; i < name.length; i++) {
if(name.charCodeAt(i) > 128)
return true;
}
return false;
}

function changDu(name) //长度判断
{
if(name.length > 50)
return false;
else
return true;
}

function isNumber(String)
{
var Letters = "1234567890-"; //可以自己增加可输入值
var i;
var c;
if(String.charAt( 0 )=='-')
return false;
if( String.charAt( String.length - 1 ) == '-' )
return false;
for( i = 0; i < String.length; i ++ )
{
c = String.charAt( i );
if (Letters.indexOf( c ) < 0)
return false;
}

return true;
}

function Check( reg, str )
{
 if( reg.test( str ) )
 {
  return true;
 }
 return false;
}


function CheckCharOrNum(str)
{
 var reg = /^\w+$/;
 return Check(reg,str);
}
//tuxiliang 2009.10.10修改与firefox不兼容问题
function checkForm(){
var loginForm = document.loginForm;
	if(loginForm.userid.value.length==0){
 		alert("登陆名不能为空");
   	 	loginForm.userid.focus();
    	return(false);
 	}
	
	if(!CheckCharOrNum(loginForm.userid.value)){
	    alert("登陆名必须是数字和字母组合");
   	 	loginForm.userid.focus();
		return(false);	
	}
 	if(loginForm.password.value.length==0){
 		alert("密码不能为空"+loginForm.password.value);
   	 	loginForm.password.focus();
    	return(false);
 		}
 		// alert("密码必须是数字和字母组合"+loginForm.password.value);
		if(!CheckCharOrNum(loginForm.password.value)){
	    alert("密码必须是数字和字母组合");
   	 	loginForm.password.focus();
		return(false);	
	}		
	loginForm.submit();
}
</script>

<body>
 <form action="Adminlogin.action" method="post" name="loginForm">
	<div class="box">
    	<div class="yonghu">
        	<div class="fl text">用户名</div>
            <div > <input  class="fr yonghuk" type="text" name="Adminid" /> <span>${error}</span></div>
        </div>
    	
        <div class="mima">
			<div class="fl text">密&nbsp;&nbsp;码</div>
            <div > <input class="fr yonghuk" type="password" name="Password" /><span>${pass}</span></div>        
        </div>
    	
        <div class="anniu">
            <div class="fr anniuk">
            	<div class="fl denglu"><input type="submit" value="登入" onclick="return checkForm()" /></div>
                <div class="fr quxiao"><input type="reset" value="取消"/></div>
            </div>
        </div>
        
    </div>
    </form>
</body>
</html>
