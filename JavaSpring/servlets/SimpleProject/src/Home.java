

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	public String fn = "Unknown";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath()); 
		   // (?) I don't understand the above statement meaning.
		
		String fn= request.getParameter("firstName");
		if (fn == null) {
			fn ="Unknown ";
		}

		String ln = request.getParameter("lastName");
		if (ln == null) {
			ln = "Unknown";
		}
		
		String favLang = request.getParameter("favoriteLanguage");
		if (favLang == null) {
			favLang = "Unknown";
		}
		
		String hT = request.getParameter("homeTown");
		if (hT == null) {
			hT = "Unknown";
		}
	    // Sets the content type of the response
		response.setContentType("text/html");
	    // writes the response
	    PrintWriter out = response.getWriter();
	    out.write("<h1>Welcome, " + fn + ln + "</h1>");
	    out.write("<h3>Your favorite Language is " + favLang + "</h1>");
	    out.write("<h3>Your home town is " + hT + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
