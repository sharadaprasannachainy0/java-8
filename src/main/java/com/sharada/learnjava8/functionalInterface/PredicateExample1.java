package com.sharada.learnjava8.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }
}
