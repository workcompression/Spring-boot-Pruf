package com.mypractice.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Mylinkedlist {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());
	}

}
