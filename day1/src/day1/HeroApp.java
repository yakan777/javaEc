package day1;

public class HeroApp {

	public static void main(String[] args) {
		Hero h =new Hero();
		h.setName("ゆうしゃ");
		h.setHp(100);
		Wand wand=new Wand();
		wand.setName("普通の杖");
		wand.setPower(20);
		Wizard w =new Wizard();
		w.setName("うぃざーど");
		w.setHp(100);
		w.setMp(100);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h);
	}

}

