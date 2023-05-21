package com.modernjava.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int result=numbers.stream()
                //0+1=1     //10+5=15   //36+9=45
                //1+2=3     //15+6=21
                //3+3=6     //21+7=28
                //6+4=10    //28+8=36
                .reduce(0,(a,b)->a+b);
        System.out.println(result);

        int result1=numbers.stream()
                //1*1=1
                //1*2=3
                //3*3=6
                .reduce(1,(a,b)->a*b);
        System.out.println(result1);

        int result3=numbers.stream()
                //0*1=0
                //0*2=0
                //0*3=0
                .reduce(0,(a,b)->a*b);
        System.out.println(result3);

        System.out.println("------------------");
        Optional result2=numbers.stream()
                //1*1=1
                //1*2=3
                //3*3=6
                .reduce((a,b)->a+b);
        if(result2.isPresent())
            System.out.println(result2.get());
    }
}
