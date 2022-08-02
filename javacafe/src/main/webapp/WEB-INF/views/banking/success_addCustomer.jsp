<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>${customer.name } 님 뱅킹 회원가입완료!</h3><br>
		<label>아이디 : </label>${customer.userId }<br>
		<label>비밀번호 : </label>${customer.passwd }<br>
		<label>이름 : </label>${customer.name }<br>
		<label>주민번호 : </label>${customer.ssn }<br>
		<label>연락처 : </label>${customer.phone }<br>
		<button type="submit"><a href="/jvx330/banking/success_addaccount">신규계좌생성</a></button>
</body>
</html>