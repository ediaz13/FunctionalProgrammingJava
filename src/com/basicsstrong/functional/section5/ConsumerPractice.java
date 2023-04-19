package com.basicsstrong.functional.section5;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 45);

        Consumer<Integer> consumer = e -> System.out.println(e);

        consumer.accept(56);

        printElements (list, consumer);
    }

    //Comentario.
    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t: list ) {
            consumer.accept(t);
        }
    }
}
