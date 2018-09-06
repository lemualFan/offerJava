package _1offer2.$56_二叉树的下一个节点;


import offerStructs.ListNode;
import offerStructs.TreeLinkNode;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return null;
        TreeLinkNode res  =null;
        if(pNode.right!=null){
            pNode  = pNode.right;
            while (pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next!=null){
            TreeLinkNode node = pNode.next;
            if(node.left==pNode){
                return node;
            }
            pNode = pNode.next;
        }

        return res;
    }
}