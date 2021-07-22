$(document).ready(function(){
	
	$('.btn').click(function(){
		const t_text = $('#textarea').val();
		const t_text2 = t_text.replace("\r\n", "<br>");
		console.log(t_text);
	$.ajax({
		url : "/togit/toResult2",
		method : "post",
		data : {
			t_text : t_text2
		},
		success : function(data){
			alert("성공")
			var text = data.Text[0].t_text;
			
			$("#outputDiv").append(text);
		}
	})
	.fail(function(){
		alert("실패");
	})
	
});
	
})











