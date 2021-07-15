<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="create.pw">
비밀번호 암호화 <input name="pw">
<button>전송</button>
${crypto_pw}
</form>
</body>
</html>