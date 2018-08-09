package _1offer2.$21_从上往下打印二叉树;

import offerStructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null) return res;
        queue.add(root);
        helper();
        return res;
    }

    public void helper(){
        if(queue.isEmpty()) return;
        TreeNode node = queue.poll();
        res.add(node.val);
        if(node.left!=null) queue.add(node.left);
        if(node.right!=null) queue.add(node.right);
        helper();
    }
}
