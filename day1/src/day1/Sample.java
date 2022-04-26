package day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("World");
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("京都", 255);
		map.put("東京", 1261);
		map.put("熊本", 181);
		System.out.println(map);
	}
}