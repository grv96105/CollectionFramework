package com.collections.framework.list;

import java.util.List;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {

		// Type of List and object of Stack--> it would access methods of List only not stack
		// because the object is a type of List.
		List<Integer> stackList = new Stack<>();

		stackList.add(10);
		stackList.add(20);
		stackList.add(30);

		System.out.println("stackList: "+stackList);
		
		System.out.println();
		//Type of Stack and object is also of Stack
		Stack<Integer> st = new Stack<>();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		
		System.out.println("Stack: "+ st);
	
		//It will pop(retrieve and remove) the last element pushed in to the stack
		System.out.println("Pop: "+st.pop());
		System.out.println("Stack after pop: "+ st);
		
		//It will retrieve the last element not removes 
		System.out.println("Peek: "+st.peek());
		System.out.println("Stack after peek: "+ st);
		
	}
}
