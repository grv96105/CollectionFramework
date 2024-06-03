package com.collections.framework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMethods {

	
	public static void main(String[] args) {
		
		//With default size 11
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(10);
		pq.offer(30);
		pq.offer(5);
		pq.offer(89);
		
		System.out.println("Default Priority Queue of Integer: "+ pq);
		System.out.println();
		System.out.println(pq.poll());
		System.out.println("Default Priority Queue of Integer: "+ pq);
		System.out.println();
		System.out.println(pq.poll());
		System.out.println();
		System.out.println(pq.poll());
		System.out.println();
		System.out.println(pq.poll());
		System.out.println();
		//With given size
		Queue<String> strPq = new PriorityQueue<>(20);
		strPq.offer("Gaurav");
		strPq.offer("Sakshi");
		strPq.offer("a");
		strPq.offer("A");
		strPq.offer("B");
		
		System.out.println("Priority Queue of String: "+ strPq);
		System.out.println();
		System.out.println(strPq.poll());
		System.out.println("Priority Queue of String: "+ strPq);
		System.out.println();
		System.out.println(strPq.poll());
		System.out.println();
		System.out.println(strPq.poll());
		System.out.println();
		System.out.println(strPq.poll());
		System.out.println();
		System.out.println(strPq.poll());
		System.out.println();
		//With given comparators
		Queue<Integer> pqc = new PriorityQueue<>((a,b)->b-a);
		pqc.offer(2);
		pqc.offer(54);
		pqc.offer(67);
		pqc.offer(12);
		pqc.offer(9);
		
		System.out.println("Priority Queue with Comparator: "+ pqc);
		System.out.println();
		
		System.out.println(pqc.poll());
		System.out.println("Priority Queue with Comparator: "+ pqc);
		System.out.println();
		System.out.println(pqc.poll());
		System.out.println();
		System.out.println(pqc.poll());
		System.out.println();
		System.out.println(pqc.poll());
		System.out.println();
	}
	
}
