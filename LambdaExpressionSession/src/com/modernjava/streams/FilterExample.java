package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;
import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample
{
    public static void main(String[] args) {
        //returning instructor sorted by their name and have more than 10 years of experience
        List<Instructor> list= Instructors.getAll().stream().filter(i->i.getYearsOfExperience()>10)
                .sorted(Comparator.comparing(Instructor::getName)).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
