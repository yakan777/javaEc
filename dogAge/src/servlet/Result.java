package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if(age == null || age.length() == 0){
			errorMsg += "年齢が入力されていません<br>";
		}


		int ageB =Integer.parseInt(age);


		if(ageB >=30) {
			errorMsg += "正しい年齢を入力してください<br>";
		}

		int sum =ageB*7;

		String msg = name+"("+age+"歳)は人間に換算すると"+sum+"歳です。";


		if(errorMsg.length() != 0) {
			msg = errorMsg;

		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>ユーザー入力結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+msg+"</p>");
		out.println("<a href='/dogAge/index.jsp'>戻る</a>");
		out.println("</body>");
		out.println("</html>");

	}

}
