package com.sharada.learnjava8.lambdas;

interface FuncLeapyr {

    // Boolean function to check over
    // natural number depicting calendar year 'n' deepicting year is passed as a parameter
    boolean test(int n);
}

public class BlockLambdasExample2 {

    public static void main(String[] args)
    {
        // block lambda
        // This block lambda checks if the given year is leap year or not
        FuncLeapyr leapyr = (year) ->
        {
            // Condition check
            // If year is divisible by 400 or the
            // year is divisible by 4 and 100 both
            if (((year % 400 == 0)
                    || (year % 4 == 0) && (year % 100 != 0)))
                // Returning true as year is leap year
                return true;
            else
                // Returning false for non-leap years
                return false;
        };

        // Calling lambda function over custom input year- 2020

        // Condition check using the test() defined in the above interface
        if (leapyr.test(2020))
            System.out.println("leap year");
        else
            System.out.println("Non leap year");
    }
}
