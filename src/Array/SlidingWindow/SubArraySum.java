package Array.SlidingWindow;

/*
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise

A = [4, 3, 2, 6, 1]
B = 3
C = 11

Output:
1
 */
public class SubArraySum {

    public int solve(int[] A, int B, int C) {

        if(A.length<B){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum+=A[i];
        }
        if (sum==C){
            return 1;
        }
        for (int i = 1; i < A.length-B; i++) {
            sum = sum+A[i+B-1]-A[i-1];
            if (sum==C){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6, 1};
        SubArraySum obj = new SubArraySum();
        long ans = obj.solve(arr,3,11);
        System.out.println(ans);
    }
}
