package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample3 {
    public static void main(String[] args) {
        //grouping by length of String and also checking that the names contains e
        //and only return those names which has e in it
        List<String> name=List.of("Sid","Mike","Jenny","Gene","Rajeev");
        LinkedHashMap<Integer,List<String>> result=name.stream()
                .collect(Collectors.groupingBy(String::length, LinkedHashMap::new,
                        Collectors.filtering(s->s.contains("e"),
                                Collectors.toList())));
        System.out.println("result = " + result);

        //instructor grouping them by Senior(>10) and junior(<10) and filter them by online courses
        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"
                        ,LinkedHashMap::new
                        ,Collectors.filtering(Instructor::isOnlineCourses, Collectors.toList())
                ));
        instructorByExpAndOnline.forEach((key,value)->{
            System.out.println("Key= "+key+" value= "+value);
        });

    }
}
