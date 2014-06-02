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
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jspPageToForward = null;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//HashMap<String, User> hashMap = new HashMap<String,User>();
		HashMap<String, User> hashMap = (HashMap<String, User>)this.getServletConfig().getServletContext().getAttribute("hashMap");
		String remove=request.getParameter("remove");
		hashMap.remove(remove);
		jspPageToForward = "Root.jsp";
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
