package renshu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPract {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("taro");
		list.add("seven");
		list.add("ace");
		list.add("80");

		//for文以外にIteratorを使って配列を回せる
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String e=it.next();
			System.out.println(e);
		}

		System.out.println(list.size());
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);

		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		for(int n:nums) {
			System.out.println(n);
		}
		nums.add(0,100);
		System.out.println(nums);
		nums.set(0, 1000);
		System.out.println(nums);
		if(nums.isEmpty()) {
			System.out.println("true");

		}
		if(nums.contains(1000)) {
			System.out.println("含みます");
		}
		System.out.println(nums.indexOf(10));
		nums.remove(0);
		list.remove("80");
		nums.clear();
		if (nums.isEmpty()) {
			System.out.println("true");

		}
	}

}
