package DP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FractionalKnapsack {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();
    A.add(60);
    A.add(100);
    A.add(120);
    B.add(10);
    B.add(20);
    B.add(30);
    int C = 50;
    FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();
    int result = fractionalKnapsack.solve(A, B, C);
    System.out.println(result);
  }

  public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
      List<Item> items = new ArrayList<>();
      for (int i = 0; i < A.size(); i++) {
        items.add(new Item(A.get(i), B.get(i)));
      }
      items =
              items.stream()
                      .sorted(Comparator.comparing(Item::getCapacity).reversed())
                      .collect(Collectors.toList());

      double ans = 0;
      int i = 0;
      while (C > 0 && i < items.size()) {
        if (items.get(i).getWeight() <= C) {
          ans += items.get(i).getValue();
          C -= items.get(i).getWeight();
          i++;
        } else {
          Item item = items.get(i);
          double fraction = item.getCapacity() * C;
          ans += fraction;
          break;
        }
//      System.out.println(ans+" "+ C);
      }
      return (int) Math.floor(ans * 100 + 1e-9);
    }

}
