package com.soma.functional.section5;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        //BiFunction<String, String, String> biFunction = (a, b) -> a + b;
        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();

        System.out.println(biFunction.apply("Basics","Bitches"));

    }
}
