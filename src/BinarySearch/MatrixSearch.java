package BinarySearch;
/*
Matrix of integers A of size N x M and an integer B. Search for integer B in matrix A.
This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.
Input : A = [
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]
    ]
B = 3

Output: 1
 */
public class MatrixSearch {
    public static void main(String[] args){
        MatrixSearch obj = new MatrixSearch();
        int[][] arr = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
    };
        System.out.println(obj.searchMatrix(arr, 3));
    }

    public int searchMatrix(int[][] A, int B) {
        int present=0;
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                if (A[i][j] == B){
                    return 1;
                }
            }
        }
        return present;
    }
}
