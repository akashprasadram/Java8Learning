package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //vount the number of instructors who teaches online courses
        //stream.count
        long count= Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .count();
        System.out.println("count = " + count);
        //Collectors.counting()
        count=Instructors.getAll().stream().filter(Instructor::isOnlineCourses).collect(Collectors.counting());
        System.out.println("count = " + count);
    }
}
