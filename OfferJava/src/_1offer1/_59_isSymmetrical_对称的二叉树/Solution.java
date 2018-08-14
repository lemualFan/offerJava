package _1offer1._59_isSymmetrical_对称的二叉树;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null) return true;
        if(pRoot.left!=null&&pRoot.right!=null){
            return func(pRoot.left,pRoot.right);
        }else if(pRoot.left==null&&pRoot.right==null){
            return true;
        }
        return false;
    }

    boolean func(TreeNode left,TreeNode right){
        if(left.val!=right.val) return false;
        boolean flag1,flag2;
        if(left.left!=null&&right.right!=null){
           flag1 = func(left.left,right.right);
        }else if(left.left==null&&right.right==null){
            flag1 =  true;
        }else {
            flag1 = false;
        }
        if(left.right!=null&&right.left!=null){
           flag2 = func(left.right, right.left);
        }else if (left.right==null&&right.left==null){
            flag2 =  true;
        }else {
           flag2 = false;
        }
        return flag1&&flag2;
    }
}