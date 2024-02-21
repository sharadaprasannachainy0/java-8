package com.sharada.learnjava;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(45);
        pQueue.add(40);
        pQueue.add(35);
        pQueue.add(55);

        System.out.println(pQueue);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
