$(function(){
		$("#j").click(function(){
			var	x=$("#nu").val()*1-1;
				$("#nu").val(x);
			var	y=$("#nu").val()*1;
				if(y<2){
					$("#nu").val(1);
					}
			})	
				$("#jj").click(function(){
				x=$("#nu").val()*1+1;
				$("#nu").val(x);
			})	
		})