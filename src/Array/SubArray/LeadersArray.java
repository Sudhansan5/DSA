package Array.SubArray;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersArray {

    public static void main(String[] args) {

        LeadersArray obj = new LeadersArray();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));      // [17, 2, 5]
        System.out.println(obj.solve(arr));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i > -1; i--) {
            if (i == n - 1) {
                max = A.get(i);
                ans.add(max);
            } else if (A.get(i) > max) {
                max = A.get(i);
                ans.add(max);
            }
        }
        return ans;
    }
}
