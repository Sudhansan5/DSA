package Sorting;
/*
An integer is given to you in the form of an array, with each element being a separate digit.

Find the smallest number (leading zeroes are allowed) that can be formed by rearranging the
digits of the given number in an array. Return the smallest number in the form an array.
A = [6, 3, 4, 2, 7, 2, 1]
output: [1, 2, 2, 3, 4, 6, 7]
 */
public class SmallestNumber {
    public int[] smallestNumber(int[] A) {
        int[] freq = new int[10];
        for (int val : A) {
            freq[val]++;
        }
        int[] ans = new int[A.length];
        int index=0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i]!=0){
                ans[index] = i;
                index++;
                freq[i]--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SmallestNumber num = new SmallestNumber();
        int[] A = {6, 3, 4, 2, 7, 2, 1};
        int[] ans = num.smallestNumber(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
