$(function(){
  $("#one").click(function(){
		 // $("tr[id^='one1']").hide();//隐藏ID开头replytable的tr
   		// $("#one1"+obj).show();
	$("tr[id^='one']").toggle();
		});
		})
$(function(){
	$("#two").click(function(){
	$("tr[id^='two']").toggle();
		});
	})
$(function(){
	$("#three").click(function(){
		$("tr[id^='three']").toggle();
		});
	})
$(function(){
	$("#four").click(function(){
		$("tr[id^='four']").toggle();
		});
			
	})	
	
$(function(){
	$("#bb").mousedown(function(){
		
		var xx=$("#aa").val();
		if(xx==""){
			alert("请登入后再评论");
			return false;
		}
	
		/*if(xx==null)
		{
		alert("AAA");
		}*/
		});
	
	})	
/*function checkForm(){
var loginForm = document.loginForm;	
	var xx=$("#aa").val();
		if(xx==""){
			alert("请登入后再评论");
	return false;
	}
	loginForm.submit();
}*/	
