package com.collections.framework.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collections.framework.model.Animal;

class CustomComparator implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class ComparatorLearning {

	public static void main(String[] args) {

		Animal a1 = new Animal(5, "Maxo", 15);
		Animal a2 = new Animal(2, "Bruno", 7);
		Animal a3 = new Animal(4, "Leo", 10);
		Animal a4 = new Animal(5, "Don", 12);

		List<Animal> dogs = new ArrayList<>();
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);

		System.out.println("Dogs :" + dogs);

		// way 1: Comparator using Anonymous function
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal o1, Animal o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println();
		System.out.println("Dogs with anonymnous function sorting: " + dogs);

		// way 2: Comparator using Custom Comparator Class
		Collections.sort(dogs, new CustomComparator());

		System.out.println();
		System.out.println("Dogs with Custom Comparator Class sorting: " + dogs);

		// way 3: Comparator using Java8 lambda expression
		Collections.sort(dogs, (o1, o2) -> {
			return Integer.compare(o1.getAge(), o2.getAge());
		});
		System.out.println();
		System.out.println("Dogs with Java8 lambda sorting: " + dogs);

		// way 4: Comparator using Comparator.comparing and thenComparing method
		Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getWeight));
		System.out.println();
		System.out.println("Dogs with Comparator.comparing sorting: " + dogs);
	}
}
