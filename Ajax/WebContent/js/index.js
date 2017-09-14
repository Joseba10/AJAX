$(function(){
	$('button').click(function(){
		
		
		$.get("fechador", function(data){
			
		
		$('#demo1').html(data);
		});
	});
	
	$('form').submit(function(e){
		e.preventDefault();
		
		
		$.get("multiplicador?num="+ $('#num').val(), function(data){
			
			
			$('#resultado').html(data);
			});
		
	});
	
});