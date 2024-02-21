package com.sharada.learnjava8.lambdas;

interface Test1 {
    void print();
}

class LambdaExample2noParameter {
    // functional interface parameter is passed
    static void fun(Test1 t) {
        t.print();
    }

    public static void main(String[] args) {
        // lambda expression is passed
        // without parameter to functional interface t
        fun(() -> System.out.println("Hello"));
    }
}

