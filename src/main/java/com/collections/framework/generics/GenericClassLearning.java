package com.collections.framework.generics;

//Simple class with no generics
class Laptop {
	
	int id;
	String description;
	
	public Laptop(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
}

//Simple class with generics
class Mobile<E,G>{
	
	E id;
	G description;
	
	public Mobile(E id, G description) {
		super();
		this.id = id;
		this.description = description;
	}

	public E getId() {
		return id;
	}

	public G getDescription() {
		return description;
	}
	
}
public class GenericClassLearning {

	public static void main(String[] args) {
		
		Laptop lp1 =new Laptop(1, "desc");
		Laptop lp2 =new Laptop(2, "desc123");
		Laptop lp3 =new Laptop(3, "Lenovo");
		
		Mobile<Integer, String> mb1 = new Mobile<>(1, "mobile");
		Mobile<Integer, Integer> mb2 = new Mobile<>(2, 7865);
		Mobile<String, String> mb3 = new Mobile<>("1234", "DX750");
		Mobile<String, Integer> mb4 = new Mobile<>("DHG1244X23", 876);
		
		System.out.println(mb1.getDescription()+ " "+ mb1.getId());
	}
}
