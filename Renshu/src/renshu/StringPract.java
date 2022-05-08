package renshu;

public class StringPract {

	public static void main(String[] args) {

		String s="Java";
		if(s.matches("Java")) {
			System.out.println("OK");
		}
		//Jとvaの間、この場合二番目の文字は何でも良い
		if(s.matches("J.va")) {
			System.out.println("OK");
		}
		//*で直前の文字を0回以上繰り返し
		if("Jaaaava".matches("Ja*va")) {
			System.out.println("OK");
		}
		//Jaで始まる任意の文字
		if(s.matches("Ja.*")) {
			System.out.println("OK");
		}
		//vaで終わる任意の文字
		if(s.matches(".*va")) {
			System.out.println("OK");
		}
		if("あいうxx019".matches(".*")) {
			System.out.println("OK");
		}
		//a-zからいずれか3文字
		if("url".matches("[a-z]{3}")) {
			System.out.println("OK");
		}
		s="abc,def;ghi";
		String[] words =s.split("[,;]");
				for(String w:words) {
					System.out.println(w+"->");
				}
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);;//aXc,dXf;gXi

		Method(3,5,7,9);
		Method();//何も起こらない
		int sum=sumOf(3,6,8);
		System.out.println(sum);//17
		sum=sumOf(1,4,5,6);
	}
	public static void Method(int...args) {
		for(int i:args) {
			System.out.println(i);
		}
	}
	public static int sumOf(int n,int...nums) {
		int sum=n;
		for(int i :nums) {
			sum+=i;
		}
		return sum;
	}

}
