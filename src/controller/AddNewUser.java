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
@WebServlet("/AddNewUser")
public class AddNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jspPageToForward = null;
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//HashMap<String, User> hashMap = new HashMap<String,User>();
		HashMap<String, User> hashMap = (HashMap<String, User>)this.getServletConfig().getServletContext().getAttribute("hashMap");
		
		// 取得submit參數, 看Client端是第一次呼叫, 還是填寫完資料後的呼叫
		String page = request.getParameter("submit");

		// 若Client是填寫完資料後的呼叫
		if ("完成".equals(page)) {

			/*完成程式碼*/
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String phone=request.getParameter("phone");
			String edu=request.getParameter("edu");
			String accountName=request.getParameter("accountName");
			String password=request.getParameter("password");
			
			if(AccountCheck.checkAccountNameExistence(accountName,hashMap)==true){
				request.setAttribute("accountName", accountName);
				jspPageToForward = "Alreadyuse.jsp";
			}
			else{
				User NewUser = AccountCheck.addNewUser(name,address,phone,edu,accountName,password,hashMap);
				
				request.setAttribute("user", NewUser);
				// forward到userInfoPage
				jspPageToForward = "userInfoPage.jsp";
			}
			
			
		}
		// 若Client端是第一次呼叫此Servlet程式, 準備填寫資料
		else {
			// forward到新增使用者的第1頁
			jspPageToForward = "addUserPage.jsp";
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
