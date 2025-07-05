package Streams;

import java.math.MathContext;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {
  class Employee{
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
      this.name = name;
      this.department = department;
      this.salary = salary;
    }
  }
  List<Employee> getEmployeeList() {
    Employee emp1 = new Employee("Sudhanshu", "ECE", 2400);
    Employee emp2 = new Employee("Saket", "ECE", 3000);
    Employee emp3 = new Employee("Niket", "CSE", 1500);
    Employee emp4 = new Employee("Raju", "IT", 1000);
    Employee emp5 = new Employee("Mukesh", "CSE", 1000);

    return List.of(emp1, emp2, emp3, emp4, emp5);
  }

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
    // 1. Print the square of each number.
    //    numbers.stream().map(a->a*a).forEach(System.out::println);

    // 2. Print every even number.
    //    numbers.stream().filter(a -> a % 2 == 0).forEach(System.out::println);

    // 3. Return a list of the squares of each number.
    List<Integer> evenNum = numbers.stream().map(a -> a * a).collect(Collectors.toList());
    //    System.out.println(evenNum);

    // 4. For a list of strings, return a list of the length of each string.

    List<Integer> strLen = names.stream().map(String::length).collect(Collectors.toList());
    //    System.out.println(strLen);

    // 5. For a list of strings, filter out the strings which do not start with the letter T
    // and then uppercase the remaining strings and then sort them.
    //    names.stream()
    //        .filter(s -> !s.startsWith("T"))
    //        .map(String::toUpperCase).sorted()
    //        .forEach(System.out::println);

    // 6. find the sum of all the numbers.
    Optional<Integer> ans = numbers.stream().reduce(Integer::sum);
    //    System.out.println(ans.get());

    // 7. find the sum of the squares of all the numbers.
    numbers.stream().map(a -> a * a).reduce(Integer::sum);

    // 8. find the sum of the squares of all the even numbers.
    numbers.stream().filter(a -> a % 2 == 0).map(num -> num * num).reduce(Integer::sum);

    //  9. find the maximum number in the list.
    numbers.stream().reduce(Integer::max);

    // 10.Given a list of numbers with duplicates, find the distinct numbers in the list.
    List<Integer> allNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
    //    allNumbers.stream().distinct().forEach(System.out::println);

    // 11.find the average of all the numbers.

    List<Double> numbers1 = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
    Double average = numbers1.stream().reduce(0.0, Double::sum) / numbers1.size();
    //    System.out.println(average);

    // 12.Given a list of strings, find the average length of all the strings.

    Double avg = names.stream().mapToInt(String::length).average().getAsDouble();
    //    System.out.println(avg);

    // 13.Given a list of strings, find the first string that is longer than 10 characters.
    Optional<String> name = names.stream().filter(a->a.length()>10).findFirst();
//    System.out.println(name.get());

    // 14.Remove null values from a list using streams
      List<String> val = Arrays.asList("abc","cde",null);
      List<String> nonNull = val.stream().filter(Objects::nonNull).collect(Collectors.toList());
//    System.out.println(nonNull);

    // 15. Problem Statement: GROUP BY Department and Find Max Salary
    // You have been tasked with analyzing a dataset of employee information to determine the
    // maximum salary in each department. The dataset consists of a list of Employee objects, where
    // each employee has a name, department, and salary. You need to group the employees by their
    // respective departments and identify the maximum salary within each department.
    StreamQuestions obj = new StreamQuestions();
    List<Employee> empList = obj.getEmployeeList();

    // 16. merge and sort two arrays
    List<Integer> arr1 = Arrays.asList(2,3,1,10,9);
    List<Integer> arr2 = Arrays.asList(4,5,6,1,0);
//    Stream.concat(arr1.stream(), arr2.stream()).sorted().forEach(System.out::println);

    // 17. Given a string, check if it is a palindrome.
//    String name = "sudhanshu";

  }

}
