package com.soma.functional.section15;

public class ListDemo {
    public static void main(String[] args) {
        ListFun<Integer> list = ListFun.list(3, 6, 9);
        list.forEach(System.out::println);

        System.out.println("xxx");

        ListFun<Integer> integerListFun = list.addEle(56);
        integerListFun.forEach(System.out::println);

        System.out.println("xxx");

        ListFun<Integer> removeEle = integerListFun.removeEle(9);
        System.out.println();
        removeEle.forEach(System.out::println);
    }
}
