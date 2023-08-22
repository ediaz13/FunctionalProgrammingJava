package com.soma.functional.section8;

public class TailCallOptimisation {
    public static void main(String[] args) {
        reFact(2);
    }

    private static long reFact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n*reFact(n - 1);
        }
    }

    private static long tailReFact(int n, int a) {
        if (n <= 1) {
            return a;
        } else {
            return tailReFact(n -1, n*a);
        }

    }



}
