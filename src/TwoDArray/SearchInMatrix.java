package TwoDArray;

public class SearchInMatrix {
    public static void main(String[] args) {
        SearchInMatrix obj = new SearchInMatrix();
        int A[][] = {{2, 3, 4, 5},
                {2, 3, 6, 7}};
        int B = 6;
        System.out.println(obj.solve(A, B));
    }

    public int solve(int[][] A, int B) {
        int n = A.length;
        int j = A[0].length-1;
        int i = 0;
        int ans = Integer.MAX_VALUE;
        boolean found = false;
        while (i < n && j >= 0) {
            if (A[i][j] == B) {
                found = true;
                ans = Math.min(ans, (i + 1) * 1009 + j + 1);
                j--;
            } else if (A[i][j] < B) {
                i++;
            } else {
                j--;
            }
        }
        if (!found)
            return -1;
        else return ans;
    }
}
