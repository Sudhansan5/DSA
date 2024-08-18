package Strings;

/*
Given a string A, you are asked to reverse the string and return the reversed string.
 */
public class SimpleString {

    public static void main(String[] args) {
        SimpleString obj = new SimpleString();
        System.out.println(obj.solve("Hello"));
    }

    public String solve(String A) {
        StringBuilder str = new StringBuilder(A);
        str.reverse();
        return str.toString();
    }
}
