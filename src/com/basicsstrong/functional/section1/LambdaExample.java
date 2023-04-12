package com.basicsstrong.functional.section1;

public class LambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread!!");
            }
        });
        thread.start();
    }
}
