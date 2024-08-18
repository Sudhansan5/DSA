package Strings;

public class ReverseString {
/*
You are given a string A of size N.
Return the string A after reversing the string word by word.

NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the
input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

A = "the sky is blue"
Output:
"blue is sky the"
 */

    void reverseString(String[] str){
        int n = str.length-1;
        int i=0;
        String temp;
        while (i<n){
            temp = str[i];
            str[i] = str[n];
            str[n]=temp;
            i++;
            n--;
        }
    }
    public String solve(String A) {
        String[] reverse = A.split(" ");
        reverseString(reverse);
        String ans = String.join(" ",reverse);
        return ans.trim();
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.solve("the sky is blue"));
    }
}
