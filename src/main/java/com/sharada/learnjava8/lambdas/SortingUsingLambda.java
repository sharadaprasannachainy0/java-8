package com.sharada.learnjava8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingLambda {

    public static void main(String[] args)
    {

        // Creating a List of integer type
        List<Integer> list
                = Arrays.asList(24, 346, 78, 90, 21, 765);

        // Printing before sorting
        System.out.println("Before sorting.");

        for (int i : list)
            System.out.print(i + " ");

        System.out.println();

        // Sort the integers based on last digit
        Collections.sort(list, (a1, a2) -> {
            return a1 % 10 > a2 % 10 ? 1 : -1;
        });

        // Printing after sorting
        System.out.println("After sorting.");

        for (int i : list)
            System.out.print(i + " ");

        System.out.println();
    }
}
