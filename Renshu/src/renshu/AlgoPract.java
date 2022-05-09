package renshu;

import java.util.Arrays;
import java.util.Random;

public class AlgoPract {

	public static void main(String[] args) {

		Random rnd=new Random();
		//数字を逆から表示する
		int[] data= {1,2,3,4,5};
		for(int i=0;i<data.length/2;i++) {
			int tmp =data[i];
			data[i]=data[data.length-1-i];
			data[data.length-1-i]=tmp;
		}
		System.out.println(Arrays.toString(data));

		//数字をかぶりなくランダムに表示
		for(int i=0;i<data.length-1;i++) {
			int idx=rnd.nextInt(data.length-i)+i;
			int tmp =data[idx];
			data[idx]=data[i];
			data[i]=tmp;
		}
		System.out.println(Arrays.toString(data));
		//昇順ソート
		int[] data2= {10,6,3,9,7};
		for(int i=0;i<data2.length;i++) {
			for(int j =i+1;j<data2.length;j++) {
				//降順の時はここを逆にする↓
				//if(data2[i]>data2[j]) {
				if(data2[i]<data2[j]) {
					int temp=data2[i];
					data2[i]=data2[j];
					data2[j]=temp;
				}

			}
		}
		System.out.println(Arrays.toString(data2));
	}

}
