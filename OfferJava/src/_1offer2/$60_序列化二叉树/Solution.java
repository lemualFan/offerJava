package _1offer2.$60_序列化二叉树;

import offerStructs.TreeNode;

public class Solution {
    int index = -1;
     String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root==null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    public TreeNode Deserialize(String str) {
        index++;
        String[] list = str.split(",");
        if(index>=list.length) return null;
        TreeNode node = null;
        if(!list[index].equals("#")){
            node = new TreeNode(Integer.valueOf(list[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }

}