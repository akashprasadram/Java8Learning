package com.modernjava.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class VariableScope {
    static int k1=0;
    public static void main(String[] args) {
        int a=10; //local variable
       // IntConsumer intConsumer=(a)-> System.out.println(a*10); // You can't have the localhaviable inside lambda expression as method local
        IntConsumer intConsumer=(b)-> System.out.println(b*10);
        int k=0;
        List<Instructor> instructors=Instructors.getAll();
        instructors.forEach(instructor -> {
          //  System.out.println(instructor+" "+ (k++)); //You can't modify the k variable as by default it will be final
            System.out.println(instructor+" "+ k);
        });
        // k=20; //Even after you modify the k value it will give error as it been made final

        IntConsumer intConsumer1=(k1)-> System.out.println(k1*10); //you can give lambda local variable name same as class level/static variable name
        instructors.forEach(instructor -> {
            System.out.println(instructor+" "+ (k1++)); //You can modify the k1 class leve/static variable
            System.out.println(instructor+" "+ k1);
        });
        k1=20; //Even after you using the k1 value in lambda expression you can modify it


    }
}
