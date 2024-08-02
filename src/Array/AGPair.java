package Array;

public class AGPair {

        public Long solve(String A) {
            long count = 0;
            long aCount = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i)=='A'){
                    aCount+=1;
                }
                else if (A.charAt(i)=='G'){
                    count+=aCount;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        AGPair obj = new AGPair();
        String A = "ABCGAG";
        System.out.println(obj.solve(A));
    }

}
