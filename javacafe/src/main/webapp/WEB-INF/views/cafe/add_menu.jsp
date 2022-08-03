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
<h3>상품추가</h3>

<form:form method="post" modelAttribute="menuItem">
	<label>카테고리선택</label>
	<select name="cateName">
	<c:forEach var="view" items="${menuCategoryList}">
		<option value="${view.cateName}">${view.cateName}</option>			
	</c:forEach>				
	</select>
	<label>메뉴</label>
	<form:input path="menuName"/>
	<label>size</label>
	<form:input path="menuSize"/>
	<label>가격</label>
	<form:input path="menuPrice"/>
	<label>이미지</label>
	<form:input path="imgUrl"/>
	<button type="submit">추가하기</button>
</form:form>

</body>
</html>