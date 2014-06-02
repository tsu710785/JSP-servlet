<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歡迎登入105人力公司網站</title>
</head>
<body>

	<div>
		<p>
			<strong>歡迎登入105人力公司網站!</strong>
		</p>
		<table width="500" border="0">
			<tr>
				<td><div align="left">Account:</div></td>
				<td><div align="left">${user.accountName}</div></td>
			</tr>
			<tr>
				<td width="70"><div align="left">Password:</div></td>
				<td width="430"><div align="left">${user.password}</div></td>
			</tr>
			<tr>
				<td><div align="left">姓名:</div></td>
				<td><div align="left">${user.name}</div></td>
			</tr>
			<tr>
				<td><div align="left">住址:</div></td>
				<td><div align="left">${user.address}</div></td>
			</tr>
			<tr>
				<td><div align="left">電話:</div></td>
				<td><div align="left">${user.phoneNumber}</div></td>
			</tr>
			<tr>
				<td><div align="left">學歷</div></td>
				<td><div align="left">${user.edu}</div></td>
			</tr>
		</table>
		<p>
			<label> <a href='Login.jsp'>回首頁</a>
			</label>
		</p>
	</div>


</body>
</html>