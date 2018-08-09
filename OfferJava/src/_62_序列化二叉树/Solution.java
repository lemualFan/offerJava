package _62_序列化二叉树;

import offerStructs.TreeNode;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Solution {
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root==null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        int len = str.length();
        if(index>=len){
            return null;
        }
        String[] list = str.split(",");
        TreeNode root = null;
        if(!list[index].equals("#")){
            root = new TreeNode(Integer.valueOf(list[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }

        return root;
    }
}