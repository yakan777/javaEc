package renshu;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.next();
		while (true) {
			if (s.equals("A")) {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
		// System.out.println(count);
	}
}