<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歡迎使用105人力公司網站</title>
</head>
<body>
<body>
	<div>
		<p>
			<strong>歡迎使用105人力公司網站來登錄您的個人資料</strong>
		</p>
		<form name="form1" method="post" action="AddNewUser">
			<table width="450" border="0">
				<tr>
					<td width="40"><div align="left">姓名:</div></td>
					<td width="410"><div align="left">
							<input name="name" type="text" id="name">
						</div></td>
				</tr>
				<tr>
					<td><div align="left">住址:</div></td>
					<td><div align="left">
							<input name="address" type="text" id="address" size="45">
						</div></td>
				</tr>
				<tr>
					<td><div align="left">電話:</div></td>
					<td><div align="left">
							<input name="phone" type="text" id="phone">
						</div></td>
				</tr>
				<tr>
					<td><div align="left">學歷</div></td>
					<td><div align="left">
							<input type="radio" name="edu" value="高中職">高中職 
							<input type="radio" name="edu" value="五專">五專
							<input type="radio" name="edu" value="四技二專">四技二專
							<input type="radio" name="edu" value="大學">大學
							<input type="radio" name="edu" value="研究所"> 研究所
						</div></td>
				</tr>
				<tr>
					<td><div align="left">帳號:</div></td>
					<td><div align="left">
							<input name="accountName" type="text" id="accountName">
						</div></td>
				</tr>
								<tr>
					<td><div align="left">密碼:</div></td>
					<td><div align="left">
							<input name="password" type="text" id="password">
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