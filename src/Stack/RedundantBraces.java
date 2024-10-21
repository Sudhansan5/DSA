package Stack;

import java.util.Stack;

/*
Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.
Check whether A has redundant braces or not.
NOTE: A will be always a valid expression and will not contain any white spaces.
 A = "((a+b))"
 Output: 1
 */
public class RedundantBraces {
  public static void main(String[] args) {
    RedundantBraces obj = new RedundantBraces();
    System.out.println(obj.braces("((a+b))"));
  }

  public boolean braces(String s) {
    int op=0;
    boolean flag = false;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      op = 0;
      char item = s.charAt(i);
      if (item == ')') {
        while (!stack.isEmpty()) {
          char currVal = stack.peek();
          if (currVal == '+' || currVal == '-' || currVal == '*' || currVal == '/') {
            op++;
            stack.pop();
          } else if (stack.peek() == '('){
            stack.pop();
            if (op==0){
              return true;
            }
            break;
          }
        }
      }
      else if(item == '+' || item == '-' || item == '*' || item == '/' || item == '('){
        stack.push(item);
      }
      System.out.println(stack);
    }
    return flag;
  }
}
