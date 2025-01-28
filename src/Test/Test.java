package Test;

public class Test {
public static void main(String[] args){
    String s1 = "CheckString";
    String s2 = new String("CheckString");
    String s3 = s2.concat("Now");
    String s4 = "CheckStringNow";
    String s5 = new String("CheckStringNow");




    System.out.println(s1 == s2);  // false
    System.out.println(s3 == s4);  // false
    System.out.println(s4 == s5);  // false
    System.out.println(s3 == s5);  //false
}
}
