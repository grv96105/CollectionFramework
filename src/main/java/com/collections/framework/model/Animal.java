package com.collections.framework.model;


public class Animal implements Comparable<Animal>{

	int age;
	String name;
	int weight;
	
	public Animal(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nAnimal [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Animal o) {
		if(this.age == o.age) {
		 return this.name.compareTo(o.name);	
		}
		return this.age - o.age;
	}
}
