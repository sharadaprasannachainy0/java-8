package com.sharada.learnjava8.functionalInterface;

import java.util.function.Function;

public class FunctionIdentity {

    public static void main(String args[])
    {
        // identity() method returns a function that returns its own argument
        // Function which takes in a number and returns it
        Function<Integer, Integer> i = Function.identity();

        // Print statement
        System.out.println(i.apply(10));
    }
}
