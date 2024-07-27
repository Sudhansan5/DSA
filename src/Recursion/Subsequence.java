package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    List<List<Integer>> list = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,1,2));
    void printSubsequence(ArrayList<Integer> subsequences, int index){
        if (index>=arr.size()){
            list.add(new ArrayList<>(subsequences));
            return;
        }
        subsequences.add(arr.get(index));
        printSubsequence(subsequences,index+1);  // take
        subsequences.remove(subsequences.size()-1);
        printSubsequence(subsequences,index+1);  // not take
    }

    public static void main(String[] args) {
        Subsequence obj = new Subsequence();
        ArrayList<Integer> subsequences = new ArrayList<>();
        obj.printSubsequence(subsequences,0);
        System.out.println(obj.list);
    }
}
