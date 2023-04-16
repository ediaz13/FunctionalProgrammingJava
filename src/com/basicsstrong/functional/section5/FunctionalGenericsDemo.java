package com.basicsstrong.functional.section5;

public class FunctionalGenericsDemo {
    public static void main(String[] args) {
        JavaGenerics <String, String> fun = s -> s.substring(1, 5);
        System.out.println(fun.execute("HelloWorld"));

        JavaGenerics <String, Integer> fun1 = s -> s.length();
        System.out.println(fun1.execute("HelloWorld"));
    }
}
