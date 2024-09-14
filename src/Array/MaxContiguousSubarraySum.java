package Array;

/*
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
 */
public class MaxContiguousSubarraySum {
    public int maxSubArray(final int[] A) {
        int sum = A[0];
        int ans = sum;
        for (int i = 1; i < A.length; i++) {
            if (sum+A[i]<=0){
                ans = Math.max(ans,A[i]);
                sum=0;
            }
            else {
                sum+=A[i];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MaxContiguousSubarraySum obj = new MaxContiguousSubarraySum();
        int[] A = {97,0,-461,39,-25,-398,72,-350,-31,-85,-247,-319,-462,-303,-48,-354,-110,17,60,19,80,-218,-28,-426,-366,-140,50};
        System.out.println(obj.maxSubArray(A));
    }
}
