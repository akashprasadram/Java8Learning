package com.modernjava.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Consumer Takes 1 argument and perform opertion on given argument
        Consumer<String> c = x -> System.out.println(x.length()+" the length value of x: "+x);
        c.accept("Up in the air");

        //Consumer with block statment
        Consumer<Integer> d= x-> {
            System.out.println("x*x = " +(x*x));
            System.out.println("x/x = " +(x/x));
        };
        d.accept(10);
    }
}
