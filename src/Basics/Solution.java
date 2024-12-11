package Basics;

import java.math.BigDecimal;
import java.util.Arrays;

public class Solution {

    public int maxp3(int[] A) {

        Arrays.sort(A);
        int length = A.length;
        int min1 = A[0];
        int min2 = A[1];
        int max1 = A[length - 1];
        int max2 = A[length - 2];
        int max3 = A[length - 3];

        int maxOf2 = Math.max(min1 * min2, max1 * max2);
        if (min1 * min2 > max1 * max2) {
            if (max3 < 0) {
                return max1 * max2 * max3;
            } else {
                return min1 * min2 * max1;
            }
        } else {
            if (max3 < 0)
                return min1 * min2 * A[2];
            else {
                return max1 * max2 * max3;
            }
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {-87, -73,72,86,96};
        System.out.println(solution.maxp3(arr));
        BigDecimal hour =BigDecimal.ZERO;
        BigDecimal minute = BigDecimal.TEN;
       //System.out.println(minute.divide(hour));
    }
}


// A : [ 0, -1, 3, 100, -70, -50 ]  -- 350000

// A : [ -1, -2, -3, -4, -5 ]  -- -6

// A: [-10,-6,5,9,20]   --- 1200
