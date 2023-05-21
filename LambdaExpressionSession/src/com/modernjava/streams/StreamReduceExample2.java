package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has highest years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .reduce((s1, s2) -> {
                    if (s1.getYearsOfExperience() > s2.getYearsOfExperience())
                        return s1;
                    else
                        return s2;
                });
        if(instructor.isPresent())
            System.out.println(instructor.get());

        Optional<Instructor> instructor1 = Instructors.getAll().stream()
                .reduce((s1, s2) -> s2.getYearsOfExperience()>s1.getYearsOfExperience()?s2:s1);
        if(instructor1.isPresent())
            System.out.println(instructor1.get());
    }
}
