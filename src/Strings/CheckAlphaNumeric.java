package Strings;
/*
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
 Output: 1
 */
public class CheckAlphaNumeric {
    public int solve(char[] A) {
        for (char ch: A ) {
            if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                continue;
            }
            else {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        CheckAlphaNumeric obj = new CheckAlphaNumeric();
        char[] str = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(obj.solve(str));
    }
}
