package TomCat;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = "<!DOCTYPE HTML PUBLIC\"-//W3C//DTD HTML 4.0"
				+ "Transitional//En\">\n";
		out.println(docType + "<HTML>\n"
				+ "<HEAD><TITLE>HelloServlet</TITLE></HEAD>\n"
				+ "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1>Hello</H1>\n"
				+ "</BODY></HTML>");

	}
}
