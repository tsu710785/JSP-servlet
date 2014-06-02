<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logout success</title>
</head>
<body>
<%@page import="javax.servlet.http.Cookie"%>

<%
     Cookie[] cookies = request.getCookies();
     if (cookies != null) {
     	Cookie killMyCookie = new Cookie("accountName", null);
        //cookies[i]= Cookie("accountName", null);
       	System.out.println("kill value=" + killMyCookie.getValue());
       	System.out.println("kill name=" + killMyCookie.getName());
       	response.addCookie(killMyCookie);
	}
%>
成功登出！<br>
<a href="Login.jsp">回首頁</a>
</body>
</html>