package trng.imcs.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorldServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html")	;
		response.getWriter().append("<html><body>");
		writeHeaders(request, response);
		String name = "Manohar";
//		request.getRequestDispatcher("/header.html").include(request, response);;
		response.getWriter().append("<h2> Hi, " + name + "Welcome to servlets").append(request.getContextPath()).append("</h2>");
		response.getWriter().append("</body></html>");
	}

	private void writeHeaders(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			response.getWriter().append(headerName + " " + request.getHeader(headerName));
		}
		
		System.out.println("ContentType: " + request.getContentType());
		System.out.println("HostName: " + request.getRemoteHost());
		System.out.println("HostName: " + request.getRemotePort());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
