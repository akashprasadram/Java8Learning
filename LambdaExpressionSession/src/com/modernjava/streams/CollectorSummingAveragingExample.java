package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        //sum of years of experience
        int sum= Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);
        
        //calculate avg of years of experience of all instructor
        double average= Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("average = " + average);
    }
}
