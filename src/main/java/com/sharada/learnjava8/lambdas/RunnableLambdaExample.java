package com.sharada.learnjava8.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        // create a runnable interface prior to java 8

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // Now use java 8 lambda ()->{}. Implement runnable interface using lambda.

        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda1 = ()->System.out.println("Inside Runnable 3 single statement");

        Runnable runnableLambda2 = ()->{
            System.out.println("Inside Runnable 3.1 multi statement-1");
            System.out.println("Inside Runnable 3.1 multi statement-2");
        };

        new Thread(runnableLambda).start();

        new Thread(runnableLambda1).start();
        new Thread(runnableLambda2).start();

        new Thread(()->System.out.println("Inside Runnable 4")).start();
    }
}
