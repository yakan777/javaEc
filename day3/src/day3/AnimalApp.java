package day3;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<>();
		list.add(new Dog("John"));
		list.add(new Cat("Paul"));
		list.add(new Pig("George"));
		list.add(new Pigeon("Ringo"));
		list.add(new Eagle("Peter"));
		for(Animal a:list) {
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat) {
				((Cat)a).sleep();
			}
			if(a instanceof Flyable) {
				((Flyable)a).Fly();
			}
		}
	}

}
