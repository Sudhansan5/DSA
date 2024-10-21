package Stack;

import java.util.Stack;

/*
An arithmetic expression is given by a string array A of size N.
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each string may be an integer or an operator.
Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.
A =   ["2", "1", "+", "3", "*"]
Output: 9
 */
public class PostFix {
    public int evalRPN(String[] A) {
        Stack<Integer> stack = new Stack<>();
        int ele1;
        int ele2;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals("+")) {
                ele2 = stack.pop();
                ele1 = stack.pop();
                stack.push(ele1 + ele2);
            } else if (A[i].equals("-")) {
                ele2 = stack.pop();
                ele1 = stack.pop();
                stack.push(ele1 - ele2);
            } else if (A[i].equals("*")) {
                ele2 = stack.pop();
                ele1 = stack.pop();
                stack.push(ele1 * ele2);
            } else {
                stack.push(Integer.parseInt(A[i]));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        PostFix obj = new PostFix();
        String[] A = {"2", "1", "+", "3", "*"};
        System.out.println(obj.evalRPN(A));

    }
}
