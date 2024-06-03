package com.collections.framework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {


	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.remove(Integer.valueOf(20));
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		
		list.add(5);
		list1.add(5);
		
		System.out.println(list1);
		
		//for addAll method both the list should have a common dataType
		list.addAll(1, list1);
		
		System.out.println(list);
		
		list.add(5);
		list1.add(5);
		
		// it removes the other list + intersection elements means the common elements
		// in both the lists
		list.removeAll(list1);
		System.out.println(list);
		
		list.add(5);
		//It will remove all the elements but common elements 
		list.retainAll(list1);
		
		System.out.println(list);
		
		//If I want to convert a list in to array 
		Object a[] = list.toArray();
		for(Object i : a) {
			System.out.println(i);
		}
		
		
		//List class methods --> New  Class
		 System.out.println(list1.get(1));
		 System.out.println(list1);
		
	}
	
}
