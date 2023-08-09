package com.basicsstrong.functional.section6;

import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args) {
        //Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable, Thread> threadGenerator = Thread :: new;

        Runnable task1 = () -> System.out.println("Task 1 Executed!");
        Runnable task2 = () -> System.out.println("Task 2 Executed!");

        Thread thread1 = threadGenerator.apply(task1);
        Thread thread2 = threadGenerator.apply(task2);

        thread2.start();
        thread1.start();

        threadGenerator.apply(() -> System.out.println("Task 3 executed!")).start();
    }
}
