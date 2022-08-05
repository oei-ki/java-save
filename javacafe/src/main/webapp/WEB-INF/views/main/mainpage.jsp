<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 하기</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
<script src = "http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<h3>주문할 곳!</h3>

<form:form action="mainpage" method="post" > <!--enctype 해당 폼이 multipart형식임을 알려준다 -->

</form:form>

</body>
</html>