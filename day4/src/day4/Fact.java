package day4;

public class Fact {

	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		System.out.println(factorial1(10));
		System.out.println();
	}
	static int factorial(int n) {
		int result=n;
		for(int i=n-1;i>0;i--) {
			result*=i;
		}

		return result;
	}
	//recursive(再帰処理)
	static int factorial1(int n) {
		if(n==1) {
			return n;
		}
		return n*factorial1(n-1);
	}


}
