package com.soma.functional.section7;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String > optional = Optional.of("Value");
        //Optional<String > optional = Optional.empty();

        //map()

        //Optional<String> map = optional.map(val -> "Replaced!");
        //System.out.println(map.get());

        String orElse = optional.map(val -> "Replaced!").orElse("Empty");
        System.out.println(orElse);

        //filter()
        Optional<String> filter = optional.filter(val -> !val.equalsIgnoreCase("Replaced By Filter!"));
        System.out.println(filter.get());

        //flatMap
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced By FlatMap"));
        System.out.println(flatMap.get());

    }
}
