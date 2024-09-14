package Bitmanipulation;
/*
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.
A = [1, 2, 3, 1, 2, 4]
Output: [3,4]
 */
public class SingleNumber3 {
    public int[] solve(int[] A) {
        int xor = 0;
        int index=0;
        int set1=0;
        int set2 =0;
        int ans[]=new int[2];
        for (int i = 0; i < A.length; i++) {
            xor = xor^A[i];
        }
        for (int i = 0; i < 31; i++) {
            if ((xor & (1<<i))!=0){
                index = i;
                break;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if ((A[i]&(1<<index))!=0){
                set1 = set1^A[i];
            }
            else {
                set2 = set2^A[i];
            }
        }
        ans[0] = Math.min(set1,set2);
        ans[1] = Math.max(set1,set2);
        return ans;
    }

    public static void main(String[] args) {
        SingleNumber3 obj = new SingleNumber3();
        int[] A = {1, 2, 3, 1, 2, 4};
        int[] ans = obj.solve(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
