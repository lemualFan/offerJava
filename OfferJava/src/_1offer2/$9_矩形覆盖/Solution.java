package _1offer2.$9_矩形覆盖;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

public class Solution {
    public int RectCover(int target) {
        return helper(1,target-1)+helper(2,target-2);
    }

    public int helper(int num,int target){
        if (target<0)return 0;
        else if(target==0) return 1;
        else return helper(1,target-1)+helper(2,target-2);
    }
}