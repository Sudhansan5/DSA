package Bitmanipulation;

import java.util.*;

/*
Given an array of integers, every element appears thrice except for one, which occurs once.
Find that element that does not appear thrice.
 A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 Output : 4
 */
public class SingleNumber2 {
    public int singleNumber(final int[] A) {
        int num = 0;
        int set;
        for (int i = 0; i < 31; i++) {
             set = 0;
            for (int j = 0; j < A.length; j++) {
                if((A[j] & (1<<i)) !=0 ){
                   set+=1;
                }
            }
            if (set%3!=0){
                num+=(1<<i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        SingleNumber2 obj = new SingleNumber2();
        int A[] = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.singleNumber(A));
    }
}
