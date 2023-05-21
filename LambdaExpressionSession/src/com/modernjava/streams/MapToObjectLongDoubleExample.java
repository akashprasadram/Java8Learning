package com.modernjava.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.*;

public class MapToObjectLongDoubleExample {
    public static void main(String[] args) {
        List<RandomIds> randomIds= IntStream.rangeClosed(0,5)
                .mapToObj((i)->{
                    return new RandomIds(i, ThreadLocalRandom.current().nextInt(50,100));
                }).collect(Collectors.toList());
        randomIds.forEach(System.out::println);
        System.out.println("----------------");
        LongStream longStream= IntStream.rangeClosed(0,5)
                .mapToLong((i)->(long)i);
        longStream.forEach(System.out::println);
        System.out.println("----------------");
        DoubleStream doubleStream= LongStream.rangeClosed(0,5)
                .mapToDouble((i)->(double)i);
        doubleStream.forEach(System.out::println);
    }
}
class RandomIds{
    int id;
    int RandomNumbers;

    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        RandomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", RandomNumbers=" + RandomNumbers +
                '}';
    }
}
