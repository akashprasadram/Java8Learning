package StreamAPI.io.akash.Unit1Excercise;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Akash","Ram",22),
                new Person("Mahavir","Ojha",27),
                new Person("Shiba","Dash",23),
                new Person("Bikash","Mahanta",23),
                new Person("Hari","Mahanta",23)
        );

        //Step-1: sort list by last name
        Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));

        //Step-2: Create a method that prints all the elements in the list
        printConditionally(people,p->true);

        //Step-3: Create a method that prints all the people that have last name beginning with M

        System.out.println("\nPeople that have last name beginning with M using printConditionally() Method");
        printConditionally(people,p->p.getLastName().startsWith("M"));
        System.out.println("\nPeople that have first name beginning with M using printConditionally() Method");
        printConditionally(people,p->p.getFirstName().startsWith("M"));


    }
    /*private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }*/
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}