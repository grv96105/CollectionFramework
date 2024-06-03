package com.collections.framework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMoreMethods {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.println("Basic For Loop: "+fruits.get(i));
		}
		
		System.out.println();
		
		for(String fruit: fruits) {
			System.out.println("For each: "+fruit);
		}
		
		System.out.println();
		
		Iterator<String> fr = fruits.iterator();
		while(fr.hasNext()){
			System.out.println("Iterator: "+fr.next());
		}
		
		System.out.println();
		
		Iterator<String>li =  fruits.listIterator();
		while (li.hasNext()) {
			System.out.println("ListIterator: "+li.next());
		}
		
		System.out.println();
		
		//set fruit orange at the place of Grapes
		int j = fruits.indexOf("Grapes"); //finding index of the object
		fruits.set(j, "Orange"); //setting object at the index 
		System.out.println(fruits);
		
		System.out.println();
		
		//get a sublist of a List 
		System.out.println(fruits.subList(1, 3)); //fromIndex: inclusive and toIndex: exclusive
		
	}
}
