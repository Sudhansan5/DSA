package Array.SubArray;

/*
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements)
so that the sum of contiguous elements is maximum.
But the sum must not exceed B.

A = 5
B = 12
C = [2, 1, 3, 4, 5]

Output:
12
 */

public class MaximumSubArray {

    public long maxSubArray(int[] arr,int A, int B) {
        // carryForward technique
        long maxVal = 0;
        for (int i = 0; i < A; i++) {
            long subarraySum = 0;
            for (int j = i; j < A; j++) {
                subarraySum += arr[j];
                if(subarraySum<=B && subarraySum>maxVal){
                    maxVal = subarraySum;
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {8,7};
        MaximumSubArray obj = new MaximumSubArray();
        long ans = obj.maxSubArray(arr,2,4);
        System.out.println(ans);
    }
}
