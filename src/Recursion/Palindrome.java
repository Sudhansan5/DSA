package Recursion;

public class Palindrome {
    boolean checkPalindrome(String str,int i,int j){
        if (i>=j){
            return true;
        }
        if(str.charAt(i)==str.charAt(j)){
            return checkPalindrome(str,i+1,j-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        String str = "sudhhdus";
        System.out.println( obj.checkPalindrome(str,0,str.length()-1));
    }
}
