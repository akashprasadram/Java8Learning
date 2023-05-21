package com.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1=i->i.isOnlineCourses();
        Predicate<Instructor> p2=Instructor::isOnlineCourses;

        Function<Integer,Double> sqrt=n->Math.sqrt(n);
        Function<Integer,Double> sqrt1=Math::sqrt;

        Function<String,String> lowercaseFunction=s1->s1.toLowerCase();
        Function<String,String> lowercaseFunction1=String::toLowerCase;
    }
}
