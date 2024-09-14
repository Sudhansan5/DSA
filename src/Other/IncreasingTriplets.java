package Other;
/*
You are given an array A of N elements.
Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]

A = [1, 2, 4, 3]
Output: 2
 */
public class IncreasingTriplets {
    public int solve(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int l = 0;
            int r = 0;
            for (int j = i-1; j >=0 ; j--) {
                if (A[j]<A[i]){
                    l++;
                }
            }
            for (int j = i+1; j <A.length ; j++) {
                if (A[j]>A[i]){
                    r++;
                }
            }
            if (l!=0 && r!=0){
                count +=l*r;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        IncreasingTriplets obj = new IncreasingTriplets();
        int[] A = {2, 1, 2, 3};
        System.out.println(obj.solve(A));
    }
}
