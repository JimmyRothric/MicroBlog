package Demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		ServletContext account = this.getServletContext();
		AccountList accountList = (AccountList)account.getAttribute("accountList");
		if (accountList == null) {
			accountList = new AccountList();
		}
		account.setAttribute("accountList", accountList);
		String username = request.getParameter("username");
		String password0 = request.getParameter("password0");
		String password1 = request.getParameter("password1");
//		for (Account acc:accountList) {
//			if (acc.getUserName().equals(username)) {
		if (accountList.isExist(username)) {
			request.setAttribute("registerError0", "This account has existed.");
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
			return;
		}
//		}
		if (password0.equals(password1)) {
			Account a = new Account(username, password0);
			accountList.addAcc(a);//
			response.sendRedirect("login.jsp");
			return;
		} else {
			request.setAttribute("registerError1", "Two input password must be consistent.");
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
		}
	}

}
