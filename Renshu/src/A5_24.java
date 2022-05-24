import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class A5_24 {

	public static void main(String[] args) {

		List<Monster> list = new ArrayList<>();
        list.add(new Goblin("ゴブリン"));
        list.add(new HyperGoblin("ハイパーゴブリン"));
        for(Monster m:list) {
        	m.attack();
        	m.run();
        	if(m instanceof Goblin) {
        		((Goblin)m).jumpAttack();
        	}
        }
        List<Integer> data =new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        for(int i =0;i<data.size();i++) {
        	System.out.println(data.get(i));
        }
        Iterator<Integer> it=data.iterator();
        while(it.hasNext()) {
        	Integer e=it.next();
        	System.out.println(e);
        }
        Set<String> color=new HashSet<>();
       color.add("青");
       color.add("赤");
       color.add("黄");
       color.add("黄");
       for(String c:color) {
    	   System.out.println(c);
       }
       Iterator<String> its=color.iterator();
       while(its.hasNext()) {
    	   String c=its.next();
    	   System.out.print(c);
       }

       Map<Integer,String> map=new TreeMap<>();
       map.put(1, "メロン");
       map.put(3, "りんご");
       map.put(5, "みかん");
       for(Integer key:map.keySet()) {
    	 String value =map.get(key);
    	 System.out.println(value+"の数は"+key+"つ");
       }
 	StringBuilder sb=new StringBuilder("Hello ");
			sb.append("World");
			System.out.println(sb);
			
			int[] num= {1,2,3,4,5};
		for(int i=0;i<num.length-1;i++) {
			int index =new Random().nextInt(num.length-i)+i;
			int temp=num[index];
		}
	}
	
}
interface Creature{
}
abstract class Monster implements Creature{
String name;
Monster(String name){
this.name=name;
}
abstract void attack();
abstract void run();
}
class Goblin extends Monster{
Goblin(String name){
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
void jumpAttack() {
	System.out.println(this.name+"はひるがえってまた切り付けた");
}
}

class HyperGoblin extends Monster{
HyperGoblin(String name){
	super(name);
	}
@Override
void attack() {
	System.out.println(this.name+"は引っ搔いた");
}
@Override
void run() {
System.out.println(this.name+"は飛んで逃げた");
}
}

class Hero{
private String name;
int hp;
void setName(String name) {
	this.name=name;
}
String getName() {
	return this.name;
}
Hero(int hp){
this.hp=hp;
}
}