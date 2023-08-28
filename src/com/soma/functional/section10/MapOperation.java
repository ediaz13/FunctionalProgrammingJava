package com.soma.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {

        Stream.of(34,678,89,4,52,31,325,6)
                .map(e -> e * 25)
                .forEach(e -> System.out.println(e));


        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        books.stream()
                .filter((book)-> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book)-> book.getRating() > 3)
                .map(book -> book.getName())
                .forEach(System.out::println);

    }
}
