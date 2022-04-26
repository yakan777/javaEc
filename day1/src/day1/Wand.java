package day1;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public double getPower() {
		return this.power;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短い");
		}
		this.name = name;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100) {
			throw new IllegalArgumentException("正しい魔力を設定");
		}
		this.power = power;
	}
}

class Hero {
	private int hp;
	private String name;

	public int getHp() {
		return this.hp;
	}

	public String getName() {
		return this.name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
}

class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public String getName() {
		return this.name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
		//throw new IllegalArgumentException("処理を中断");

	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("正しいMPを入力してください");
		}
		this.mp = mp;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短い");
		}
		this.name = name;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("wandを正しくセットしてください");
		}
		this.wand = wand;
	}

}
