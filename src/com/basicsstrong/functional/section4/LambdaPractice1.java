package com.basicsstrong.functional.section4;

public class LambdaPractice1 {
    public static void main(String[] args) {
        Name name = () -> System.out.println("Mogul");
        name.myName();
    }
}
