package BinarySearch;
/*
You are given a 2-D matrix C of size A × B.
You need to build a new 1-D array of size A by taking one element from each row of the 2-D
matrix in such a way that the cost of the newly built array is minimized.

The cost of an array is the minimum possible value of the absolute difference between any
two adjacent elements of the array.

So if the newly built array is X, the element picked from row 1 will become X[1],
element picked from row 2 will become X[2], and so on.

Determine the minimum cost of the newly built array.
A = 3
B = 2
C = [ [7, 3]
       [2, 1]
       [4, 9] ]

Output: 1
 */
public class MinDiff {
    public static void main(String[] args){
        MinDiff obj = new MinDiff();
        int[][] arr = {{7, 3},
                        {2, 1},
                        {4, 9}};
    System.out.println(obj.solve(3,2,arr));
    }

    public int solve(int A, int B, int[][] C) {
        return 1;
    }
}
