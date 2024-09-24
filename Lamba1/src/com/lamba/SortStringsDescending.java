package com.lamba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsDescending {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Sort the list in descending order using a lambda expression
        Collections.sort(stringList, (s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println("Sorted list in descending order: " + stringList);
    }
}

