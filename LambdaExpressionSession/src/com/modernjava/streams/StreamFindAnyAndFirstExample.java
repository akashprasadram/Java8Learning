package com.modernjava.streams;

import com.modernjava.functionalprogramming.Instructor;
import com.modernjava.functionalprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional= Instructors.getAll().stream()
                .findAny();
        if (instructorOptional.isPresent()) {
            System.out.println(instructorOptional.get());
        }

        instructorOptional= Instructors.getAll().stream()
                .findFirst();
        if (instructorOptional.isPresent()) {
            System.out.println(instructorOptional.get());
        }

        instructorOptional= Instructors.getAll().parallelStream()
                .findAny();
        if (instructorOptional.isPresent()) {
            System.out.println(instructorOptional.get());
        }
    }
}
