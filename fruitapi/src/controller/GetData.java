package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Fruit;


@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public GetData() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String fruitR=request.getParameter("fruit");

		fruitR=fruitR==null? "イチョウ":fruitR;
		String fruitName =null;
		String fruitAge =null;
		String fileName =null;
		if(fruitR.contains("イチョウ")) {
			fruitName="イチョウ";
			fruitAge="5";
			fileName="ichou.jpg";
		}else if(fruitR.contains("カキ")) {
			fruitName="カキ";
			fruitAge="4～5";
			fileName="kaki.jpg";
		}else if(fruitR.contains("カリン")) {
			fruitName="カリン";
			fruitAge="4～5";
			fileName="karinn.jpg";
		}else if(fruitR.contains("クルミ")) {
			fruitName="クルミ";
			fruitAge="5";
			fileName="kurumi.jpg";
		}else if(fruitR.contains("サクランボ")) {
			fruitName="クルミ";
			fruitAge="4～5";
			fileName="sakurannbo.jpg";
		}else if(fruitR.contains("ザクロ")) {
			fruitName="ザクロ";
			fruitAge="5";
			fileName="zakuro.jpg";
		}else if(fruitR.contains("リンゴ")) {
			fruitName="リンゴ";
			fruitAge="5";
			fileName="apple.jpg";
		}else if(fruitR.contains("デコポン")) {
			fruitName="デコポン";
			fruitAge="4～5";
			fileName="dekopon.jpg";
		}else if(fruitR.contains("ネーブルオレンジ")) {
			fruitName="ネーブルオレンジ";
			fruitAge="4～5";
			fileName="orange.jpg";
		}else if(fruitR.contains("ハッサク")) {
			fruitName="ハッサク";
			fruitAge="4～5";
			fileName="hassaku.jpg";
		}else if(fruitR.contains("ミカン")) {
			fruitName="ミカン";
			fruitAge="4～5";
			fileName="mikan.jpg";
		}else if(fruitR.contains("ビワ")) {
			fruitName="ビワ";
			fruitAge="4～5";
			fileName="biwa.jpg";
		}else if(fruitR.contains("ヤマモモ")) {
			fruitName="ヤマモモ";
			fruitAge="4～5";
			fileName="yamamomo.jpg";
		}else if(fruitR.contains("ブドウ")) {
			fruitName="ブドウ";
			fruitAge="2～3";
			fileName="budou.jpg";
		}else if(fruitR.contains("イチジク")) {
			fruitName="イチジク";
			fruitAge="2～3";
			fileName="ichijiku.jpg";
		}else if(fruitR.contains("ブルーベリー")) {
			fruitName="ブルーベリー";
			fruitAge="2～3";
			fileName="blueberry.jpg";
		}else if(fruitR.contains("モモ")) {
			fruitName="モモ";
			fruitAge="3";
			fileName="peach.jpg";
		}else if(fruitR.contains("ナシ")) {
			fruitName="ナシ";
			fruitAge="3～4";
			fileName="nasi.jpg";
		}
		String imgPath="http://192.168.2.114:8080/fruitapi/images/"+fileName;
		Fruit f=new Fruit();
		f.setFruit(fruitName);
		f.setAge(fruitAge);
		f.setImgPath(imgPath);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out =response.getWriter();
		Gson gson=new Gson();
		out.print(gson.toJson(f));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
