package Array.SubArray;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayInRange {

    public static void main(String[] args) {
        SubArrayInRange obj = new SubArrayInRange();
        System.out.println(
                obj.solve(new ArrayList<>(Arrays.asList(
                        36, 63, 63, 26, 87, 28, 77, 93, 7)),
                        0,
                        6));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = B; i <= C; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}
