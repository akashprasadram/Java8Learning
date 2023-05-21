package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors=Instructors.getAll();

        //Looping through all the instructor and printing out the values of instructor
        Consumer<Instructor> c1= s1 -> System.out.println(s1);
        instructors.forEach(c1);

        //Looping throgh all the instructor and printing out their names
        System.out.println("-------------------");
        Consumer<Instructor> c2= s1 -> System.out.println(s1.getName());
        instructors.forEach(c2);

        //Looping throgh all the instructor and printing out their names and there coursees
        System.out.println("-------------------");
        Consumer<Instructor> c3= s1 -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        //Loop through all the instructor and print out there name if their year of experience is greater than 10
        System.out.println("-------------------");
        instructors.forEach(instructor -> {
            if(instructor.yearsOfExperience>10){
                c1.accept(instructor);
            }
        });

        //Loop through all the instructor and print out there name if their year of experience is greater than 5 and teaches online
        System.out.println("-------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience>5 && s1.isOnlineCourses()){
                c1.andThen(c2).accept(s1);
            }
        });
    }
}
