package com.soma.functional.section9;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Flooring floor = FlooringFactory.getFlooring(-1, 65);
        floor.installation();
    }
}
