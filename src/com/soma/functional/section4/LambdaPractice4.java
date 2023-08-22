package com.soma.functional.section4;

public class LambdaPractice4 {
    public static void main(String[] args) {

        LengthOfString len = str -> {

        int l = str.length();
        System.out.println("The lenght of given string is: " + l);
        return  l;
    };

        int length = len.length("10, 20");
        System.out.println(length);


    }
}
