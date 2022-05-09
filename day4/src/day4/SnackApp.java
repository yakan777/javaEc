package day4;

public class SnackApp {

	public static void main(String[] args) {

		Snack[] snacks = {
				new Snack("アメ", 30),
				new Snack("チョコ", 120),
				new Snack("ガム", 100),
				new Snack("ポテチ", 80),
				new Snack("ビスケット", 90),
		};
		for (int i = 0; i < snacks.length - 1; i++) {
			for (int j = i + 1; j < snacks.length; j++) {
				if (snacks[i].price + snacks[j].price <= 200) {
					System.out.printf("[%s,%s]%n", snacks[i], snacks[j]);
				}
			}
		}
		System.out.println("重複あり");
		for (int i = 0; i < snacks.length; i++) {
			for (int j = i + 1; j < snacks.length + 1; j++) {
				if (snacks[i].price + snacks[j - 1].price <= 200) {
					System.out.printf("[%s,%s]%n", snacks[i], snacks[j - 1]);
				}
			}
		}
		System.out.println("3つ");
		for (int i = 0; i < snacks.length; i++) {
			for (int j = i + 1; j < snacks.length + 1; j++) {
				for (int k = j + 1; k < snacks.length + 2; k++) {
					if (snacks[i].price + snacks[j - 1].price + snacks[k - 2].price <= 300) {
						System.out.printf("[%s,%s,%s]%n", snacks[i], snacks[j - 1], snacks[k - 2]);
					}
				}
			}
		}

	}
}

class Snack {
	String name;
	int price;

	Snack(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)",this.name,this.price);
	}
}