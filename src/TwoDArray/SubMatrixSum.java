package TwoDArray;
/*
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
 */
public class SubMatrixSum {
    public int solve(int[][] A) {
        int ans = 0;
        int n = A.length;
        int m = A[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int lr = (i+1) * (j+1);
                int br = (m-j) * (n-i);
                ans += A[i][j] * (lr*br);
            }
        }
        return ans;
    }
}
