package StreamAPI.io.akash.Unit3Excercise;

import StreamAPI.io.akash.Unit2Excercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Akash","Ram",22),
                new Person("Mahavir","Ojha",27),
                new Person("Shiba","Dash",23),
                new Person("Bikash","Mahanta",23),
                new Person("Hari","Mahanta",23)
        );

        people.stream()
                .filter(p->p.getLastName().startsWith("M"))
                .forEach(System.out::println);

        long count = people.stream().filter(p -> p.getLastName().startsWith("M")).count();
        System.out.println(count);

        List<Person> result = people.stream().filter(p -> p.getLastName().startsWith("M")).collect(Collectors.toList());
        System.out.println(result);

        count = people.parallelStream().filter(p -> p.getLastName().startsWith("M")).count();
        System.out.println(count);
    }
}
