package Array.SubArray;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {2,9,5}; // 16 + 11+ 16 + 14 - 57
        SubArraySum obj = new SubArraySum();
        long ans = obj.subArraySum(arr);
        System.out.println(ans);
    }
//
//    public long subArraySum(int[] A) {
//        // carryForward technique
//        long sum = 0;
//        int n = A.length;
//        for (int i = 0; i < n; i++) {
//            long subarraySum = 0;
//            for (int j = i; j < n; j++) {
//                subarraySum += A[j];
//                sum+=subarraySum;
//            }
//        }
//        return sum;
//    }

    public long subArraySum(int[] A) {
        // carryForward technique
        long sum = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
           sum+= (long) A[i] *(i+1)*(n-i);
        }
        return sum;
    }
}

