package TwoDArray;

import java.nio.charset.MalformedInputException;

public class MaxOnes {
    public static void main(String[] args) {
        MaxOnes obj = new MaxOnes();
        int A[][] = {{0, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 1}};
        System.out.println(obj.solve(A));
    }

    public int solve(int[][] A) {
        int row = 0 ;
        int i = 0;
        int j = A[0].length-1;
        while (i<A.length && j>=0){
            if(A[i][j]==1){
                row = i;
                j--;
            }
            else{
                i++;
            }
        }
        return row;
    }
}
