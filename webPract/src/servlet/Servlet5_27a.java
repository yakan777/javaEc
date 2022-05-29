package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet5_27a")
public class Servlet5_27a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<title>サーブレットはめんどくさい</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>サーブレットはめんどくさい</h1>");
		out.println("<p>なぜこうもめんどくさいのか</p>");
		out.println("</body>");
		out.println("</html>");
	}


}
