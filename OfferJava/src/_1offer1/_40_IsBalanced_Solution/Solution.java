package _1offer1._40_IsBalanced_Solution;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean flag = false;
        int left = 0;
        int right = 0;
        if(root.left!=null){
            left = getDepth(root.left);
        }
        if(root.right!=null){
            right = getDepth(root.right);
        }
        if(Math.abs(left-right)<=1){
            flag = true;
        }
        return flag;
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
