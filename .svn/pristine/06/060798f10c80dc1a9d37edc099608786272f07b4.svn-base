var totalheight = 0;     //定义一个总的高度变量
function lota()
{ 
    totalheight = parseFloat($(window).height()) + parseFloat($(window).scrollTop());     //浏览器的高度加上滚动条的高度 

    if ($(document).height() <= totalheight)     //当文档的高度小于或者等于总的高度的时候，开始动态加载数据
    { 
   
    	var list = [];
		var ddx=$("#PageNo").val();
		var totalPage=$("#totalPage").val();
        //加载数据
    var numA= parseInt(ddx);
	var numB= parseInt(totalPage);
	
	// alert("当前页面"+numA);
	//alert("总页面"+numB); 
       var url="/baibx/jsonpage.action";
		 if(numA<=numB){
		$.ajax({
			url:url,
			type:"post",
			data:{pageNo:ddx},
			dataType:"json",
			 success : function(data) {
			  var ddx=$("#PageNo").val(data.pageSupport.nextPage);
			  var ddx=$("#totalPage").val(data.pageSupport.totalPages);
			 for(var i=0;i<data.pageSupport.result.length;i++)
			{
				var time=data.pageSupport.result[i].time;
				var date=time.substr(0,10); 
				var top=data.pageSupport.result[i].top;
				var image=data.pageSupport.result[i].image;
				if(image==null){
				var images="";
				}
				else{
				var images=data.pageSupport.result[i].image;
				}
			if(top==1){
				if(images!=""){
					$("#qqq").append("<tr class='a'><td class='s' height='100px'><img src='/baibx/images/re.png' width='15px' height='20px'/> <a href='findnews.action?id="+data.pageSupport.result[i].id+"&pageNo=1'>"+data.pageSupport.result[i].title+"</a><br/> <br/><br/>"+date+"<p align='right'>"+data.pageSupport.result[i].clicks+"</p></td><td class='x' height='100px'> <img src="+images+"  width='100px' height='50px'  /> </td></tr>");		
				}
				else{
					
					$("#qqq").append("<tr class='a'><td class='s' height='100px'><img src='/baibx/images/re.png' width='15px' height='20px'/> <a href='findnews.action?id="+data.pageSupport.result[i].id+"&pageNo=1'>"+data.pageSupport.result[i].title+"</a><br/> <br/><br/>"+date+"<p align='right'>"+data.pageSupport.result[i].clicks+"</p></td><td class='x' height='100px'>   </td></tr>");		
				}
				}
				//alert(date);
			else{
				
				if(images!=""){//var formatDate = df.format(data.pageSupport.result[i].time);
					$("#qqq").append("<tr class='a'><td class='s' height='100px'> <a href='findnews.action?id="+data.pageSupport.result[i].id+"&pageNo=1'>"+data.pageSupport.result[i].title+"</a><br/> <br/><br/>"+date+"<p align='right'>"+data.pageSupport.result[i].clicks+"</p></td><td class='x' height='100px'> <img src="+images+"  width='100px' height='50px'  /> </td></tr>");
				}
				else{
					$("#qqq").append("<tr class='a'><td class='s' height='100px'> <a href='findnews.action?id="+data.pageSupport.result[i].id+"&pageNo=1'>"+data.pageSupport.result[i].title+"</a><br/> <br/><br/>"+date+"<p align='right'>"+data.pageSupport.result[i].clicks+"</p></td><td class='x' height='100px'>  </td></tr>");
						
				}
			}
			
			 }
			},
       		 error:function(){  
           		 alert("失败");  
            }  	  
			}); 
			
		}
    } 
} 

$(window).scroll( function() { 
    //console.log("滚动条到顶部的垂直高度: "+$(document).scrollTop()); 
    //console.log("页面的文档高度 ："+$(document).height());
    //console.log('浏览器的高度：'+$(window).height());
    lota();
}); 