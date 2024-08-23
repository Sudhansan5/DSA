package Bitmanipulation;

/*
Given two binary strings A and B. Return their sum (also a binary string).

Input 1:
A = "100"
B = "11"

Output:
"111"
 */
public class AddBinary {

    public static void main(String[] args) {
        String A = "110";
        String B = "10";
        AddBinary obj = new AddBinary();
        System.out.println(obj.addBinary(A, B));
    }

    public String addBinary(String A, String B) {
        StringBuilder str1 = new StringBuilder(A);
        str1.reverse();
        StringBuilder str2 = new StringBuilder(B);
        str2.reverse();
        char carry = '0';
        char val = '0';
        StringBuilder ans = new StringBuilder();
        int l = Math.max(str1.length(), str2.length());
        for (int i = 0; i < l; i++) {
            char val1 = '0';
            char val2 = '0';
            if (str1.length() >= i + 1) {
                val1 = str1.charAt(i);
            }
            if (str2.length() >= i + 1) {
                val2 = str2.charAt(i);
            }
            if (val1 == '0' && val2 == '1' || (val2 == '0' && val1 == '1')) {
                if (carry == '1') {
                    val = '0';
                    carry = '1';
                } else {
                    val = '1';
                    carry = '0';
                }
            } else if (val1 == '0' && val2 == '0') {
                if (carry == '1') {
                    val = '1';
                    carry = '0';
                } else {
                    val = '0';
                    carry = '0';
                }
            } else {
                if (carry == '1') {
                    val = '1';
                } else {
                    val = '0';
                }
                carry = '1';
            }
            ans.append(val);
        }
        if (carry == '1') {
            ans.append(carry);
        }
        ans.reverse();
        return ans.toString();
    }
}
