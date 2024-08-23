package Strings;

/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input: ABEC
Output: 6
 */
public class AmazingSubArrays {
    public static void main(String[] args) {
        AmazingSubArrays obj = new AmazingSubArrays();
        String A = "aaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(obj.solve(A));
    }

    public int solve(String A) {
        int ans = 0;
        A = A.toUpperCase();
        int n = A.length();
        for (int i = 0; i < n; i++) {
            char temp = A.charAt(i);
            if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
                ans += n - i;
            }
        }
        return ans%10003;
    }
}
