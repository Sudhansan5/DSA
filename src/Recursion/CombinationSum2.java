package Recursion;

import java.util.*;

public class CombinationSum2 {
    List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int candidates[] = {2,5,2,1,2};
        int target = 5;
        CombinationSum2 obj = new CombinationSum2();
        Arrays.sort(candidates);
        System.out.println(obj.combinationSum(candidates, target));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arr = new ArrayList<>();
        getCombination(0, target, candidates, arr);
        return ans;
    }

    void getCombination(int index, int remSum, int[] candidates, List<Integer> arr) {

        if (remSum == 0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if (candidates[i]>remSum){
                return;
            }
            arr.add(candidates[i]);
            getCombination(i+1, remSum - candidates[i], candidates, arr);
            arr.remove(arr.size() - 1);
        }
    }
}
