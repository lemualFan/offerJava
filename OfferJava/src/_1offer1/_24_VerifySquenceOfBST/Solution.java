package _1offer1._24_VerifySquenceOfBST;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return VerifySquenceOfBST(sequence,0,sequence.length);
    }

    public  boolean VerifySquenceOfBST(int[] sequence,int begin,int length){
        if(sequence==null||length<=0){
            return false;
        }
        int root = sequence[length-1];
        int leftIndex = 0;
        for(;leftIndex<length-1;leftIndex++){
            if(sequence[leftIndex]>root){
                break;
            }
        }
        int rightIndex = leftIndex;
        for (;rightIndex<length-1;rightIndex++){
            if(sequence[rightIndex]<root){
                return false;
            }
        }
        boolean leftFlag = true;
        boolean rightFlag = true;
        if(leftIndex>0){
            leftFlag = VerifySquenceOfBST(sequence,0,leftIndex);
        }
        if(rightIndex<length-1){
            rightFlag = VerifySquenceOfBST(sequence,leftIndex,length-1);
        }
        return leftFlag&&rightFlag;
    }
}
