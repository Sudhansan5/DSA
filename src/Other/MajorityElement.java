package Other;
/*
Given an array of size N, find the majority element. The majority element is the element that appears
more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.
Input: [2, 1, 2]
Output: 2
 */
public class MajorityElement {
    public int majorityElement(final int[] A) {
        int candidate = A[0];
        int count =0;
        for (int i = 0; i < A.length; i++) {
            if (count == 0 ){
                candidate = A[i];
            }
            if (A[i]==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] A = {2,1,2};
        System.out.println(obj.majorityElement(A));
    }
}
