package Bitmanipulation;

public class AddBinary {

    public String addBinary(String A, String B) {
        StringBuilder str1 = new StringBuilder(A);
        str1.reverse();
        StringBuilder str2 = new StringBuilder(B);
        str2.reverse();
        int carry = 0;

      return null;
    }

    public static void main(String[] args) {
        String A = "100";
        String B = "11";
        AddBinary obj = new AddBinary();
        System.out.println(obj.addBinary(A,B));
    }
}
