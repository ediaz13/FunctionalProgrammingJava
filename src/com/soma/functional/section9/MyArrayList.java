package com.soma.functional.section9;

import com.soma.functional.section8.Consumer;

import java.util.Objects;

public class MyArrayList {
    Object[] elements = new Objects[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> action) {
        for (int i = 0; i < elements.length; i++) {
            action.accept(elements[i]);
        }
    }


}
