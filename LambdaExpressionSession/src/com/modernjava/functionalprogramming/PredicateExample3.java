package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = i->i>100;
        System.out.println(p1.test(100));

        LongPredicate p2= i->i>100L;
        System.out.println(p2.test(11111111111111L));

        DoublePredicate p3 = i ->i<100.25;
        DoublePredicate p4 = i -> i >100.10;
        System.out.println(p3.and(p4).test(100.15));

    }
}
