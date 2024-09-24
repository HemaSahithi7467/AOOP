package com.gen1;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {5, 2, 8, 3, 9, 1};
        ArrayOperation<Integer> intOps = new ArrayOperation<>();
        System.out.println("Integer Array: Min = " + intOps.min(intArray) + ", Max = " + intOps.max(intArray));

        // String array
        String[] strArray = {"apple", "orange", "banana", "kiwi"};
        ArrayOperation<String> strOps = new ArrayOperation<>();
        System.out.println("String Array: Min = " + strOps.min(strArray) + ", Max = " + strOps.max(strArray));

        // Character array
        Character[] charArray = {'a', 'z', 'm', 'b'};
        ArrayOperation<Character> charOps = new ArrayOperation<>();
        System.out.println("Character Array: Min = " + charOps.min(charArray) + ", Max = " + charOps.max(charArray));

        // Float array
        Float[] floatArray = {1.5f, 2.8f, 0.9f, 3.6f, 2.1f};
        ArrayOperation<Float> floatOps = new ArrayOperation<>();
        System.out.println("Float Array: Min = " + floatOps.min(floatArray) + ", Max = " + floatOps.max(floatArray));
    }

	}


