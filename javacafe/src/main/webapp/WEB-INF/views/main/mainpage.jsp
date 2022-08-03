<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
<h3>관리자 모드? 카테고리 메뉴 추가기능 구현</h3>
<form:form method="post" modelAttribute="category">
	<label>대분류 추가</label>
	<form:input path="cateType"/>
	<label>중분류 추가</label>
	<form:input path="cateName"/>
</form:form>
</body>
</html>