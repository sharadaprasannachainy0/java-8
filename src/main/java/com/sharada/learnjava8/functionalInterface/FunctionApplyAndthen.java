package com.sharada.learnjava8.functionalInterface;

import java.util.function.Function;

public class FunctionApplyAndthen {

    public static void main(String args[])
    {
        // Function which takes in a number and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Now treble the output of half function
        half = half.andThen(a -> 3 * a);

        // andThen() method returns a composed function
        // that applies the current function first
        // and then the after function

        // Applying the function to get the result and printing on console
        System.out.println(half.apply(10));
    }
}
