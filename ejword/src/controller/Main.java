package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EJWord;
import model.EJWordLogic;

@WebServlet("/main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int LIMIT = 20;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String searchWord = (String) request.getParameter("searchWord");
		EJWord ejw=null;
		if (searchWord != null) {
			String mode=request.getParameter("mode");
			if(mode==null) {
				mode="startsWith";
			}
			String page=(String)request.getParameter("page");
			int pageNo=page==null? 1:Integer.parseInt(page);
			ejw=new EJWord(searchWord,mode,pageNo,LIMIT);
			EJWordLogic logic=new EJWordLogic();
			logic.execute(ejw);

		}else {
			ejw=new EJWord();
		}
		request.setAttribute("ejw", ejw);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);

	}

	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * request.setCharacterEncoding("UTF-8"); String
	 * searchWord=(String)request.getParameter ("searchWord"); String
	 * mode=(String)request.getParameter("mode"); WordDAO dao=new WordDAO(); int
	 * total =dao.getCount(searchWord,mode); List<Word> list
	 * =dao.getListBySearchWord (searchWord,mode,LIMIT);
	 * request.setAttribute("total", total); request.setAttribute("limit", LIMIT);
	 * request.setAttribute("searchWord", searchWord); request.setAttribute("mode",
	 * mode); request.setAttribute("list", list); this.doGet(request,response); }
	 */

}
