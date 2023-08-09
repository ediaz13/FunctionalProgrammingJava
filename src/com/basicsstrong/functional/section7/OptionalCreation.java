package com.basicsstrong.functional.section7;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String val = "A String";
        Optional<String> optional = Optional.of(val);

        //Empty
        Optional<Integer> empty = Optional.empty();

        //Nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);
    }
}
