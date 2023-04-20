package com.basicsstrong.functional.section5;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> new String("A String");

        System.out.println(stringSupplier.get());

        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
    }
}
