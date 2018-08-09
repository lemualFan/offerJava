package _27_Convert;
/**
 *输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

import java.util.ArrayList;

public class Solution {

    ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null||(pRootOfTree.right==null&&pRootOfTree.left==null)){
            return pRootOfTree;
        }
        TreeNode node = null;
        midOrderTravel(pRootOfTree);
        int len = list.size();
        for(int i=0;i<len;i++){
            if(i==0){
                list.get(i).right = list.get(i+1);
                list.get(i).left = null;

            }else if(i==len-1){
                list.get(i).left = list.get(i-1);
                list.get(i).right = null;
            }else{
                TreeNode temp = list.get(i);
                temp.right = list.get(i+1);
                temp.left = list.get(i-1);
            }
        }
        node = list.get(0);
        return node;
    }

    public void midOrderTravel(TreeNode root){
        if(root==null)
            return;
        midOrderTravel(root.left);
        list.add(root);
        midOrderTravel(root.right);
    }
}
