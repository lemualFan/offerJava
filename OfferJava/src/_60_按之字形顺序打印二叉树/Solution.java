package _60_按之字形顺序打印二叉树;


import offerStructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<>();
        int layer  = 1;

        while (!s1.empty()||!s2.isEmpty()){
            if(layer%2!=0){
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.isEmpty()){
                    TreeNode node = s1.pop();
                    if(node!=null){
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()){
                    layer++;
                    result.add(temp);
                }
            }else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.isEmpty()){
                    TreeNode node = s2.pop();
                    if(node!=null){
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()){
                    layer++;
                    result.add(temp);
                }
            }
        }
        return result;
    }

}