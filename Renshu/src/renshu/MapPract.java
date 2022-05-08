package renshu;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPract {

	public static void main(String[] args) {
		//Setと同じように目的に応じてLikedHashMapやTreeMapを使い分ける
		Map<String,Integer>map=new LinkedHashMap<>();
		map.put("りんご", 5);
		map.put("みかん", 10);
		map.put("ぶどう", 2);
		int apple=map.get("りんご");
		System.out.println("持っているりんごの数は"+apple);
		//map.remove("みかん");
		map.put("ぶどう", 4);
		int grape=map.get("ぶどう");
		System.out.println("持っているぶどうの数は"+grape);
		//↓Mapでは通常のfor文は使えない
		for(String key:map.keySet()) {
			int value=map.get(key);
		System.out.println(key+"の数は"+value);
		}
	}

}
