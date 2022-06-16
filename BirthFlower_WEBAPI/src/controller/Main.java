package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BirthFlower;
import model.BirthFlowerParser;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=
				request.getRequestDispatcher("WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flowerName=request.getParameter("flowerName");
		String flowerLangage=request.getParameter("flowerLangage");
		String month=request.getParameter("month");
		String url=String.format("http://192.168.2.126:8080/birthApp/GetData?month=%s",month);
		BirthFlower birthFlower=new BirthFlowerParser().getBirthFlower(url);
		birthFlower.setMonth(month);
		request.setAttribute("birthFlower", birthFlower);
		doGet(request, response);
	}

}
