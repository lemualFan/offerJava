package _1offer2.$23_二叉树中和为某一值得路径;

import offerStructs.TreeNode;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Solution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)return res;
        list.add(root.val);
        target-=root.val;
        if (target==0&&root.right==null&&root.left==null){
            res.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return res;
    }
}
