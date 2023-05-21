package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//This is helpful for downstream operation of another collector
public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> nameList= Instructors.getAll().stream()
                .map(Instructor::getName).collect(Collectors.toList());
        nameList.forEach(System.out::println);
        System.out.println("----------------------");

        //mapping
        nameList= Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        nameList.forEach(System.out::println);
        System.out.println("----------------------");

        //Instructors by their years of experience
        Map<Integer,List<String>> mapYearsOfExperienceAndNames= Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience
                        ,Collectors.mapping(Instructor::getName,Collectors.toList())));
        mapYearsOfExperienceAndNames.forEach((key,value)->{
            System.out.println("key= "+key+"  value="+value);
        });

    }
}
