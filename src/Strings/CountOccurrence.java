package Strings;

public class CountOccurrence {
    /*
    Find the number of occurrences of bob in string A consisting of lowercase English alphabets.

     */
    public int solve(String A) {
       int count = 0;
        int k = 3;
        for (int i = 0; i < A.length()-k+1; i++) {
            String subArray = A.substring(i,i+k);
            if (subArray.equals("bob")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountOccurrence obj = new CountOccurrence();
        System.out.println(obj.solve("bobob"));
    }
}
