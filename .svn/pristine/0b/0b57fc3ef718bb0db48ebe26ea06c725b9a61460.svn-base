$(function(){
		var oneyearvalue=$("#oneYearValue").val();
		var twoyearvalue=$("#twoYearValue").val();
	
		$("#oneYear").click(function(){
		 var chk = document.getElementById('gold');
		 if(chk!=null){
		 	if(chk.checked){
		 	var sum1 = parseFloat(oneyearvalue)-parseFloat($("#goldprice").val());
		 	$("#price").val(sum1);
		 	}
		 	else{
		 	$("#price").val(oneyearvalue);
		 	}
		 }
		 else{
				$("#price").val(oneyearvalue); 
		 }
		});
			$("#twoYear").click(function(){
		 var chk = document.getElementById('gold');
		 if(chk!=null){
		 	if(chk.checked){
		 		var sum1 = parseFloat(twoyearvalue)-parseFloat($("#goldprice").val());
		 		$("#price").val(sum1);
		 	}
		 	else{
		 	$("#price").val(twoyearvalue);
		 	}
		 }else{
			 $("#price").val(twoyearvalue);
		 }
		});
		
		$("#cu").keyup(function(){
			var xx=$("#cu").val();
			var chk = document.getElementById('gold');
			if(chk!=null){
		 	if(chk.checked){
		 
		 		var sum1 = parseFloat(xx)*50-parseFloat($("#goldprice").val());
		 		$("#price").val(sum1);
		 	}
			
			else {
			var sum1 = parseFloat(xx)*50;
				$("#price").val(sum1);
			}
		 	}
			else{
				var sum1 = parseFloat(xx)*50;
				$("#price").val(sum1);
			}
		});
		
		
		$("#gold").click(function(){
		var chk = document.getElementById('gold');
		 var onechk = document.getElementById('oneYear');
		 var twochk = document.getElementById('twoYear');
			 var xx=$("#cu").val();
			  if(onechk!=null){
			  	if(chk.checked){
				  if(onechk.checked){
						var sum1 = parseFloat(oneyearvalue)-parseFloat($("#goldprice").val());
						$("#price").val(sum1);
				  }
				  else if(twochk.checked){
				 		 var sum1 = parseFloat(twoyearvalue)-parseFloat($("#goldprice").val());
						$("#price").val(sum1);
				  }
				 }
				 else{
				 	  if(onechk.checked){	$("#price").val(oneyearvalue);}
				 	  else if(twochk.checked){	$("#price").val(twoyearvalue);}		
				 }
			  }
			
			
			  else if(xx!=null)
			  {
					if(chk.checked){
		 	 	 var sum1 = parseFloat(xx)*50-parseFloat($("#goldprice").val());
						$("#price").val(sum1);
					  }
					 else{
					 	var sum1 = parseFloat(xx)*50;
					$("#price").val(sum1);
			 	}
		 	}
		});
	
	})


