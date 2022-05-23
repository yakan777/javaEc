package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] luckArray= {"超スッキリ","スッキリ","最悪"};
		int index=(int)(Math.random()*3);
		String luck=luckArray[index];

		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today=sdf.format(date);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =response.getWriter();//この二行は覚えておく

		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+today+"の運勢は「"+luck+"」です</p>");
		//out.printf("<p>$sの運勢は「%s」です</p>%n",today,luck);←これでもよし
		out.println("</body>");
		out.println("</html>");
	}


}
