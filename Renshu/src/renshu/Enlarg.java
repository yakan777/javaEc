package renshu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Enlarg {

	public static void main(String[] args) {
		Random rnd=new Random();
		int[] data= {1,2,3,4,5};
		for(int i=0;i<data.length;i++) {
			int idx = rnd.nextInt(data.length-i)+i;
			int temp=data[idx];
			data[idx]=data[i];
			data[i]=temp;
		}
		System.out.println(Arrays.toString(data));
		/*List<Monster> m = new ArrayList<>();
		m.add(new Goblin("ゴブリン"));
		m.add(new HyperGoblin("ハイパーゴブリン"));
		for(Monster a:m) {
			a.attack();
		}
		for(Monster r:m) {
			r.run();
		}*/


		List<Integer>list = new LinkedList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(Integer n:list) {
			System.out.println(n);
		}

		Set<String>set = new HashSet<>();
		set.add("赤");
		set.add("青");
		set.add("赤");
		set.add("黄");
		for(String s:set) {
			System.out.println(s);
		}
		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			String e=it.next();
		System.out.println(e);
		}

		StringBuilder sb=new StringBuilder("Hello");
		sb.append("world");
		System.out.println(sb);
		String s=("Halooooo");

		s=s.substring(0,4);
		System.out.println(s);

		if(s.matches("Halo*")) {
		System.out.println("OK");
		}

		Map<Integer,String>map=new TreeMap<>();
		map.put(5, "みかん");
		map.put(3, "りんご");
		map.put(1, "めろん");
		for(Integer key:map.keySet()) {
			String value=map.get(key);
			if(containsKey(5)) {
			System.out.println(key+value);
			}
		}
	}

	private static boolean containsKey(int i) {
		// TODO 自動生成されたメソッド・スタブ
		return true;

	}
}
/*interface Creature{
}

abstract class Monster implements Creature{
	String name;
	Monster(String name){
		this.name=name;
	}
	abstract void attack();
	abstract void run();
}
class  Goblin extends Monster{
	Goblin(String name) {
		super(name);
	}
	@Override
	void attack() {
		System.out.println(this.name+"は切り付けた");
	}
	@Override
	void run() {
		System.out.println(this.name+"は逃げ出した");
	}
}
class HyperGoblin extends Goblin{
	HyperGoblin(String name){
		super(name);
}
	@Override
	void attack() {
		System.out.println(this.name+"は飛び掛かった");
	}
	@Override
	void run() {
		System.out.println(this.name+"は飛び去った");
	}
}*/