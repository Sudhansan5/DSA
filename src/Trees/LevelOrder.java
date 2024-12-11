package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

/*
Given a binary tree, return the level order traversal of its nodes' values.
(i.e., from left to right, level by level).
 */
public class LevelOrder {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        while(queue.size()!=0){
            ArrayList<Integer> arr = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode rn = queue.remove();
                arr.add(rn.val);
                if (rn.left!=null){
                    queue.add(rn.left);
                }
                if (rn.right!=null){
                    queue.add(rn.right);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
    public static void main(String[] args){
        LevelOrder obj = new LevelOrder();
        TreeNode A = new TreeNode(5);
    System.out.println(obj.solve(A));
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
     }
  }