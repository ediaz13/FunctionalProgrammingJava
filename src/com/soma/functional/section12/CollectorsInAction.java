package com.soma.functional.section12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
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

            /*
            List<String> employeeNames = employeeList.stream()
                            .map(employee -> employee.getName())
                            .collect(Collectors.toList());
             */
            List<String> employeeNames = employeeList.stream()
                            .map(Employee::getName)
                            .collect(Collectors.toList());

            employeeNames.forEach(System.out::println);
            System.out.println("-----X-----LIST-----X-----");

            /*Set<String> designations = employeeList.stream()
                    .map(e -> e.getDesignation())
                    .collect(Collectors.toSet());

             */

            Set<String> designations = employeeList.stream()
                    .map(Employee::getDesignation)
                    .collect(Collectors.toSet());


            designations.forEach(System.out::println);
            System.out.println("-----X-----SET-----X-----");

            /*
            TreeSet<Employee> employeeSorted = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet :: new));

             */

            TreeSet<Employee> employeeSorted = new TreeSet<>(employeeList);

            employeeSorted.forEach(System.out::println);
            System.out.println("-----X-----Collection(TreeSet)-----X-----");

            /*
                        Map<Integer, String> getNameById = employeeList.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
             */

            Map<Integer, String> getNameById = employeeList.stream()
                    .collect(Collectors.toMap(Employee::getId, Employee::getName));

            System.out.println(getNameById);

            Map<Boolean, List<Employee>> partitionedData = employeeList.stream()
                    .collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));

            System.out.println(partitionedData);

            List<Employee> maleEmployees = partitionedData.get(true);
            List<Employee> femaleEmployees = partitionedData.get(false);

            Map<String, List<Employee>> getByDesignation = employeeList.stream()
                    .collect(Collectors.groupingBy(e -> e.getDesignation()));

            System.out.println(getByDesignation);

            String employeesNameString = employeeList.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.joining(", "));

            System.out.println(employeesNameString);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
