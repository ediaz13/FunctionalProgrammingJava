package com.soma.functional.section5;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a, b) -> a + "." + b;

        System.out.println(binaryOperator.apply("Basic", "Bitches"));
    }
}
