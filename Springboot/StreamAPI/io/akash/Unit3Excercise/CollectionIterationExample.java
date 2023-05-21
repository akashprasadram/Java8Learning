package StreamAPI.io.akash.Unit3Excercise;

import StreamAPI.io.akash.Unit2Excercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Akash","Ram",22),
                new Person("Mahavir","Ojha",27),
                new Person("Shiba","Dash",23),
                new Person("Bikash","Mahanta",23),
                new Person("Hari","Mahanta",23)
        );
        System.out.println("\nUsing for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }
        System.out.println("\nUsing for each loop");
        for(Person p:people){
            System.out.println(p);
        }
        System.out.println("\nUsing Lambda for each loop");
        people.forEach(System.out::println);// System.out::println === p->System.out.println(p)
    }
}
