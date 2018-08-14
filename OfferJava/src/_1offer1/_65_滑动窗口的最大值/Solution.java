package _1offer1._65_滑动窗口的最大值;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {   if(num==null||num.length==0) return null;
        int len = num.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(size<=0||size>=len) return res;
        for(int i =0;i+size<=len;i++){
            res.add(maxFunc(num,i,i+size-1));
        }
        return res;
    }

    public int maxFunc(int[] num,int begin,int end){
        int max =num[begin];
        for(int i = begin;i<=end;i++){
            if(num[i]>=max){
                max = num[i];
            }
        }
        return max;
    }
}
