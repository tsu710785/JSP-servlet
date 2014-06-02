<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Root edit</title>
</head>
<body>
<h3>Root</h3>
<c:forEach var="hashMap" items="${hashMap}">
account : ${hashMap.key}
password : ${hashMap.value.password}
<form method="post" action="Delete">

Remove it:<input name="remove" id="remove" type="submit" value="${hashMap.key}">
</form>
<form method="post" action="Edit">
Edit it:<input name="edit" id="edit" type="submit" value="${hashMap.key}">
</form>

<br>
</c:forEach>
<a href=Login.jsp>home</a>
</body>
</html>