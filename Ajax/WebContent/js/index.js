$(function(){
	$('button').click(function(){
		
		
		$.get("fechador", function(data){
			
		
		$('pre').html(data);
		});
	});
	
});