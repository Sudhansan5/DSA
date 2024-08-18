package Strings;

/*
@author Sudhanshu
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A) Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).

Input 1:
A = "aaaabaaa"

Output: aaabaaa

 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
        System.out.println(obj.longestPalindrome("abacdfgdcaba"));
    }

    int getPalindromeSize(String A, int start, int end) {
        int count = 1;
        int n = A.length();
        if (start != end) {
            if (A.charAt(start) == A.charAt(end)) {
                count++;
            } else {
                return 1;
            }
        }
        start--;
        end++;
        while (start >= 0 && end < n) {
            if (A.charAt(start) == A.charAt(end)) {
                count += 2;
            } else {
                break;
            }
            start--;
            end++;
        }
        return count;
    }

    public int longestPalindromeSize(String A) {
        int windowSize = 0;
        for (int i = 0; i < A.length(); i++) {
            windowSize = Math.max(getPalindromeSize(A, i, i), windowSize);
        }
        for (int i = 0; i < A.length() - 1; i++) {
            windowSize = Math.max(getPalindromeSize(A, i, i + 1), windowSize);
        }
        return windowSize;
    }

    public String longestPalindrome(String A) {
        int windowSize = longestPalindromeSize(A);
        int i = 0;
        int n = A.length();
        while (i <= n - windowSize) {
            String subArray = A.substring(i, i + windowSize);
            if (longestPalindromeSize(subArray) == windowSize) {
                return subArray;
            }
            i++;
        }
        return null;
    }
}
