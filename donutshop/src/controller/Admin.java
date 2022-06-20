package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.DonutDAO;
import model.Donut;


@WebServlet("/Admin")
@MultipartConfig
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DonutDAO dao=new DonutDAO();
		List<Donut> list=dao.findAll();
		request.setAttribute("list", list);
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/admin/main.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		Part part=request.getPart("imgname");
		String imgname=part.getSubmittedFileName();
		String path=getServletContext().getRealPath("/upload");
		System.out.println(path);
		part.write(path+File.separator+imgname);
		DonutDAO dao=new DonutDAO();
		dao.insertOne(new Donut(name,price,imgname));
		request.setAttribute("msg", "1件追加しました");
		doGet(request, response);
	}

}
