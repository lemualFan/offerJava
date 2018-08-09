package _1offer2.$22_二叉搜索树的后序遍历序列;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
       if(sequence.length == 0) return false;
       return isTreeBST(sequence,0,sequence.length-1);
    }
    public boolean isTreeBST(int[] sequence,int start,int end){
        if(end<=start) return true;
        int i = start;
        for(;i<end;i++){
            if(sequence[i]>sequence[end]) break;
        }
        for(int j = i;j<end;j++){
            if(sequence[j]<sequence[end]) return false;
        }
        return isTreeBST(sequence,start,i-1)&&isTreeBST(sequence,i,end-1);
    }
}
