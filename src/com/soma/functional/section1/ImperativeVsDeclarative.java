package com.soma.functional.section1;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        //Imperative
        int sumOfEvents = 0;

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                sumOfEvents += i;
            }
        }

        System.out.println(sumOfEvents);


        //Declarative or Functional
        sumOfEvents = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0 )
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println(sumOfEvents);
    }
}
