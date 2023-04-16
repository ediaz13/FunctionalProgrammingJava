package com.basicsstrong.functional.section4;

public class LambdaPractice3 {
    public static void main(String[] args) {
        LengthOfString len = (str ) -> str.length();
        int length = len.length("10, 20");
        System.out.println(length);
    }
}
