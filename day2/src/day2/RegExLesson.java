package day2;

public class RegExLesson {

	public static void main(String[] args) {
		String s = "Java";
		if (s.matches("Java")) {
			System.out.println("Match!");
		}
		if (s.matches("J.va")) {
			System.out.println("Match!");
		}
		if ("Jaaaaaaava".matches("Ja*va")) {
			System.out.println("Match!");
		}
		if ("あいうxx019".matches(".*")) {
			System.out.println("Match!");
		}
		if ("url".matches("[a-z]{3}")) {
			System.out.println("Match!");
		}
		s = "abc,def:ghi";
		String[] words = s.split("[,;]");
		for (String w : words) {
			System.out.println(w + "->");
		}
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w); //aXc,dXf:gXi

		Method(3, 5, 7, 9);
		Method();//何も起こらない
		int sum=sumOf(3,6,8);
		System.out.println(sum); //17
		sum=sumOf(1,4,5,6);
	}

	public static void Method(int... args) {
		for (int i : args) {
			System.out.println(i);
		}
	}

	public static int sumOf(int n,int... nums) {
		int sum = n;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}
}
