package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");
		
		<input type="hidden" name="名前" value="値">
		<a href="? action=done"> </a>
		<form action="? action=done" method="post"></form>
		
		RequestDispatcher rd =
		request.getRequestDispatcher("");
		rd.forward(request, response);
		
		response.sendRedirect("");
		
		request.setAttribte("human",human);
		
		Human h=(Human) request.getAttribute("human");
		
		public class Human implements Serializable{
			private String name;
			private int age;
			public Human() {}
			public Human(String name,int age) {
				this.name=name;
				this.age=age;
			}
			HttpSesson session=request.getSession();
			session.setAttribute("human",human);
			Human human=(Human) session.getAttribute("human");
			session.removeAttribute("human");
			session.invalidate();
			
			ServletContext application =this.getServletContext();
			application.setAttribute("human",human);
			Human human=(Human) apllication.getAttribute("human");
			
			application.removeAttribute("human");
			
		}
	}


}
