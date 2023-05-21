package com.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs list<Instructors> and second is predicate which will filter if instructor has online courses and  retuen map of <String and Integer> String is name and Integer is years of experience
        Predicate<Instructor> p1=i->i.isOnlineCourses();
        BiFunction<List<Instructor>,Predicate<Instructor>, Map<String,Integer>> mapBiFunction=
                ((instructors, instructorPredicate) -> {
                    Map<String,Integer> map=new HashMap<>();
                    instructors.forEach(instructor -> {
                        if(instructorPredicate.test(instructor))
                            map.put(instructor.getName(),instructor.getYearsOfExperience());
                    });
                    return map;
                });
        System.out.println(mapBiFunction.apply(Instructors.getAll(),p1));
    }
}
