package Array.SubArray;

public class MinMax {

    public int solve(int[] A) {
        int minIndex = -1;
        int maxIndex = -1;
        int min = A[0];
        int max = A[0];
        int ans = A.length;
        for (int j : A) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i]== min){
                if(maxIndex!=-1){
                    ans = Math.min(Math.abs(maxIndex - i)+1,ans);
                }
               minIndex = i;
            }
            if (A[i] == max){
                if (minIndex!=-1){
                    ans = Math.min(Math.abs(i-minIndex)+1,ans);
                }
                maxIndex = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {343,291,963,165,152};
        MinMax obj = new MinMax();
        int ans = obj.solve(arr);
        System.out.println(ans);
    }
}
