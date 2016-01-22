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
              <li><a id="list_2" href="<%=path%>/web/bbx/shengming.jsp" style=" background-color:#F90;color: #FFF;">负责声明</a></li>
              <li><a id="list_3" href="<%=path%>/web/bbx/lianxiwomen.jsp">联系我们</a></li>
              <li><a id="list_4" href="PCFankui.action?userid=${userl.userid}" target="_blank">意见与反馈</a></li>
            </ul>
        </div>
        <div class="list_r">
             <div class="help">
               <p><strong>1、“百保箱”部分文章信息来源于网络转载是出于传递更多信息之目的，并不意味着赞同其观点或证实其内容的真实性。如其他媒体、网站或个人从本网下载使用，必须保留本网注明的“稿件来源”，并自负版权等法律责任。如对稿件内容有疑议，请及时与我们联系。</strong></p>
               <p><strong>2、“百保箱”致力于提供合理、准确、完整的资讯信息，但不保证信息的合理性、准确性和完整性，且不对因信息的不合理、不准确或遗漏导致的任何损失或损害承担责任。本网站所有信息仅供参考，不做交易和服务的根据， 如自行使用本网资料发生偏差，本站概不负责，亦不负任何法律责任。</strong></p>
               <p><strong>3、任何由于黑客攻击、计算机病毒侵入或发作、因政府管制而造成的暂时性关闭等影响网络正常经营的不可抗力而造成的损失，本网站均得免责。由于与本网站链接的其它网站所造成之个人资料泄露及由此而导致的任何法律争议和后果，本网站均得免责。</strong></p>
               <p><strong>4、本网站如因系统维护或升级而需暂停服务时，将事先公告。若因线路及非本公司控制范围外的硬件故障或其它不可抗力而导致暂停服务，于暂停服务期间造成的一切不便与损失，本网站不负任何责任。</strong></p>
               <p><strong>5、本网站使用者因为违反本声明的规定而触犯中华人民共和国法律的，一切后果自己负责，本网站不承担任何责任。</strong></p>
               <p><strong>6、凡以任何方式登陆本网站或直接、间接使用本网站资料者，视为自愿接受本网站声明的约束。</strong></p>
               <p><strong>7、本声明未涉及的问题参见国家有关法律法规，当本声明与国家法律法规冲突时，以国家法律法规为准。</strong></p>
               <p><strong>8、本网站如无意中侵犯了哪个媒体或个人的知识产权，请来信或来电告之，本网站将立即给予删除。</strong></p>
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
