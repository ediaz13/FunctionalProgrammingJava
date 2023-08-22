package com.soma.functional.section8;

public class JavaClousure {
    public static void main(String[] args) {

        int val = 111;

        Task lambda = () -> {
            //val = 113;
            System.out.println(val);
            System.out.println("Task Completed!");
        };

        lambda.doTask();
        printValue(lambda);
    }

    private static void printValue(Task lambda) {
        lambda.doTask();
    }
}
