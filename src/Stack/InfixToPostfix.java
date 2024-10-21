package Stack;

import java.util.Stack;

/*
Given string A denoting an infix expression. Convert the infix expression into a postfix expression.
String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English
alphabets are operands and ^, /, *, +, - are operators.
Find and return the postfix expression of A.

NOTE:
^ has the highest precedence.
/ and * have equal precedence but greater than + and -.
+ and - have equal precedence and lowest precedence among given operators.

 A = "a+b*(c^d-e)^(f+g*h)-i"
 Output:  "abcd^e-fgh*+^*+i-"
 */
public class InfixToPostfix {
  public static void main(String[] args) {
    InfixToPostfix obj = new InfixToPostfix();
    String A = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(obj.solve(A));
  }

  public String solve(String A) {
    Stack<Character> stack = new Stack<>();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < A.length(); i++) {
      char curr = A.charAt(i);
      if (curr == '^'
          || curr == '/'
          || curr == '*'
          || curr == '+'
          || curr == '-'
          || curr == '('
          || curr == ')') {
        if (precedence(curr) == -1) {
          if (curr == '(') {
            stack.push(curr);
          } else {
            while (!stack.isEmpty() && stack.peek() != '(') {
              str.append(stack.pop());
            }
            stack.pop();
          }
        }
        else if (!stack.empty() && precedence(curr) <= precedence(stack.peek())) {
          while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(curr)) {
            str.append(stack.pop());
          }
          stack.push(curr);
        }
        else {
            stack.push(curr);
        }
      } else {
        str.append(curr);
      }
    }
    while (!stack.isEmpty()){
        str.append(stack.pop());
    }
    return str.toString();
  }

  public int precedence(char ch) {
    if (ch == '^') {
      return 3;
    } else if (ch == '/' || ch == '*') {
      return 2;
    } else if (ch == '+' || ch == '-') {
      return 1;
    } else {
      return -1;
    }
  }
}
