package _1offer2.$57_对称的二叉树;

import offerStructs.TreeLinkNode;
import offerStructs.TreeNode;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null) return true;
        return func(pRoot.left,pRoot.right);
    }

    public boolean func(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        else if(left!=null&&right!=null&&left.val==right.val){
            return func(left.left,right.right)&&func(left.right,right.left);
        }
        return false;
    }
}
