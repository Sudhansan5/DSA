package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an integer A pairs of parentheses,
write a function to generate all combinations of well-formed parentheses of length 2*A.
 */
public class GenerateAllParentheses {
  private final ArrayList<String> ans = new ArrayList<>();

  public static void main(String[] args) {
    int A = 1;
    GenerateAllParentheses obj = new GenerateAllParentheses();
    System.out.println(Arrays.toString(obj.generateParenthesis(A)));
  }

  public String[] generateParenthesis(int A) {
    allParenthesis("", 0, 0, A);
    return ans.toArray(new String[0]);
  }

  public void allParenthesis(String str, int op, int cl, int n) {
    if (str.length() == 2 * n) {
      ans.add(str);
      return;
    }
    if (op < n) {
      allParenthesis(str + '(', op + 1, cl, n);
    }

    if (op > cl) {
      allParenthesis(str + ')', op, cl + 1, n);
    }
  }
}
