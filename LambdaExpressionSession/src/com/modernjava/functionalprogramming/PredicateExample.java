package com.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //if number is greater than 10 return true else false
        Predicate<Integer> p1=i->i>10;
        System.out.println(p1.test(20));

        //if i>10 and number is even(i%2==0)
        Predicate<Integer> p2=i->i%2==0;
        System.out.println(p1.and(p2).test(20));

        //if i>10 or number is even(i%2==0)
        System.out.println(p1.or(p2).test(4));

        //i>10 && i%2!=0
        System.out.println(p1.and(p2.negate()).test(33));
    }
}
