package com.stacks;
import java.util.LinkedList;

public class LinkedListStack<T> implements StackInterface<T> {
	 private LinkedList<T> list;

	    public LinkedListStack() {
	        list = new LinkedList<>();
	    }

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		 list.addFirst(element);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
            return list.removeFirst();  // Pop from the top
        }
        return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
            return list.getFirst();  // Peek at the top element
        }
        return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return list.isEmpty();
	}

}
