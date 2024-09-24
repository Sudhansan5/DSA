package Hashing;

import java.util.HashSet;

/*
length of the longest substring that contains no repeating characters

 A = "abcabcbb"
 Output: 3
 */
public class LongestSubStringNonRepeating {
    public int lengthOfLongestSubstring(String A) {
        int maxLength = 0;
        int j=0;
        char currentChar;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            currentChar = A.charAt(i);
            if(set.contains(currentChar)){
                while (A.charAt(j)!=currentChar){
                    set.remove(A.charAt(j));
                    j++;
                }
                set.remove(A.charAt(j));
                j++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, i-j+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubStringNonRepeating obj = new LongestSubStringNonRepeating();
        String A = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(A));
    }
}
