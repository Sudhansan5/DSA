package TwoDArray;

/*
You are given a n x n 2D matrix A representing an image.
Rotate the matrix by 90 degrees (clockwise).

 [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]

 Output:
  [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]
 */

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix obj = new RotateMatrix();
        int ans[][] = obj.solve(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void transpose(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int temp = A[j][i];
                A[j][i] = A[i][j];
                A[i][j] = temp;
            }
        }
    }

    public void reverseRow(int[][] A) {
        int temp;
        for (int i = 0; i < A.length; i++) {
            int j = 0, n = A.length - 1;
            while (j < n) {
                temp = A[i][j];
                A[i][j] = A[i][n];
                A[i][n] = temp;
                j++;
                n--;
            }
        }
    }

    public int[][] solve(int[][] A) {
        transpose(A);
        reverseRow(A);
        return A;
    }
}
