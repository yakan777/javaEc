package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Star;
import model.StarParser;

public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String LAT="35.709026";
	private static final String LNG="139.731992";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat
				("yyyy-MM-dd");
		String today=sdf.format(date);
		sdf=new SimpleDateFormat("H");
		String hour=sdf.format(date);
		sdf=new SimpleDateFormat("m");
		String min=sdf.format(date);

		String url =String.format("https://livlog.xyz/hoshimiru/constellation?lat=%s&lng=%s&date=%s&hour=%s&min=%s",
		LAT,LNG,today,hour,min);

		StarParser parser=new StarParser();
		List<Star> list=parser.getList(url);

		request.setAttribute("list", list);
		request.setAttribute("today", today);
		request.setAttribute("hour", hour);
		request.setAttribute("min", min);
		request.setAttribute("lat", LAT);
		request.setAttribute("lng", LNG);

		RequestDispatcher rd=
				request.getRequestDispatcher
				("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}

}
