package trng.imcs.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import trng.imcs.service.UserService;
import trng.imcs.service.UserServiceImpl;
import trng.imcs.service.bo.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
	UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	userService = new UserServiceImpl();
    	this.config = config;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		User user = getUser(userId, password);
		if(user != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("error.html");
		}
	}

	private boolean validateUserWithConfig(String userId, String password) {
		Enumeration<String> paramsEnm = config.getInitParameterNames();
		while(paramsEnm.hasMoreElements()) {
			String name = paramsEnm.nextElement();
			String value = config.getInitParameter(name);
			if(name.equals(userId) && value.equals(password)) {
				return true;
			}
		}
		return false;
	}

	private User getUser(String userId, String password) {
		User user = userService.getUser(userId, password);
		return user;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
