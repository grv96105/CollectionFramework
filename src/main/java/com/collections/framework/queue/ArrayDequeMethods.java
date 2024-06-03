package com.collections.framework.queue;

import java.util.ArrayDeque;

public class ArrayDequeMethods {

	public static void main(String[] args) {

		// ArrayDeque is a Doubly Ended Queue
		// it could be used as both stack and queue
		// Arraydeque Extends Abstract Collection and implements Deque interface and
		// Deque Interface extends Queue Interface
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offer(5);
		ad.offerFirst(15);
		ad.offerLast(25);
		ad.addFirst(35);
		System.out.println("ArrayDeque: "+ ad);
		
		
		ArrayDeque<Integer> qu = new ArrayDeque<>();
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		qu.offer(40);
		System.out.println("Queue: "+ qu);
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
	
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		System.out.println("Stack: "+stack);
	}
	

}
