package com.soma.functional.section15;

public class ListDemo {
    public static void main(String[] args) {
        ListFun<Integer> list = ListFun.list(3, 6, 9);
        list.forEach(System.out::println);
    }
}
