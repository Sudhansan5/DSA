package Array.PrefixSum;

/*
You have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share
of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

A = [1, 4, 5, 2, 4]

4
*/
public class BuyAndSell {
public int maxProfit(final int[] A) {

    int diff = 0;
    int n = A.length;
    if (n==0){
        return 0;
    }
    int minArr[] = new int[n];
    minArr[0] = A[0];
    for (int i = 1; i < n; i++) {
        minArr[i] = Math.min(A[i],minArr[i-1]);
    }
    for (int i = 0; i < n; i++) {
        diff = Math.max(A[i]-minArr[i],diff);
    }
    return diff;
}
public static void main(String[] args) {
    int A[] = {1,4,5,2,4};
    BuyAndSell obj = new BuyAndSell();
    System.out.println(obj.maxProfit(A));
    }
}
