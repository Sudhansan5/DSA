package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array A of size N denoting collection of numbers ,
return all possible permutations.
 */
public class Permutations {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void main(String[] args){
        Permutations obj = new Permutations();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(obj.permute(A));
    }
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        boolean[] used = new boolean[A.size()];
        ArrayList<Integer> currAns = new ArrayList<>();
        return null;
    }
}
