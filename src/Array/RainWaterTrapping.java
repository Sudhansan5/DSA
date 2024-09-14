package Array;

public class RainWaterTrapping {
    public int trap(final int[] A) {
        int n = A.length;
        int[] lSum = new int[n];
        int[] rSum = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i==0){
                lSum[i] = A[i];
            }
            else {
                lSum[i] = Math.max(lSum[i-1],A[i]);
            }
        }
        for (int i = n-1; i >=0 ; i--) {
            if (i==n-1){
                rSum[i] = A[i];
            }
            else {
                rSum[i] = Math.max(rSum[i+1],A[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            ans+=Math.min(lSum[i],rSum[i]) - A[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        RainWaterTrapping obj = new RainWaterTrapping();
        int[] A = {0, 1, 0, 2};
        System.out.println(obj.trap(A));
    }
}
