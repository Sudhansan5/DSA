package Array;

public class ContinuousSumQuery {
    public int[] solve(int A, int[][] B) {
        int arr[] = new int[A];
        for (int i = 0; i < B.length; i++) {
            arr[B[i][0]-1] += B[i][2];
            if(B[i][1]-1!=A-1){
                arr[B[i][1]] += -B[i][2];
            }
        }
        int pSum[] = new int[A];
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                pSum[i] = arr[i];
            }
            else {
                pSum[i] = arr[i]+pSum[i-1];
            }
        }
        return pSum;

    }
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        ContinuousSumQuery obj = new ContinuousSumQuery();
        int ans[] = obj.solve(A,B);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
