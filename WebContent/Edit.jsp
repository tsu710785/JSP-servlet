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
		<form name="form1" method="post" action="Edit">
		<table width="500" border="0">
			<tr>
				<td><div align="left">Account:</div></td>
				<td><div align="left">${editone.accountName}</div></td>
				<td width="410"><div align="left"><input name="accountName" type="text" id="accountName"></div></td>
			</tr>
			<tr>
				<td width="70"><div align="left">Password:</div></td>
				<td width="430"><div align="left">${editone.password}</div></td>
				<td width="410"><div align="left"><input name="password" type="text" id="password"></div></td>
			</tr>
			<tr>
				<td><div align="left">姓名:</div></td>
				<td><div align="left">${editone.name}</div></td>
				<td><input name="name" type="text" id="name"></td>
			</tr>
			<tr>
				<td><div align="left">住址:</div></td>
				<td><div align="left">${editone.address}</div></td>
				<td width="410"><div align="left"><input name="address" type="text" id="address"></div></td>
			</tr>
			<tr>
				<td><div align="left">電話:</div></td>
				<td><div align="left">${editone.phoneNumber}</div></td>
				<td width="410"><div align="left"><input name="phoneNumber" type="text" id="phoneNumber"></div></td>
			</tr>
			<tr>
				<td><div align="left">學歷</div></td>
				<td><div align="left">${editone.edu}</div></td>
				<td><div align="left">
					<input type="radio" name="edu" value="高中職">高中職 
					<input type="radio" name="edu" value="五專">五專
					<input type="radio" name="edu" value="四技二專">四技二專
					<input type="radio" name="edu" value="大學">大學
					<input type="radio" name="edu" value="研究所"> 研究所
				</div></td>
			</tr>
		</table>
			<p>
				<label> <input type="reset" name="reset" value="重設">
					<input type="submit" name="submit" value="完成">
				</label>
			</p>
		</form>	
	</div>
	


</body>
</html>