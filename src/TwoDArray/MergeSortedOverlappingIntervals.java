package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedOverlappingIntervals {
    public static void main(String[] args) {
        MergeSortedOverlappingIntervals obj = new MergeSortedOverlappingIntervals();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 17)));
        list.add(new ArrayList<>(Arrays.asList(1, 32)));
        list.add(new ArrayList<>(Arrays.asList(3, 13)));
        list.add(new ArrayList<>(Arrays.asList(4, 100)));
        list.add(new ArrayList<>(Arrays.asList(5, 31)));
        ArrayList<ArrayList<Integer>> ans = obj.solve(list);
        for (ArrayList<Integer> arr : ans
        ) {
            System.out.println(arr);
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int startIndex = A.get(0).get(0);
        int endIndex = A.get(0).get(1);
        for (int i = 1; i < A.size(); i++) {
            int currStartIndex = A.get(i).get(0);
            int currEndIndex = A.get(i).get(1);
            if (currStartIndex > endIndex) {
                arr.add(new ArrayList<>(Arrays.asList(startIndex, endIndex)));
                startIndex = currStartIndex;
            }
            endIndex = Math.max(endIndex,currEndIndex);
        }
        arr.add(new ArrayList<>(Arrays.asList(startIndex, endIndex)));
        return arr;
    }
}
