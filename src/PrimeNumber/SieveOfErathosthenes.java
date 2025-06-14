package PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfErathosthenes {
  /*
  Given an integer A. Find the list of all prime numbers in the range [1, A].
   */

  public static void main(String[] args) {
    SieveOfErathosthenes obj = new SieveOfErathosthenes();
    int[] ans = obj.solve(50);
    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }
  }

  public int[] solve(int A) {
    boolean[] isPrime = new boolean[A + 1];
    Arrays.fill(isPrime, true);
    int j;
    for(int i = 2; i <= A; i++) {
        j = i*i;
        while (j<=A){
            isPrime[j] = false;
            j = j+i;
        }
    }
      ArrayList<Integer> list = new ArrayList<>();
       for(int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]){
                list.add(i);
       }

    }
       int[] ans = list.stream().mapToInt(i->i).toArray();

    return ans;
  }
}
