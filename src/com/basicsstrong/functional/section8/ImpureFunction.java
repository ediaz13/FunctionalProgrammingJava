package com.basicsstrong.functional.section8;

public class ImpureFunction {

    private int value = 0;

    public int add (int nextValue) {
        this.value += nextValue;
        return this.value;

    }
}
