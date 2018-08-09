package _1offer2.$4_重建二叉树;

import offerStructs.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if(pre==null||in==null||pre.length==0||in.length==0) return null;
        TreeNode node = new TreeNode(pre[0]);
        for (int i =0;i<in.length;i++){
            if(pre[0]==in[i]){
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right= reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}
