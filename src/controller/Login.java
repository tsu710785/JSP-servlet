package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AccountCheck;
import model.User;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String jspPageToForward = null;
		String root = "root";
		String rootpwd = "root";
		
		
		
		HashMap<String, User> test = (HashMap<String, User>)this.getServletConfig().getServletContext().getAttribute("hashMap");
		Cookie[] cookies = request.getCookies();
		
		if(test==null){
			HashMap<String, User> hashMap = new HashMap<String,User>();
			getServletContext().setAttribute("hashMap",hashMap);
			jspPageToForward = "Login.jsp";
		}
		else{
			LABEL_OUTTER: //jump flag
			if(cookies != null){
				for(int i=0;i<cookies.length;i++) {
					if(cookies[i].getName().equals("accountName")){
						if(cookies[i].getValue() != null){
							if(cookies[i].getValue().equals("")){
								if(request.getParameter("accountName")==null){
									jspPageToForward = "Login.jsp";
									break LABEL_OUTTER;
								}
								else{
									String accountName=request.getParameter("accountName");
									String password=request.getParameter("password");
									if(accountName!=null){
										if(accountName.equals(root) && password.equals(rootpwd)){
											jspPageToForward ="Root.jsp";
											break LABEL_OUTTER;
										}
										if(AccountCheck.checkPassword(accountName,password,test)==false){
											jspPageToForward = "PasswordWrong.jsp";
										}
										else{
											String auto=request.getParameter("auto");
											if(auto!=null){
												if(auto.equals("true")){
													Cookie accountcookie = new Cookie("accountName", accountName);
													accountcookie.setMaxAge(65536);
													response.addCookie(accountcookie);
													System.out.println("add cookies");
												}
											}
											System.out.println("78lines:"+ accountName);
											System.out.println("79lines:"+ test.get(accountName));
											request.setAttribute("user", test.get(accountName));
											jspPageToForward = "ShowInfoAfterLogin.jsp";
											break LABEL_OUTTER;
										}
									}
								}
								
								
							}
							System.out.println("cookies="+cookies[i].getValue());
							request.setAttribute("user", test.get(cookies[i].getValue()));
					    	jspPageToForward = "ShowInfoAfterLogin.jsp";
					    	break LABEL_OUTTER;
						}
						else if(cookies[i].getValue() == ""){
							System.out.println("cookie null");
							jspPageToForward = "Login.jsp";
							break LABEL_OUTTER;
						}
					}
				}
				String accountName=request.getParameter("accountName");
				String password=request.getParameter("password");
				LABEL_OUT:
				if(accountName!=null){
					if(accountName.equals(root) && password.equals(rootpwd)){
						jspPageToForward ="Root.jsp";
						break LABEL_OUT;
					}
					if(AccountCheck.checkPassword(accountName,password,test)==false){
						jspPageToForward = "PasswordWrong.jsp";
					}
					else{
						String auto=request.getParameter("auto");
						if(auto!=null){
							if(auto.equals("true")){
								Cookie accountcookie = new Cookie("accountName", accountName);
								accountcookie.setMaxAge(65536);
								response.addCookie(accountcookie);
								System.out.println("add cookies");
							}
						}
						request.setAttribute("user", test.get(accountName));
						jspPageToForward = "ShowInfoAfterLogin.jsp";
					}
		
				}
				else{
					System.out.println("else");
					jspPageToForward = "Login.jsp";

				}
				
			}
		}
		
		
		RequestDispatcher dispatcher = request
				.getRequestDispatcher(jspPageToForward);
		dispatcher.forward(request, response);

	}
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		processRequest(request, response);
	}

}
