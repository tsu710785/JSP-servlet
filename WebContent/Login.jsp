<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歡迎使用105人力公司網站</title>
</head>
<body>


<form id="form1" name="form1" method="post" action="Login">
歡迎使用105人力公司網站來登錄您的個人資料
  <p>
    帳號：
    <input type="text" name="accountName" id="accountName" />
  </p>
  <p>
    <label for="password">  密碼：</label>
  
    <input type="password" name="password" id="password" />
  </p>
  <input type=checkbox name="auto" id="auto" value="true">自動登入
  <a href=addUserPage.jsp>新使用者</a>
  <a href=ListAll>showall</a>
  <p>
    <input type="submit" name="button" id="button" value="submit" />
  </p>
</form>
</body>
</html>