package _1offer2.$61_二叉搜索树的第K个节点;

import offerStructs.TreeNode;

import java.util.ArrayList;

public class Solution {
    ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if (pRoot==null||k<=0) return null;
        func(pRoot);
        if(!list.isEmpty()){
            int len = list.size();
            if(k>len) return null;
            return list.get(k-1);
        }
        return null;
    }

    public void func(TreeNode root){
        if(root==null) return;
        func(root.left);
        list.add(root);
        func(root.right);
    }

}

