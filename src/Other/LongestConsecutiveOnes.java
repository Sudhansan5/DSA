package Other;

/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
Find and return the length of the longest consecutive 1’s that can be achieved.

Input 1:
    A = "111000"
Output 1:
    3

 */
public class LongestConsecutiveOnes {
    public int solve(String A) {
        int totalOnes = 0;
        int ans = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)=='1'){
                totalOnes++;
            }
        }
        if (totalOnes == A.length()){
            return totalOnes;
        }
        else if (totalOnes==0){
            return 0;
        }
        for (int i = 0; i < A.length(); i++) {
            int l=0;
            for (int j = i-1; j >=0 ; j--) {
                if (A.charAt(j)=='1'){
                    l++;
                }
                else {
                    break;
                }
            }
            int r=0;
            for (int j = i+1; j < A.length() ; j++) {
                if (A.charAt(j)=='1'){
                    r++;
                }
                else {
                    break;
                }
            }
            if (l+r == totalOnes){
                ans = totalOnes;;
            }
            else {
                ans = Math.max(ans,l+r+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LongestConsecutiveOnes obj = new LongestConsecutiveOnes();
        String A = "111000";
        System.out.println(obj.solve(A));
    }
}
