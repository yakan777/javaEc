package renshu;

import java.util.ArrayList;
import java.util.List;

public class MonsterPract {

	public static void main(String[] args) {

		List<Monster> list=new ArrayList<>();
		list.add(new Goblin("ゴブリン"));
		list.add(new HyperGoblin("ハイパーゴブリン"));
		for(Monster i:list) {
			i.attack();
			i.run();
		}
		FryGoblin fGoblin=new FryGoblin();
		fGoblin.setName("フライゴブリン");
		System.out.println(fGoblin.getName()+"があらわれた");
		fGoblin.run();

	}

}
interface Creture{
}
abstract class Monster implements Creture{
	String name;
	Monster(String name){
		this.name=name;
	}
	abstract void run();
	abstract void attack();

}
class Goblin extends Monster{
	Goblin(String name){
	super(name);
	}
	@Override
	void run(){
		System.out.println("とことこ走って逃げた");
	}
	@Override
	void attack() {
		System.out.println("ナイフで切り付けた");
	}
}
class HyperGoblin extends Goblin{
	HyperGoblin(String name){
		super(name);
	}
	@Override
	void run(){
		System.out.println("音もなく消えた");
	}
	@Override
	void attack() {
		System.out.println("鋭い爪で複数攻撃");
	}

}
class FryGoblin{
	private String name;
	void setName(String name) {
		this.name=name;
	}
	String  getName() {
		return this.name;
	}
	void run() {
		System.out.println("何もせず去っていった");
	}
}
