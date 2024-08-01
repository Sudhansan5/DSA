package Array.SubArray;

import java.util.ArrayList;
import java.util.Arrays;

public class AllSubArrays {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> subArray = new ArrayList<>();
                for (int k = i; k <=j; k++) {
                    subArray.add(A.get(k));
                }
                ans.add(subArray);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        AllSubArrays obj = new AllSubArrays();
        ArrayList<ArrayList<Integer>> arr = obj.solve(new ArrayList<Integer>(Arrays.asList(36,63,63,26,87,28,77,93,7)));
        for (ArrayList<Integer> a:
             arr) {
            System.out.println(a);
        }
    }
}






