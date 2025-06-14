package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamQuestions {
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
    System.out.println(nonNull);
  }
}
