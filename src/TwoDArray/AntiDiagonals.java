package TwoDArray;

/*
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

1 2 3
4 5 6
7 8 9

Output:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
 */

public class AntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int ans[][] = new int[(n*2)-1][n];
        for (int col = 0; col < n; col++) {
            int i=0; int j = col;
            while (i< n && j>=0 ){
                ans[col][i] = A[i][j];
                i++;
                j--;
            }
        }
        for (int row = 1; row < n; row++) {
            int i=row; int j = n-1;
            while (i< n && j>=0 ){
                ans[n+row-1][n-1-j] = A[i][j];
                i++;
                j--;;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        AntiDiagonals obj = new AntiDiagonals();
        int ans[][] = obj.diagonal(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
