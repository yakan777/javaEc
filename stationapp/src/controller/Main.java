package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Station;
import model.StationParser;
import model.TrainParser;

public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrainParser parser =new TrainParser();
		String url="http://express.heartrails.com/api/json?method=getLines&area="+URLEncoder.encode("関東","UTF-8");
		List<String> area=parser.getList(url);
		request.setAttribute("area",area );
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String train =request.getParameter("train");

		String url =String.format("http://express.heartrails.com/api/json?method=getStations&line=%s",URLEncoder.encode(train,"UTF-8"));

		StationParser parser=new StationParser();
		List<Station> list=parser.getList(url);
		request.setAttribute("train",train);
		request.setAttribute("list",list);


		doGet(request,response);
	}
}
