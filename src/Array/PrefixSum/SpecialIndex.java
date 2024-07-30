package Array.PrefixSum;

// A = [2, 1, 6, 4]  -- 1
public class SpecialIndex {

    long[] getPrefixSumEven(int[] A) {
        int n = A.length;
        long prefixSum[] = new long[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                prefixSum[i] = A[i] + prefixSum[i - 1];
            } else {
                prefixSum[i] = prefixSum[i - 1];
            }
        }
        return prefixSum;
    }

    long[] getPrefixSumOdd(int[] A) {
        int n = A.length;
        long prefixSum[] = new long[n];
        prefixSum[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                prefixSum[i] = prefixSum[i - 1];
            } else {
                prefixSum[i] = prefixSum[i - 1] + A[i];
            }
        }
        return prefixSum;
    }

    public int solve(int[] A) {
        int count = 0;
        long prefixSumEven[] = getPrefixSumEven(A);
        long prefixSumOdd[] = getPrefixSumOdd(A);
        int n = A.length;
        if(n==1){
            return 1;
        }

        for (int i = 0; i < n; i++) {
            if(i==0){
                if (prefixSumEven[n-1] - prefixSumEven[0] == prefixSumOdd[n-1]){
                    count++;
                }
            }
            else if (prefixSumEven[i - 1] + prefixSumOdd[n - 1] - prefixSumOdd[i] ==
                    prefixSumOdd[i - 1] + prefixSumEven[n - 1] - prefixSumEven[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,7,1,2,3};

        SpecialIndex obj = new SpecialIndex();
        System.out.println(obj.solve(A));
    }
}
