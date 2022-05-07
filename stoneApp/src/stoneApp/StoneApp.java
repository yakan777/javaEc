package stoneApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StoneApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int count = 0;
		int turn = 0;

		List<Creature> list = new ArrayList<>();
		list.add(new Demon("赤鬼"));
		list.add(new BigDemon("青鬼"));

		System.out.print("あなたの年齢を数字で入力してください>");
		int age = sc.nextInt();
		System.out.print("\n    ^   ^_^  山　^ 　　　/ 目が覚めた？ここは地獄だよ\n" + "　　　／i＼/ ・ω・ ヽl／i＼ < 現世に戻るため鬼の目を盗んで石を百個以上積もう！\n"
				+ "　　　⌒⌒^3::..　 Σ）^⌒⌒  | 掛かったターンの分だけ現実世界で時が一年進んで\n" + "　　　　　　 `m--m‐´| 　　　  \\ 寿命が一年縮まるから気を付けて！！\n");

		while (true) {
			System.out.print("\n現在積んだ石:" + count + "個 現在のターン" + turn + "\n(0:片手で石を積む 1:両手で石を積む)>");
			int select = sc.nextInt();
			if (select == 0) {
				int n = rnd.nextInt(4) + 5;
				count += n;
				turn++;
				System.out.println("\nあなたは片手でそっと石を" + n + "個積んだ");
				if (count >= 100) {
					System.out.println(
							"\nあなたは石を百個以上(" + count + ")積んだので現世に戻れます!お疲れ様" + "\nあなたの現在の年齢（" + (age + turn) + "歳）");
					return;
				}
				System.out.print("\n近くに鬼の気配がする…\n現在積んだ石:" + count + "個 現在のターン:" + turn
						+ "\n(0:鬼に見つからないように１ターンじっとする 1:寿命が縮むのが嫌なので石を積み続ける)>");
				int selectOne = sc.nextInt();
				if (selectOne == 0) {
					int r = rnd.nextInt(10) + 1;

					if (r == 10) {
						System.out.println("\n静かにしていたが運悪く見つかった！");
						list.get(0).attack();
						double temp = count * 0.7;
						count = (int) temp;
						System.out.println("石は" + count + "まで減ってしまった…");
						turn++;
					} else {
						System.out.println("\nあなたは息をひそめて鬼がいなくなるのを待った");
						turn++;
					}
				} else if (selectOne == 1) {
					int r = rnd.nextInt(10) + 1;
					if (r == 5 || r == 10) {
						list.get(0).attack();
						double temp = count * 0.7;
						count = (int) temp;
						System.out.println("石は" + count + "まで減ってしまった…");
						turn++;
					} else {
						list.get(0).pass();
					}
				}
			} else if (select == 1) {
				int n = rnd.nextInt(10) + 10;
				count += n;
				turn++;
				System.out.println("\nあなたは両手で豪快に石を" + n + "個積んだ");
				if (count >= 100) {
					System.out.println(
							"\nあなたは石を百個以上(" + count + ")積んだので現世に戻れます!お疲れ様" + "\nあなたの現在の年齢（" + (age + turn) + "歳）");
					return;
				}
				System.out.print("\n近くに恐ろしい鬼の気配がする…\n現在積んだ石:" + count + "個 現在のターン:" + turn
						+ "\n(0:鬼に見つからないように１ターンじっとする 1:寿命が縮むのが嫌なので石を積み続ける)>");
				int selectOne = sc.nextInt();
				if (selectOne == 0) {
					int r = rnd.nextInt(10) + 1;

					if (r == 1 || r == 5 || r == 10) {
						System.out.println("\n静かにしていたが運悪く見つかった！");
						list.get(1).attack();
						double temp = count * 0.5;
						count = (int) temp;
						System.out.println("石は" + count + "まで減ってしまった…");
						turn++;
					} else {
						System.out.println("\nあなたは息をひそめて鬼がいなくなるのを待った");
						turn++;
					}
				} else if (selectOne == 1) {
					int r = rnd.nextInt(10) + 1;
					if (r % 2 == 0) {
						list.get(1).attack();
						int temp = count;
						count -= temp;
						System.out.println("石は全て崩れてしまった…またやり直しだ…");
						turn++;
					} else {
						list.get(0).pass();
					}
				}

			}

		}

	}
}

abstract class Creature {
	String name;

	Creature(String name) {
		this.name = name;
	}

	abstract void attack();

	abstract void pass();

}

class Demon extends Creature {

	Demon(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("\n" + this.name + "があなたを見つけた！石を蹴り飛ばす!");
	}

	@Override
	void pass() {
		System.out.println("\n" + this.name + "はあなたを見つけられず通り過ぎた…");
	}
}

class BigDemon extends Demon {

	BigDemon(String name) {
		super(name);
	}

	@Override
	void attack() {
		System.out.println("\n" + this.name + "があなたを見つけた！こん棒で石を吹き飛ばした！");
	}

	@Override
	void pass() {
		System.out.println("\n" + this.name + "はあなたを見つけられず通り過ぎた…");
	}
}