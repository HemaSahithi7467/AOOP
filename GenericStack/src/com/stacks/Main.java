package com.stacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInterface<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        System.out.println("LinkedListStack (peek): " + linkedListStack.peek()); // 20
        System.out.println("LinkedListStack (pop): " + linkedListStack.pop());   // 20
        System.out.println("LinkedListStack (isEmpty): " + linkedListStack.isEmpty()); // false

        // Testing ArrayStack with String type
        StackInterface<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("Hello");
        arrayStack.push("World");
        System.out.println("ArrayStack (peek): " + arrayStack.peek()); // World
        System.out.println("ArrayStack (pop): " + arrayStack.pop());   // World
        System.out.println("ArrayStack (isEmpty): " + arrayStack.isEmpty()); // false
    }
	}


