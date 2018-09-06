package _1offer2.$36_二叉树的深度;

import offerStructs.TreeNode;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        int res = 0;
        res = func(root);
        return res;
    }
    public int func(TreeNode node){
        if(node==null) return 0;
        int left = 0;
        int right = 0;
        int count = 1;
        if(node.left!=null){
          left =  func(node.left);
        }
        if(node.right!=null){
           right=  func(node.right);
        }
        return count+Math.max(left,right);
    }
}
