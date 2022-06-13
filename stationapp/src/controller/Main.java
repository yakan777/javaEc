package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Station;
import model.StationParser;

public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

		private static final String[]  AREA={
				"JR上越線",
				"JR両毛線",
				"JR中央線",
				"JR中央本線",
				"JR久留里線",
				"JR五日市線",
				"JR京浜東北線",
				"JR京葉線",
				"JR信越本線",
				"JR八高線",
				"JR内房線",
				"JR南武支線",
				"JR南武線",
				"JR吾妻線",
				"JR埼京線",
				"JR外房線",
				"JR宇都宮線",
				"JR山手線",
				"JR川越線",
				"JR常磐線",
				"JR常磐線各駅停車",
				"JR常磐線快速",
				"JR御殿場線",
				"JR成田線",
				"JR成田線我孫子支線",
				"JR日光線",
				"JR東北本線",
				"JR東海道本線",
				"JR東金線",
				"JR根岸線",
				"JR横浜線",
				"JR横須賀線",
				"JR武蔵野線",
				"JR水戸線",
				"JR水郡線",
				"JR湘南新宿ライン",
				"JR烏山線",
				"JR相模線",
				"JR総武本線",
				"JR総武線",
				"JR総武線快速",
				"JR青梅線",
				"JR高崎線",
				"JR鶴見線",
				"JR鹿島線",
				"いすみ鉄道",
				"つくばエクスプレス線",
				"わたらせ渓谷鐵道線",
				"ディズニーリゾートライン",
				"上信電鉄上信線",
				"上毛電鉄上毛線",
				"上越新幹線",
				"上野モノレール",
				"京成千原線",
				"京成千葉線",
				"京成押上線",
				"京成本線",
				"京成金町線",
				"京成成田空港線",
				"京浜急行久里浜線",
				"京浜急行大師線",
				"京浜急行本線",
				"京浜急行空港線",
				"京浜急行逗子線",
				"京王線",
				"京王新線",
				"京王井の頭線",
				"京王相模原線",
				"京王高尾線",
				"京王動物園線",
				"京王競馬場線",
				"伊豆箱根鉄道大雄山線",
				"北総鉄道",
				"千葉都市モノレール1号線",
				"千葉都市モノレール2号線",
				"埼玉新都市交通伊奈線",
				"埼玉高速鉄道",
				"多摩モノレール",
				"大山鋼索線",
				"小湊鉄道",
				"小田急多摩線",
				"小田急小田原線",
				"小田急江ノ島線",
				"山万ユーカリが丘線",
				"御岳登山鉄道",
				"新交通ゆりかもめ",
				"新京成電鉄線",
				"東京りんかい線",
				"東京メトロ丸ノ内分岐線",
				"東京メトロ丸ノ内線",
				"東京メトロ千代田線",
				"東京メトロ半蔵門線",
				"東京メトロ南北線",
				"東京メトロ日比谷線",
				"東京メトロ有楽町線",
				"東京メトロ東西線",
				"東京メトロ銀座線",
				"東京メトロ副都心線",
				"東京モノレール羽田線",
				"東北新幹線",
				"東急こどもの国線",
				"東急世田谷線",
				"東急多摩川線",
				"東急大井町線",
				"東急東横線",
				"東急池上線",
				"東急田園都市線",
				"東急目黒線",
				"東武亀戸線",
				"東武伊勢崎線",
				"東武佐野線",
				"東武大師線",
				"東武宇都宮線",
				"東武小泉線",
				"東武日光線",
				"東武東上本線",
				"東武桐生線",
				"東武越生線",
				"東武野田線",
				"東武鬼怒川線",
				"東海道新幹線",
				"東葉高速鉄道",
				"横浜みなとみらい線",
				"横浜市ブルーライン",
				"金沢シーサイドライン",
				"江ノ島電鉄線",
				"湘南モノレール",
				"相模鉄道いずみ野線",
				"相模鉄道本線",
				"真岡鐵道",
				"秩父本線",
				"筑波山鋼索鉄道線",
				"箱根登山鉄道線",
				"箱根登山鉄道鋼索線",
				"流鉄流山線",
				"芝山鉄道線",
				"ひたちなか海浜鉄道湊線",
				"西武国分寺線",
				"西武多摩川線",
				"西武多摩湖線",
				"西武山口線",
				"西武拝島線",
				"西武新宿線",
				"西武有楽町線",
				"西武池袋線",
				"西武狭山線",
				"西武秩父線",
				"西武西武園線",
				"西武豊島線",
				"都営三田線",
				"都営大江戸線",
				"都営新宿線",
				"都営浅草線",
				"都電荒川線",
				"野岩鉄道会津鬼怒川線",
				"銚子電鉄線",
				"北陸新幹線",
				"関東鉄道常総線",
				"関東鉄道竜ヶ崎線",
				"高尾登山電鉄線",
				"日暮里・舎人ライナー",
				"グリーンライン",
				"鹿島臨海鉄道線",
				"JR上野東京ライン",
				"相鉄・JR直通線"

		};
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("area", Arrays.asList(AREA));
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String area =request.getParameter("area");

		String url =String.format("http://express.heartrails.com/api/json?method=getStations&line=%s",URLEncoder.encode(area,"UTF-8"));

		StationParser parser=new StationParser();
		List<Station> list=parser.getList(url);
		request.setAttribute("list",list);


		doGet(request,response);
	}
}
