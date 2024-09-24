package Hashing;

/*
Given an array A of N integers.
Find the count of the subarrays in the array which sums to zero.
Since the answer can be very large, return the remainder on dividing the result with 10^9+7
 A = [1, -1, -2, 2]
 Output: 3
 */
public class SubArrayZeroSum {
    public static void main(String[] args) {
        SubArrayZeroSum obj = new SubArrayZeroSum();
        int[] A = {1, -1, -2, 2};
        System.out.println(obj.solve(A));
    }

    public int solve(int[] A) {
        return 0;
    }
}
