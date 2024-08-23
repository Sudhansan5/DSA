package Array.SubArray;

/*
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.

 A = [1, 11, 2, 3, 15]
 B = 10

 Output: 4
 */
public class CountSubArray {

    public int solve(int[] A, int B) {
        int count =0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum+=A[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int A[] = {1,11,2,3,15};
        CountSubArray obj = new CountSubArray();
        System.out.println(obj.solve(A,10));
    }
}
