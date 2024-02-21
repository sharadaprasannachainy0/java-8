package com.sharada.learnjava;

import java.util.*;

public class HashSetExample {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        //  The objects that we insert into the HashSet
        //  do not guarantee to be inserted in the same order.
        //  The objects are inserted based on their hashcode.
        //  This class also allows the insertion of NULL elements.
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
