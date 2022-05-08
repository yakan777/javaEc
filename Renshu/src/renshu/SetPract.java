package renshu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPract {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		//Setは重複分はカウントしない
		System.out.println("色は" + colors.size() + "種類");
		Iterator<String>it=colors.iterator();
		while(it.hasNext()) {
			String e=it.next();
			System.out.println(e);

		}
		//文字や数字をソートしたい場合はTreeSetを使う
		Set<String> colors2 = new TreeSet<>();
		colors2.add("赤");
		colors2.add("青");
		colors2.add("黄");
		colors2.add("赤");
		System.out.println("色は" + colors2.size() + "種類");
		for(String n:colors2) {
			System.out.println(n);
		}
		//格納順に表示したい場合はLinekedHashSetを使う
		Set<Integer> list =new LinkedHashSet<>();
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(1);
		Iterator<Integer> it2=list.iterator();
		while(it2.hasNext()) {
			Integer i=it2.next();
			System.out.println(i);
		}


	}

}
