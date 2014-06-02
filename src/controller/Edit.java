package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AccountCheck;
import model.User;

/**
 * 這支Servlet程式扮演Controller的角色
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jspPageToForward = null;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//HashMap<String, User> hashMap = new HashMap<String,User>();
		HashMap<String, User> hashMap = (HashMap<String, User>)this.getServletConfig().getServletContext().getAttribute("hashMap");
		
		String page = request.getParameter("submit");
		if ("完成".equals(page)) {
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String phone=request.getParameter("phone");
			String edu=request.getParameter("edu");
			String accountName=request.getParameter("accountName");
			String password=request.getParameter("password");
			User NewUser = AccountCheck.addNewUser(name,address,phone,edu,accountName,password,hashMap);
			request.setAttribute("user", NewUser);
			jspPageToForward = "Root.jsp";
		}
		else{
			String edit= request.getParameter("edit");
			
			User editone=hashMap.get(edit);
			request.setAttribute("user", editone);
			jspPageToForward = "Edit.jsp";
		}
		
		RequestDispatcher dispatcher = request
				.getRequestDispatcher(jspPageToForward);
		dispatcher.forward(request, response);
		
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
