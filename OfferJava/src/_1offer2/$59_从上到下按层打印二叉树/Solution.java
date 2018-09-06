package _1offer2.$59_从上到下按层打印二叉树;

import offerStructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot==null) return res;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(pRoot);
        while (!queue1.isEmpty()){
            queue2.addAll(queue1);
            queue1.clear();
            ArrayList<Integer> temp = new ArrayList<>();
            while (!queue2.isEmpty()){
                TreeNode node = queue2.poll();
                temp.add(node.val);
                if(node.left!=null) queue1.add(node.left);
                if(node.right!=null) queue1.add(node.right);
            }
            res.add(temp);
        }
        return  res;
    }
}