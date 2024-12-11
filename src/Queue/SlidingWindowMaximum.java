package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
You are given an array A of N numbers. You are also given a number B,
representing the size of the window. You are required to find the maximum element in every window of size B.

Return an array C, where C[i] is the maximum element in the subarray of size B
A = [1, 3, -1, -3, 5, 3, 6, 7]
B = 3
Output: [3, 3, 5, 5, 6, 7]
 */
public class SlidingWindowMaximum {
    public static void main(String[] args){
        int[] A = {10,9,8,7,6,5,4,3,2,1};
        int B = 2;
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int[] ans = obj.slidingMaximum(A, B);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    System.out.println();
    }

    public int[] slidingMaximum(int[] A, int B) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[A.length-B+1];
        int ansIndex = 0;
        for(int i = 0; i < B; i++) {
            while (!deque.isEmpty() && A[deque.getLast()]<=A[i]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        ans[ansIndex] = A[deque.getFirst()];
        ansIndex++;
        for(int i = B; i < A.length; i++) {
            while (!deque.isEmpty() && A[deque.getLast()]<=A[i]){
                deque.removeLast();
            }
            deque.addLast(i);
            if (deque.getFirst()<i-B+1){
                deque.removeFirst();
            }
            ans[ansIndex] = A[deque.getFirst()];
            ansIndex++;
        }
        return ans;
    }
}
