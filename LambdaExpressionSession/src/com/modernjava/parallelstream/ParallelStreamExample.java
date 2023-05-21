package com.modernjava.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sum Sequential: "+sumSequentialStream());
        System.out.println("Sum parallel: "+sumParallelStream());
    }
    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0,5000).sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,5000).parallel().sum();
    }
}
