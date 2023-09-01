package com.soma.functional.section11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Cursos\\Java\\Functional Programming\\Mine\\FunctionalProgrammingJava\\src\\com\\soma\\functional\\section11\\Books.txt");
        try(Stream<String> lines = Files.lines(path)){

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> spliterator= new BookSpliterator(baseSpliterator);

            Stream<Book> stream = StreamSupport.stream(spliterator, false);

            stream.forEach(System.out::println);

        }catch(IOException e) {
            System.out.println(e);
        }

    }
}
