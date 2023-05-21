package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);
        //max using stream max function
        Optional result=numbers.stream().max(Integer::compareTo);
        if(result.isPresent())
            System.out.println(result.get());

        //reduce function
        // This will not work if our list consist of negtive number at that time it will give 0 as output even if 0 is not present in the list
        /*int result2 =numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(result2);*/

        //reduce function
        //Using Optional
        Optional result3=numbers.stream().reduce((a,b)->a>b?a:b);
        if(result3.isPresent())
            System.out.println(result3.get());

        Optional result4=numbers.stream().reduce(Integer::max);
        if(result4.isPresent())
            System.out.println(result4.get());
    }
}
