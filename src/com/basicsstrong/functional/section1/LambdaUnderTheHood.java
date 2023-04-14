package com.basicsstrong.functional.section1;

public class LambdaUnderTheHood {
    public static void main(String[] args) {

        MyFunInterface fun1 = () -> System.out.println("Implementation 1");

        MyFunInterface fun2 = new MyFunInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementation 2");
            }
        };



        MyFunInterface fun = () -> System.out.println("Im Light Weight");



    }
}
