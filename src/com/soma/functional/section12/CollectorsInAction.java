package com.soma.functional.section12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Cursos\\Java\\Functional Programming\\Mine\\FunctionalProgrammingJava\\src\\com\\soma\\functional\\section12\\EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)){
            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));
            Spliterator<String> wordSpliterator = words.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);

            List<Employee> employeeList = employeeStream.collect(Collectors.toList());
            //employeeStream.forEach(System.out::println);

            List<String> employeeNames = employeeList.stream()
                            .map(employee -> employee.getName())
                            .collect(Collectors.toList());

            employeeNames.forEach(System.out::println);
            Set<String> designations = employeeList.stream()
                    .map(e -> e.getDesignation())
                    .collect(Collectors.toSet());

            designations.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
