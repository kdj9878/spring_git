<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/resources/css/home.css" rel="stylesheet">
</head>
<body>

<%-- <form action="create.pw">
비밀번호 암호화 <input name="pw">
<button>전송</button>
${crypto_pw}
</form> --%>

<section id="inputSection">
<div id="textareaDiv">
<textarea id="textarea" onkeydown="if(event.keyCode===9){var v=this.value,s=this.selectionStart,e=this.selectionEnd;this.value=v.substring(0, s)+'\t'+v.substring(e);this.selectionStart=this.selectionEnd=s+1;return false;}">

public class Main{

public static void main(String[] args){
		
	
	
	
	}


}
</textarea>
<div id="buttonId">
<button id="btn" class="btn">변환</button>
</div>
</div>

<div id="outputDiv">
<c:forEach var="t" items="${list}">
${t.t_text}	
</c:forEach>

</div>
</section>





</body>
<script type="text/javascript" src="${path}/resources/js/jquery.js"></script>
<script type="text/javascript" src="${path}/resources/js/home.js"></script>
</html>