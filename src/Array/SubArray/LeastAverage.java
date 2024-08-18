package Array.SubArray;

/*
Given an array A of size N, find the subarray of size B with the least average.
A = [3, 7, 90, 20, 10, 50, 40]
B = 3

Output:
3

 */
public class LeastAverage {

    public static void main(String[] args) {
        int A[] = {20,3,13,5,10,14,8,5,11,9,1,11};
        LeastAverage obj = new LeastAverage();
        System.out.println(obj.solve(A, 9));
    }

    public int solve(int[] A, int B) {
        double ans = 0;
        int ansIndex = 0;
        double sum = 0;
        for (int i = 0; i < B; i++) {
            sum+=A[i];
        }

        ans = sum/B;
        double avg;
        for (int i = 1; i < A.length-B+1; i++) {
            sum= sum+A[i+B-1]-A[i-1];
            avg = sum/B;
            if(avg<ans){
                ans = avg;
                ansIndex = i;
            }
        }
        return ansIndex;
    }
}
