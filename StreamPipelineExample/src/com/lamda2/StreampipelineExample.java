package com.lamda2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreampipelineExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline: filter even numbers, double them, and collect into a list
        List<Integer> doubledEvens = numbers.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .map(n -> n * 2)           // Double each even number
                .collect(Collectors.toList()); // Collect into a list

        // Print the result
        System.out.println("Doubled even numbers: " + doubledEvens);
    }
}