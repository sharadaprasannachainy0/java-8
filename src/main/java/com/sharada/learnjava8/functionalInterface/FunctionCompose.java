package com.sharada.learnjava8.functionalInterface;

import java.util.function.Function;

public class FunctionCompose {

    public static void main(String args[])
    {

        Function<Integer, Double> func = a -> a * 2.0;

        func = func.compose(a -> 3 + a);

        // Applying the function to get the result
        System.out.println(func.apply(5));
    }
}
