package com.sharada.learnjava;

import java.util.*;

public class LinkedHashSetExample {

    // Main Method
    public static void main(String args[])
    {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs
                = new LinkedHashSet<String>();

        // LinkedHashSet uses a doubly linked list to store the data and
        // retains the ordering of the elements.
        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
