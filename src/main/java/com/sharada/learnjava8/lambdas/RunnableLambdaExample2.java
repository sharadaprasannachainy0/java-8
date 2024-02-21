package com.sharada.learnjava8.lambdas;

public class RunnableLambdaExample2 {

    public static void main(String[] args)
    {

        // Creating Lambda expression for run() method in
        // functional interface "Runnable"
        Runnable myRun = () ->
        {

            // Used to set custom name to the current thread
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };

        // Instantiating Thread class by passing Runnable
        // reference to Thread constructor
        Thread myThread = new Thread(myRun);

        // Starting the thread
        myThread.start();
    }
}
