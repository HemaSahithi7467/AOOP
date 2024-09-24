package com.queue;
import java.util.ArrayList;
import java.util.Collections;
public class PriorityQueue<T extends Comparable<T>> {
	 private ArrayList<T> elements;

	    public PriorityQueue() {
	        elements = new ArrayList<>();
	    }

	    // Add an element to the queue
	    public void enqueue(T element) {
	        elements.add(element);
	        Collections.sort(elements); // Sort the queue to maintain priority
	    }

	    // Remove and return the highest priority element
	    public T dequeue() {
	        if (!isEmpty()) {
	            return elements.remove(0); // The smallest element has the highest priority
	        }
	        return null; // Handle empty queue case
	    }

	    // Peek at the highest priority element without removing it
	    public T peek() {
	        if (!isEmpty()) {
	            return elements.get(0);
	        }
	        return null; // Handle empty queue case
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return elements.isEmpty();
	    }

	    // Get the size of the queue
	    public int size() {
	        return elements.size();
	    }

}
