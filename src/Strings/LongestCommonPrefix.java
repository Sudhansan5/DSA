package Strings;

/*
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL
the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is
the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]

Output: "a"
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] A = {"abab", "ab", "abcd"};
        System.out.println(obj.longestCommonPrefix(A));
    }

    public String longestCommonPrefix(String[] A) {
        int l = Integer.MAX_VALUE;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            if (A[i].length() < l) {
                l = A[i].length();
            }
        }
        boolean found = false;
        for (int i = 0; i < l; i++) {
            char temp = A[0].charAt(i);
            found = true;
            for (int j = 0; j < A.length; j++) {
                if (A[j].charAt(i) != temp) {
                    found = false;
                    break;
                }
            }
            if (found) {
                ans.append(temp);
            } else {
                break;
            }
        }
        return ans.toString();
    }
}
