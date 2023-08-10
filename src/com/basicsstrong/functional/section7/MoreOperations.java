package com.basicsstrong.functional.section7;

import java.util.Optional;

public class MoreOperations {
    public static void main(String[] args) {

        //ifPresent
        Optional<String> optional = Optional.of("Value");
        optional.ifPresent(val -> System.out.println("This is a " + val));

        //ifPresentOrElse
        Optional.empty().ifPresentOrElse(System.out:: println, () -> System.out.println("Value is Absent"));
    }
}
