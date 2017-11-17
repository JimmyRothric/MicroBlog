package Demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForumServlet
 */
@WebServlet("/BlogServlet")
public class BlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogServlet() {
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
		String SendBtn = request.getParameter("SendBtn");
		ServletContext pastMessage = this.getServletContext();
		ArrayList<Message> messageList = (ArrayList<Message>)pastMessage.getAttribute("messageList");
		if (messageList == null) {
			messageList = new ArrayList<Message>();
		}
		pastMessage.setAttribute("messageList", messageList);
		
		HttpSession session = request.getSession();
		String content = request.getParameter("message");
		String username = (String) session.getAttribute("username");
		Message sentMessage = new Message("", content, username);
		messageList.add(sentMessage);
		if (SendBtn != null) {
			session.setAttribute("AddBtn", new Boolean(true));
			response.sendRedirect("blog.jsp");
		}
	}

}
