package com.sharada.learnjava8.functionalInterface;

import java.util.function.Supplier;

public class SupplierGet {

    public static void main(String args[])
    {
        // Suppliers are useful when we don’t need to supply any value
        // and obtain a result at the same time.

        // The Supplier interface consists of only one function get()
        // which eventually produces a value
        
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
