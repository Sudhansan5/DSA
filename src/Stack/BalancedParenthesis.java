package Stack;

import java.util.Stack;

/*
Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.

A = {([])}
Output: 1
 */
public class BalancedParenthesis {
    public int solve(String A) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '{' || A.charAt(i) == '(' || A.charAt(i) == '['){
                stack.push(A.charAt(i));
            }
            else {
                if (stack.empty()){
                    return 0;
                }
                else{
                    char ch = A.charAt(i);
                    char top = stack.peek();
                    if (ch=='}' && top == '{' || ch==')' && top == '(' || ch==']' && top == '['){
                        stack.pop();
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
        if (stack.empty()){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        BalancedParenthesis obj = new BalancedParenthesis();
        String A = "{([])}";
        System.out.println(obj.solve(A));
    }
}
