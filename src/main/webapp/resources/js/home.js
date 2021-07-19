$(document).ready(function(){
	
	$('.btn').click(function(){
		const t_text = $('#textarea').val();
		
	$.ajax({
		url : "/togit/toResult",
		method : "post",
		datatype : "json",
		data : {
			t_text : t_text
		}
	})
	.done(function(){
		alert("성공");
	})
	.fail(function(){
		alert("실패");
	})
	
});
	
})











