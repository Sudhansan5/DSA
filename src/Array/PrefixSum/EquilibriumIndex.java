package Array.PrefixSum;

/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes
is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes,
then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

A = [-7, 1, 5, 2, -4, 3, 0] ---- 3
 */
public class EquilibriumIndex {

    long[] getPrefixSum(int[] A) {
        int n = A.length;
        long prefixSum[] = new long[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }
        return prefixSum;
    }
        public int solve(int[] A) {
            long [] prefixSum = getPrefixSum(A);
            int n = A.length;
            for (int i = 0; i < n; i++) {
                if (i==0){
                    if (prefixSum[n-1] == prefixSum[0]){
                        return 0;
                    }
                }
                else {
                    if (prefixSum[i-1] == prefixSum[n-1]-prefixSum[i]){
                        return i;
                    }
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};

        EquilibriumIndex obj = new EquilibriumIndex();
        System.out.println(obj.solve(A));

    }
}
