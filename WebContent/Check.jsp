<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>

<%
request.setCharacterEncoding("utf-8");

String accountName=request.getParameter("accountName");
String password=request.getParameter("password");

if(accountName.equals("123")||password.equals("123")){
	session.setAttribute("login","ok");
	response.sendRedirect("userInfoPage.jsp");
}else{

}
%>