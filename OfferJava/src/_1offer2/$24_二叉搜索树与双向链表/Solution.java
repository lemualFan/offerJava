package _1offer2.$24_二叉搜索树与双向链表;

import offerStructs.TreeNode;

import java.util.ArrayList;

public class Solution {
    ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null) return null;
        midTransfer(pRootOfTree);
        int len = list.size();
        for(int i = 0;i<len;i++){
            TreeNode node = list.get(i);
            if(i>=1) node.left = list.get(i-1);
            else node.left = null;

            if (i<len-1) node.right = list.get(i+1);
            else node.right=null;
        }

        return list.get(0);
    }

    public void midTransfer(TreeNode root){
        if(root==null)return;
        midTransfer(root.left);
        list.add(root);
        midTransfer(root.right);
    }
}
