package com.collections.framework.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {

		//HashSet
		// Majorly Hashset we use for initialization because its method are usually of
		// Big O(1) time complexity
		//Unordered sequence

		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(10);
		set.add(1);
		set.add(45);
		set.add(32);

		// If I add a duplicate element then it won't throw any exception or error
		// instead it won't add the duplicate element and will return false
		System.out.println(set.add(10));

		System.out.println("Hash Set :" + set);
		System.out.println();

		//LinkedHashSet
		//function like LinkedList create address for each element 
		//O(1) add 
		//O(n) remove and contains 
		//Input sequence order
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(10);
		lhs.add(1);
		lhs.add(45);
		lhs.add(32);
		
		System.out.println(lhs.add(10));
		System.out.println("Linked Hash Set :" + lhs);
		System.out.println();
		
		//TreeSet
		//Internally uses Binary Search
		//O(log n) 
		//Sorted order in InTraversalOrder
		Set<Integer> ts = new LinkedHashSet<>();
		ts.add(5);
		ts.add(10);
		ts.add(1);
		ts.add(45);
		ts.add(32);
		
		System.out.println(ts.add(10));
		System.out.println("Tree Set :" + ts);
		System.out.println();
		
	}
}
