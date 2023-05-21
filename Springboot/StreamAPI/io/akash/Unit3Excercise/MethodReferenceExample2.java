package StreamAPI.io.akash.Unit3Excercise;

import StreamAPI.io.akash.Unit2Excercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Akash","Ram",22),
                new Person("Mahavir","Ojha",27),
                new Person("Shiba","Dash",23),
                new Person("Bikash","Mahanta",23),
                new Person("Hari","Mahanta",23)
        );
        //Step-1: sort list by last name
        Collections.sort(people, (p1, p2)->p1.getLastName().compareTo(p2.getLastName()));

        //Step-2: Create a method that prints all the elements in the list
        performConditionally(people,p->true, System.out::println); //p -> method(p)
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
