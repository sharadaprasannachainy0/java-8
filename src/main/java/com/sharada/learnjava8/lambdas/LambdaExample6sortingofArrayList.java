package com.sharada.learnjava8.lambdas;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExample6sortingofArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

        // using lambda expression in place of comparator object
            //  returns negative value(-1), if and only if obj1 has to come before obj2.
            //	returns positive value(+1), if and only if obj1 has to come after obj2.
            //	returns zero(0), if and only if obj1 and obj2 are equal

        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 :
                (o1 < o2) ? 1 : 0);

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);
    }

}
