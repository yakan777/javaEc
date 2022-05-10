package renshu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test2Review {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		List<Animal>animal=new ArrayList<>();
		animal.add(new Cat("ネコ"));
		animal.add(new Cat("ブタ"));
		for(Animal a:animal) {
			a.noise();
			if(a instanceof Cat) {
				((Cat)a).sleep();
			}
		}
		int[] data= {10,47,3,99,22};
		for(int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]<data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));

		int[] data2= {1,2,3,4,5};
		for(int i=0;i<data2.length/2;i++) {
			int temp=data[i];
			data[i]=data[data.length-1-i];
			data[data.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(data2));

		for(int i=0;i<data.length-1;i++) {
			int idx=rnd.nextInt(data.length-i)+i;
			int temp=data[idx];
			data[idx]=data[i];
			data[i]=temp;
		}


		List<Integer>list=new ArrayList<>();
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		Collections.reverse(list);
		System.out.println(list);
	}

}
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void noise();
}
class Cat extends Animal{
	Cat(String name){
	super(name);
	}
	@Override
	void noise() {
		System.out.println(this.name+"はニャーと鳴いている");
	}
	void sleep() {
		System.out.println(this.name+"はすやすや寝ている");
	}
}
class Pig extends Animal{
	Pig(String name){
		super(name);
	}
	@Override
	void noise() {
		System.out.println(this.name+"はおびえてピギーッと鳴いた");
	}
}