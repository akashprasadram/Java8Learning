package com.modernjava.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LongStreamExample {
    public static void main(String[] args) {
        //using of
        LongStream numbers=LongStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        System.out.println("-------------");
        //iterate
        numbers=LongStream.iterate(1,i->i+2).limit(5);
        numbers.forEach(System.out::println);

        System.out.println("-------------");
        //random Generator
        numbers=LongStream.generate(new Random()::nextInt).limit(5);
        numbers.forEach(System.out::println);

        System.out.println("-------------");
        //range
        numbers=LongStream.range(1,5);
        numbers.forEach(System.out::println);

        System.out.println("-------------");
        //rangeClosed
        numbers=LongStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);
    }
}
