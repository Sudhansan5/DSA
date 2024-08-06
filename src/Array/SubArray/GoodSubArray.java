package Array.SubArray;

/*
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of
the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

A = [1, 2, 3, 4, 5]
B = 4

Output 6
 */
public class GoodSubArray {

    public int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum+=A[j];
                if((j-i+1)%2==0 && sum<B){
                    count++;
                }
                else if((j-i+1)%2!=0 && sum>B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        GoodSubArray obj = new GoodSubArray();
        long ans = obj.solve(arr,4);
        System.out.println(ans);
    }
}
