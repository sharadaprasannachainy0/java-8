package com.sharada.learnjava8.functionalInterface;

import java.util.function.Predicate;

public class PredicateChainingExample2 {

    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        //boolean result = greaterThanTen.or(lowerThanTwenty).test(25);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }
}
