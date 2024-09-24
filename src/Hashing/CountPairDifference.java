package Hashing;

import java.util.HashMap;

/*
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.
 */
public class CountPairDifference {
    public int solve(int[] B, int A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                map.put(B[i],map.get(B[i])+1);
            }
            else{
                map.put(B[i],1);
            }
        }
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i]-A)){
                count+= map.get(B[i]-A);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountPairDifference obj = new CountPairDifference();
        int[] B = {2,1,2,1,2,1,2,1,2};
        System.out.println(obj.solve(B,1));
    }
}
