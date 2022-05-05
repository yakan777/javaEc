
public class Test {

	public static void main(String[] args) {
		Hero h =new Hero();
		h.setName("ゆうしゃ");
		h.setHp(100);
		System.out.println(h);
		Wizard w=new Wizard();
		w.setName("bbb");
		w.setHp(100);
		w.setMp(100);
		w.heal(h);
		System.out.println(h);
	}

}
class Hero{
	private String name;
	private int hp;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public int getHp() {
		return this.hp;
	}
	@Override
	public String toString() {
		return "名前:"+this.name+"/HP:"+this.hp;
	}
}
class Wizard{
	private String name;
	private int hp;
	private int mp;
	public void heal(Hero h) {
		h.setHp(h.getHp()+100);
		System.out.println(h.getName()+"のHPを回復した");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public int getHp() {
		return this.hp;
	}	public void setMp(int mp) {
		this.mp=mp;
	}
	public int getMp() {
		return this.mp;
	}
}

