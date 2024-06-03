package com.collections.framework.generics;

public class GenericMethodLearning {

	public static void main(String[] args) {
		
		printData("Gaurav");
		printData(12);
		printData(false);
		printData(21.34);
		
		//printing custom class object
		CustomClass custom = new CustomClass();
		printData(custom);

	}

	//Generic Method
	private static <T> void printData(T string) {
		System.out.println(string);
	}
}

class CustomClass{
	
}