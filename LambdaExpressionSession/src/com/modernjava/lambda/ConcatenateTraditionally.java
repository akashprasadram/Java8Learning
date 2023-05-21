package com.modernjava.lambda;

public class ConcatenateTraditionally implements ConcatenateInterface{
    @Override
    public String sconcat(String s1, String s2) {
        return s1+" "+s2;
    }

    public static void main(String[] args) {
        ConcatenateTraditionally concatenateTraditionally = new ConcatenateTraditionally();
        System.out.println(concatenateTraditionally.sconcat("Akash","Ram"));
    }
}
