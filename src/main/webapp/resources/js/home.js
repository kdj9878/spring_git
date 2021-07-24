$(document).ready(function(){
	
	$('.btn').click(function(){
		const t_text = $('#textarea').val();
	$.ajax({
		url : "/togit/toResult2",
		method : "post",
		data : {
			t_text : t_text
		},
		success : function(data){
			alert("성공")
			var text = data.Text[0].t_text;
			
			$("#output").append(text);
		}
	})
	.fail(function(){
		alert("실패");
	})
	
});
	
})











