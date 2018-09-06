package _1offer2.$58_按之字形顺序打印二叉树;

import offerStructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot==null) return res;
        Queue<TreeNode>     queue = new LinkedList<>();
        queue.add(pRoot);
        Queue<TreeNode> tempqueue = new LinkedList<>();
        int count = 0;
        while (!queue.isEmpty()){
            tempqueue.addAll(queue);
            queue.clear();
            ArrayList<Integer> templist = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            while (!tempqueue.isEmpty()){
                TreeNode temp = tempqueue.poll();
                if (count%2==0){
                    templist.add(temp.val);
                }else {
                    stack.push(temp.val);
                }
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            if(count%2!=0){
                while (!stack.isEmpty()){
                    templist.add(stack.pop());
                }
            }
            count++;
            res.add(templist);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(11);
        node1.left=node2;
        node1.right=node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        Solution solution = new Solution();
        System.out.println(solution.Print(node1));
    }

}
