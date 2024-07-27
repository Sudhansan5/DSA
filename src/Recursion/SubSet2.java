package Recursion;

import java.util.*;

public class SubSet2 {
    Set<List<Integer>> arraySet = new HashSet<>();

    public static void main(String[] args) {
        int nums[] = {4,4,4,1,4};
        SubSet2 obj = new SubSet2();

        System.out.println(obj.subsetsWithDup(nums));
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        getSubSetSum(0, nums, arr);
        List<List<Integer>> ans = new ArrayList<>(arraySet);
        return ans;
    }

    void getSubSetSum(int index, int nums[], List<Integer> arr) {

        if (index >= nums.length) {
            arraySet.add(new ArrayList<>(arr));
            return;
        }

        // pick
        arr.add(nums[index]);
        getSubSetSum(index + 1, nums, arr);
        arr.remove(arr.size() - 1);

        // not pick
        getSubSetSum(index + 1, nums, arr);
    }

}
