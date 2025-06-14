package Test;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    // string - name sudhanshu
    // output -- map, character, integer
    // if 1 time ignore, if more add in map
    List<Character> name = List.of('s', 'u', 'd', 'h', 'a', 'n', 's', 'h', 'u');
    Map<Character, Long> frequencyMap =
        name.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

      // Remove entries with frequency 1
      Map<Character, Long> filteredMap = frequencyMap.entrySet().stream()
              .filter(entry -> entry.getValue() > 1)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

      System.out.println(filteredMap);
  }
}
