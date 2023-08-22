package com.soma.functional.section1;

import com.soma.functional.section3.MyFunInterface;

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
