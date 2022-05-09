package day4;

public class CombApp {

	public static void main(String[] args) {

		for(int i=1;i<=7;i++) {
			System.out.println();
			for(int j=i+1;j<=8;j++) {
				for(int k=j+1;k<=9;k++) {
					if(i+j+k==10) {
					System.out.print(""+i+j+k+" ");
					}
				}
			}
		}
	}

}
