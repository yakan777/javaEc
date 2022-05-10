package renshu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LSMPract {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aさん");
		list.add("bさん");
		list.add("cさん");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove("aさん");
		for (String i : list) {
			System.out.println(i);
		}
		list.add(1, "dさん");
		list.set(0, "eさん");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}


		Set<Integer> color = new TreeSet<>();
		color.add(3);
		color.add(1);
		color.add(2);
		color.add(2);
		color.add(3);
		for (int y : color) {
			System.out.println(y);
		}

		Iterator<Integer>its=color.iterator();
		while(its.hasNext()) {
			Integer d=its.next();
			System.out.println(d);
		}









		Map<String,Integer>maps=new TreeMap<>();
		maps.put("赤", 3);
		maps.put("青", 1);
		maps.put("黄", 5);

		for(String key:maps.keySet()) {
			int value=maps.get(key);
			System.out.println(key+value);
		}





		Map<Integer,String>map=new TreeMap<>();
		map.put(3,"赤鉛筆");
		map.put(1,"青鉛筆");
		map.put(5,"黄鉛筆");
		map.put(0, "鉛筆");
		for(Integer key:map.keySet()) {
			String value=map.get(key);

			System.out.println(value+"の数は"+key);

		}
		Hero h=new Hero();
		h.setName("勇者");
		System.out.println("こんにちは"+h.getName());

		String s="Java";
		if(s.matches("Java")) {
			System.out.println("OK");
		}
		if("Jaaaaava".matches("Ja.*")) {
			System.out.println("OK");
		}
		if("url".matches("[a-z]{3}")) {
			System.out.println("OK");
		}
		s="abc,def;ghi";
		String[] word=s.split("[,;]");
		for(String w:word) {
			System.out.print(w);
		}
		System.out.println();
		s="abcdefghi";
		String w=s.replaceAll("[acdefghi]", "b");
		System.out.print(w);
		System.out.println();
		String y=w.substring(0,1);
		System.out.println(y);

		StringBuilder sb =new StringBuilder();
		sb.append("hello").append("java").append("world");
		System.out.println(sb);


	}

	private static boolean containsKey(int i) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
class Hero{
	private String name;
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return this.name;
	}
}
