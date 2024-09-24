package com.gen1;

public class ArrayOperation <T extends Comparable<T>> implements MinMax<T> {

	@Override
	public T min(T[] array) {
		// TODO Auto-generated method stub
		 if (array == null || array.length == 0) {
	            return null; // Handle empty array
	        }

	        T min = array[0];
	        for (T element : array) {
	            if (element.compareTo(min) < 0) {
	                min = element;
	            }
	        }
	        return min;
	}

	@Override
	public T max(T[] array) {
		// TODO Auto-generated method stub
		if (array == null || array.length == 0) {
            return null; // Handle empty array
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
	}


