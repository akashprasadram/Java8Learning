package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
        //min using stream min function
        Optional result=numbers.stream().min(Integer::compareTo);
        if(result.isPresent())
            System.out.println(result.get());

        //reduce function
        //This will not work if as it will return 0 even if there is no 0 in the positive integer list
        /*int result2 =numbers.stream().reduce(0,(a,b)->a<b?a:b);
        System.out.println(result2);*/

        //reduce function
        //Using optional
        Optional result3=numbers.stream().reduce((a,b)->a<b?a:b);
        if(result3.isPresent())
            System.out.println(result3.get());

        Optional result4=numbers.stream().reduce(Integer::min);
        if(result4.isPresent())
            System.out.println(result4.get());
    }
}
