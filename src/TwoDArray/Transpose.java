package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a 2D integer array A, return the transpose of A.

The transpose of a matrix is the matrix flipped over its main diagonal,
switching the matrix's row and column indices.

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

Output: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 */

public class Transpose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < A.get(0).size(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(A.get(j).get(i));
            }
            ans.add(row);
        }
        return ans;
    }
//    public int[][] solve(int[][] A) {
//        for (int i = 0; i < A.length; i++) {
//
//            for (int j = i+1; j < A.length; j++) {
//                int temp = A[j][i];
//                A[j][i] = A[i][j];
//                A[i][j] = temp;
//            }
//        }
//        return A;
//    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,2)));
        arr.add(new ArrayList<>(Arrays.asList(4,5)));
        arr.add(new ArrayList<>(Arrays.asList(6,7)));
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Transpose obj = new Transpose();
        output = obj.solve(arr);
        for (ArrayList a:output) {
            System.out.println(a);
        }
        }
}
