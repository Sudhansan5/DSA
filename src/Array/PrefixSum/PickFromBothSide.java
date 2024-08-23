package Array.PrefixSum;

/*
You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost
or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

A = [5, -2, 3 , 1, 2]
B = 3

Output:
8
 */
public class PickFromBothSide {
    public static void main(String[] args) {
        int A[] = {5, -2, 3, 1, 2};
        PickFromBothSide obj = new PickFromBothSide();
        System.out.println(obj.solve(A, 3));
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int pSum = 0;
        int sSum = 0;
        for (int i = 0; i < n; i++) {
            prefix[i] = pSum += A[i];
            suffix[n - i - 1] = sSum += A[n - 1 - i];
        }
        sum = Math.max(prefix[B - 1], suffix[n - 1 - B + 1]);
        for (int i = 0; i < B - 1; i++) {
            int val = prefix[i] + suffix[n - B + i + 1];
            if (val > sum) {
                sum = val;
            }
        }
        return sum;
    }
}
