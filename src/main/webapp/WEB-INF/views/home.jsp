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

<div id="inputDiv">
<textarea id="textarea">

안녕하세요

</textarea>
</div>

<div id="outputDiv" style="background-color: gray; width: 500px; height: 800px">
${text}
</div>



</body>
<script type="text/javascript" src="${path}/resources/js/home.js"></script>
</html>