package _1offer1._39_TreeDepth;

/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */

public class Solution {
    public int TreeDepth(TreeNode root) {
        int num = getDepth(root);
        return  num;
    }

    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = 0;
        int right = 0;
        if(root.left!=null){
            left = getDepth(root.left);
        }
        if(root.right!=null){
            right = getDepth(root.right);
        }

        return 1+Math.max(left,right);
    }
}