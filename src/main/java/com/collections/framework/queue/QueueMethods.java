package com.collections.framework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

	
	public static void main(String[] args) {
		
		Queue<Integer> qu = new LinkedList<>();
		
		//offer we use for don't get exception
		System.out.println(qu.add(5));
		qu.offer(10);
		qu.offer(20);
		qu.offer(30);
		qu.offer(40);
		
		System.out.println("queue: "+ qu);
		
		//peek we use to retrieve the first element 
		System.out.println("peek: "+ qu.peek());
		System.out.println("queue: "+ qu);
		
		
		//Poll we use to remove the first element 
		System.out.println("poll: "+ qu.poll());
		System.out.println("queue: "+ qu);
		
	}
}
