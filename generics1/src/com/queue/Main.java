package com.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> intQueue = new PriorityQueue<>();
	        intQueue.enqueue(30);
	        intQueue.enqueue(10);
	        intQueue.enqueue(20);
	        System.out.println("Integer Queue (peek): " + intQueue.peek());  // 10
	        System.out.println("Integer Queue (dequeue): " + intQueue.dequeue());  // 10
	        System.out.println("Integer Queue (size): " + intQueue.size());  // 2

	        // Test with Double
	        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
	        doubleQueue.enqueue(2.5);
	        doubleQueue.enqueue(3.7);
	        doubleQueue.enqueue(1.2);
	        System.out.println("Double Queue (peek): " + doubleQueue.peek());  // 1.2
	        System.out.println("Double Queue (dequeue): " + doubleQueue.dequeue());  // 1.2
	        System.out.println("Double Queue (size): " + doubleQueue.size());  // 2

	        // Test with String
	        PriorityQueue<String> stringQueue = new PriorityQueue<>();
	        stringQueue.enqueue("banana");
	        stringQueue.enqueue("apple");
	        stringQueue.enqueue("cherry");
	        System.out.println("String Queue (peek): " + stringQueue.peek());  // apple
	        System.out.println("String Queue (dequeue): " + stringQueue.dequeue());  // apple
	        System.out.println("String Queue (size): " + stringQueue.size());  // 2
	    
	}

}
