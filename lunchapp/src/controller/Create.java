package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LunchDAO;
import model.Lunch;

@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		RequestDispatcher rd =
				request.getRequestDispatcher
				("/WEB-INF/view/create.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String menu=request.getParameter("menu");
		Lunch lunch=new Lunch(name,menu);
		LunchDAO ld=new LunchDAO();
		ld.insertOne(lunch);
		
		response.sendRedirect("/lunchapp/Read");

	}

}
