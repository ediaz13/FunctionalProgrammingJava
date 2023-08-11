package com.basicsstrong.functional.section7;

import java.util.Optional;

public class MoreOperations {
    public static void main(String[] args) {

        //ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(val -> System.out.println("This is a " + val));

        //ifPresentOrElse
        Optional.empty().ifPresentOrElse(System.out:: println, () -> System.out.println("Value is Absent"));

        //stream
        optional.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println);

        //or
        //optional.or(() -> Optional.of("New Value!")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("New Value!")).ifPresent(System.out::println);

        //equals
        //optional
        //either both are empty
        //or if the values in optional are equal to each other via equals method

        System.out.println(optional.equals(Optional.of("Value")));

        //hashcode
        System.out.println(optional.hashCode());
    }
}
