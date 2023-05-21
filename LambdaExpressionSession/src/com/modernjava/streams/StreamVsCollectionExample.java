package com.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println("-------------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("-------------");
        System.out.println(names);

        System.out.println("-------------");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("-------------");
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("-------------");
        Stream<String> namesStream=names.stream();
        namesStream.forEach(System.out::println);

        System.out.println("-------------");
        // namesStream.forEach(System.out::println); //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        System.out.println("-------------");
        List<String>  list2=names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println(list2);

    }
}
