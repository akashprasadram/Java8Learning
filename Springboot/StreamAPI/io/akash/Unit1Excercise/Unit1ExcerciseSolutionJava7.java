package StreamAPI.io.akash.Unit1Excercise;



import java.util.*;

public class Unit1ExcerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Akash","Ram",22),
                new Person("Mahavir","Ojha",27),
                new Person("Shiba","Dash",23),
                new Person("Bikash","Mahanta",23),
                new Person("Hari","Mahanta",23)
        );



        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(0);


        //Step-1: sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step-2: Create a method that prints all the elements in the list
        Iterator<Person> iterator=people.iterator();
        while(iterator.hasNext()){
            Person person1=iterator.next();
            System.out.println(person1);
        }
        System.out.println("\nprintAll()");
        printAll(people);

        //Step-3: Create a method that prints all the people that have last name beginning with M
        System.out.println("\nPeople that have last name beginning with M");
        printLastNameBeginningWithM(people);

        System.out.println("\nPeople that have last name beginning with M using printConditionally() Method");
        printConditionally(people,
                new Condition(){

                    @Override
                    public boolean test(Person p) {
                        return p.getLastName().startsWith("M");
                    }
                });
        System.out.println("\nPeople that have last name beginning with O using printConditionally() Method");
        printConditionally(people,
                new Condition(){

                    @Override
                    public boolean test(Person p) {
                        return p.getLastName().startsWith("O");
                    }
                });


    }

    private static void printLastNameBeginningWithM(List<Person> people) {
        for(Person p:people){
            if(p.getLastName().startsWith("M"))
                System.out.println(p);
        }
    }
    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p:people){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}