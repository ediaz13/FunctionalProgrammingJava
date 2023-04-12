package com.basicsstrong.functional.section1;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        /**
        MyFunInterface fun = () -> System.out.println("Hello");
        fun.myMethod();
        */

        onTheFly(() -> System.out.println("Hello World!"));

    }

    public static void onTheFly(MyFunInterface fun) {
        fun.myMethod();
    }


}
