package _1offer2.$17_二叉树的镜像;

import offerStructs.TreeNode;

public class Solution {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = right;
            root.right = left;
            Mirror(right);
            Mirror(left);
        }
    }
}
