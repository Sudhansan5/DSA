package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a set of distinct integers A,
return all possible subsets that can be formed from the elements of array A.
 */
public class Subsets {
  ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
  public static void main(String[] args) {
    Subsets obj = new Subsets();
    ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(9,10));
    System.out.println(A);
    ArrayList<ArrayList<Integer>> list = obj.subsets(A);
    System.out.println(list);
  }
  void generate(ArrayList<Integer> list, ArrayList<Integer> subsets,int index){
    if (index==list.size()){
      ans.add(new ArrayList<>(subsets));
      return;
    }
    subsets.add(list.get(index));
    generate(list,subsets,index+1); // with

    subsets.remove(subsets.size()-1);
    generate(list,subsets,index+1);  // without
  }
  public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
      int index = 0;
      ArrayList<Integer> subsets = new ArrayList<>();
      generate(A,subsets,index);

      return ans;
  }
}
