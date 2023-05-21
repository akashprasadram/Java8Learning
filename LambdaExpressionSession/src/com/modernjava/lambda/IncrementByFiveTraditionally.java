package com.modernjava.lambda;

public class IncrementByFiveTraditionally implements IncrementByFiveInterface{
    @Override
    public int incrementByFive(int a) {
        return a+5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditionally incrementByFiveTraditionally = new IncrementByFiveTraditionally();
        System.out.println(incrementByFiveTraditionally.incrementByFive(2));

    }
}
