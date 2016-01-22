// JavaScript Document
function del(){
if(confirm("真的要删除该条记录吗?")){
return true;
}else{
return false;
}
}


$(function(){
	
	$("#operAll").click(function(){
		
		 var tit = document.getElementById("operAll");
 var inputs = document.getElementsByTagName("input");
 for(var i = 0; i < inputs.length; i++)
 {
  if(inputs[i].type == "checkbox")
  {
   if(tit.checked == true)
   {
    inputs[i].checked = true;
   }else{
    inputs[i].checked = false;
   }
  }
 }
		});
	$("#add").click(function(){
	
	location.href="acadd.action?id=1";
				});
	$("#add2").click(function(){
		
		location.href="acadd.action?id=2";
					});
		$("#del").click(function(){
			
	 var delid=$(":checkbox[name='id']");
      var id="";
      for (var i = 0; i < delid.length; i++) {
          if (delid[i].checked) {
               id+=delid[i].value+",";
            }
      }
      if (id!='') {
        id=id.substr(0,(id.length-1));
      }
      if (id=='') {
        alert('没有选择');
        return false;
      }
    
	  if(confirm("真的要删除该条记录吗?")){
		 
		  location.href="acdeleteall.action?ids="+id;
		  }else{
		  return false;
		  }
	  
			});
	 $("#selAll").click(function () {

        $(".lists :checkbox[name='id']").not(':disabled').prop("checked", true);
		

    });
	
	$("#unSelAll").click(function () {

        $(".lists  :checkbox[name='id']").not(':disabled').prop("checked", false);

    });
	

    $("#reverSel").click(function () {

        //遍历.lists下的 checkbox;

        $(".lists :checkbox[name='id']").not(':disabled').each(function () {

            $(this).prop("checked", !$(this).prop("checked"));

        });

    }); 
	
	
	})