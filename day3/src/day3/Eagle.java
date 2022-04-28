package day3;

public class Eagle extends Animal implements Flyable {

	Eagle(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}
@Override
	public void Fly() {

		System.out.println("シュイーン");
	}
@Override
	void makeNoise() {

		System.out.println("...");
	}
}
