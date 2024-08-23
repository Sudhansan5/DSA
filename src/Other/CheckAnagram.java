package Other;

import java.util.Arrays;

/*
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams
to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging
the letters of B.


 */
public class CheckAnagram {
    public int solve(String A, String B) {
       char[] str1 = A.toCharArray();
        Arrays.sort(str1);
        String first = new String(str1);
        char[] str2 = B.toCharArray();
        Arrays.sort(str2);
        String second = new String(str2);
        if (first.equals(second)){
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) {
        CheckAnagram obj = new CheckAnagram();
        String A = "bgipsvukg";
        String B = "ylwfyulte";
        System.out.println(obj.solve(A,B));
    }
}
