package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSum {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3));
        SubSetSum obj = new SubSetSum();

        System.out.println(obj.subsetSums(list, list.size()));
    }

    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        getSubSetSum(0, 0, arr);
        return arrayList;
    }

    void getSubSetSum(int index, int sum, ArrayList<Integer> arr) {

        if (index >= arr.size()) {
            arrayList.add(sum);
            return;
        }
        // pick
        getSubSetSum(index + 1, sum + arr.get(index), arr);
        // not pick
        getSubSetSum(index + 1, sum, arr);
    }

}
