package _1offer1._63_二叉搜索树的第k个节点;

import offerStructs.TreeNode;

import java.util.ArrayList;

/**
 * 给定一颗二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）
 * 中，按结点数值大小顺序第三小结点的值为4。
 */
public class Solution {

    ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        midSearch(pRoot);
        if(!list.isEmpty()){
            int len = list.size();
            if(k<=0||k>len) return null;
            return list.get(k-1);
        }
        return null;
    }

    void midSearch(TreeNode node){
        if(node!=null){
            if(node.left!=null) midSearch(node.left);
            list.add(node);
            if(node.right!=null) midSearch(node.right);
        }
    }
}
