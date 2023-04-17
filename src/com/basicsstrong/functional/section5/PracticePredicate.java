package com.basicsstrong.functional.section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Basic");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicStrong");

        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);

        Predicate<String> filter = s -> s.contains("Strong");
        List<String> filteredList = filterList(list, filter);

        List<Integer> integerList = List.of(1, 4, 5, 7, 8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        List<Integer> evens = filterList(integerList, integerFilter);

        System.out.println(newList);
        System.out.println(filteredList);
        System.out.println(evens);

    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T string:list){
            if (predicate.test(string)) {
                newList.add(string);
            }
        }
        return newList;
    }
}
