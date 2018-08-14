package _1offer1._43_FindNumbersWithSum;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = array.length;
        if(len==0||array==null){
            return res;
        }
        int multimin = Integer.MAX_VALUE;
        for(int i = 0;i<len;i++){
            int left = sum - array[i];
            if(left<=array[i]){
                break;
            }
            for(int j=len-1;j>i;j--){
                if(array[j]==left){
                    int multi = array[i]*left;
                    if(multi<multimin){
                        multimin = multi;
                        res.clear();
                        res.add(array[i]);
                        res.add(left);
                    }
                }
            }
        }
        return res;
    }
}
