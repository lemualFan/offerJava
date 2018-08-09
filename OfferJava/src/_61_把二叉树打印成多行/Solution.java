package _61_把二叉树打印成多行;

import offerStructs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> s1 = new LinkedList<>();
        s1.offer(pRoot);
        Queue<TreeNode> s2 = new LinkedList<>();
        int layer = 1;

        while (!s1.isEmpty()||!s2.isEmpty()){
            if(layer%2!=0){
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.isEmpty()){
                    TreeNode node = s1.poll();
                    if(node!=null){
                        temp.add(node.val);
                        s2.offer(node.left);
                        s2.offer(node.right);
                    }
                }
                if(!temp.isEmpty()){
                    result.add(temp);
                    layer++;
                }
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.isEmpty()){
                    TreeNode node = s2.poll();
                    if(node!=null){
                        temp.add(node.val);
                        s1.offer(node.left);
                        s1.offer(node.right);
                    }
                }
                if(!temp.isEmpty()){
                    result.add(temp);
                    layer++;
                }
            }
        }

        return  result;
    }
}
