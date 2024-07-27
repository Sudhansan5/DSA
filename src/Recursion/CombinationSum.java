package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int candidates[] = {2, 3, 6, 7};
        int target = 7;
        CombinationSum obj = new CombinationSum();
        System.out.println(obj.combinationSum(candidates, target));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arr = new ArrayList<>();
        getCombination(0, target, candidates, arr);
        return ans;
    }

    void getCombination(int index, int remSum, int[] candidates, List<Integer> arr) {
        if (index >= candidates.length) {
            return;
        }
        if (remSum < 0) {
            return;
        }
        if (remSum == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        //pick
        if (candidates[index]<=remSum) {
            arr.add(candidates[index]);
            getCombination(index, remSum - candidates[index], candidates, arr);
            arr.remove(arr.size() - 1);
        }
        // not pick
        getCombination(index + 1, remSum, candidates, arr);
    }
}
