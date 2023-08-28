package com.soma.functional.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        Stream<Book> stream = books.stream();

        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book : books) {
            if(book.getGenre().equalsIgnoreCase("Horror")  && book.getRating() > 3) {

                popularHorrorBooks.add(book);

            }
        }

        //after java 8

        List<Book> collect = books.parallelStream()
                .filter((book)-> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book)-> book.getRating() > 3)
                .collect(Collectors.toList());


    }
}
