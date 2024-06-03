package com.collections.framework.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collections.framework.model.Animal;

public class ComparableLearning {

	public static void main(String[] args) {

		Animal a1 = new Animal(5, "Maxo", 15);
		Animal a2 = new Animal(5, "Bruno", 7);
		Animal a3 = new Animal(4, "Leo", 10);
		Animal a4 = new Animal(5, "Don", 12);

		List<Animal> dogs = new ArrayList<>();
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);

		System.out.println("Dogs :" + dogs);

		System.out.println();
		//this.age-obj.age and if age is equal then sort by name 
		Collections.sort(dogs);

		System.out.println("Dogs After Sorting :\n" + dogs);
		
		
	}

}
