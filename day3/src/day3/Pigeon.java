package day3;

public class Pigeon extends Animal implements Flyable {

	Pigeon(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Fly() {
		System.out.println("ばさばさ");

	}

	@Override
	void makeNoise() {
		System.out.println("ぽぽぽ");
	}


}
