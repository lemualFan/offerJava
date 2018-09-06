package _1offer2.$37_平衡二叉树;

import offerStructs.ListNode;
import offerStructs.TreeNode;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null ) return true;
        if(!IsBalanced_Solution(root.left)) return false;
        if(!IsBalanced_Solution(root.right)) return false;

        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if(Math.abs(left-right)<=1){
            return true;
        }
        return false;
    }

    public int TreeDepth(TreeNode node){
        if (node==null) return 0;
        int left = TreeDepth(node.left);
        int right = TreeDepth(node.right);
        return left>right?left+1:right+1;
    }
}
