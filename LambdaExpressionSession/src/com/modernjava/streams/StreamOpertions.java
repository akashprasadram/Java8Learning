package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOpertions {
    public static void main(String[] args) {
        //Count distinct
        Long count= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);

        //distinct
        List<String> courses= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courses);

        //anymath , allmatch and nonematch
        boolean match= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s->s.startsWith("J"));
        System.out.println(match);
        boolean match1= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(s->s.startsWith("J"));
        System.out.println(match1);

        boolean match2= Instructors.getAll().stream().map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s->s.startsWith("J"));
        System.out.println(match2);
    }
}
