package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result=Stream.of("E","F","G","H").collect(Collectors.joining());
        System.out.println(result);
        System.out.println("-----------------");
        result=Stream.of("E","F","G","H").collect(Collectors.joining(","));
        System.out.println(result);
        System.out.println("-----------------");
        result=Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
        System.out.println(result);

        //instructor names separated by , and prefix { and suffix }
        String namesConcatenated= Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.joining(",","{","}"));

        System.out.println("namesConcatenated = "+namesConcatenated);

    }
}
