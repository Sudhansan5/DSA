package Strings;

/*
given a character string A having length N, consisting of only lowercase and uppercase latin letters.
Toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.

 A = "Hello"
 Output: "hELLO"
 */
public class ToggleCase {

    public static void main(String[] args) {
        ToggleCase obj = new ToggleCase();
        System.out.println(obj.solve("Hello"));
    }

    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch>='A' && ch<='Z'){
                ch+=32;
            }
            else {
                ch-=32;
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}
