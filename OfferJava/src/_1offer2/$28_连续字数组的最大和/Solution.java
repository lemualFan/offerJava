package _1offer2.$28_连续字数组的最大和;

import java.util.Arrays;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0) return 0;
        int max = Integer.MIN_VALUE;
        int len = array.length;
        int[][] res = new int[len][len];
        for(int i = 0;i<len;i++){
            Arrays.fill(res[i],Integer.MIN_VALUE);
            res[i][i] = array[i];
        }
        for(int i =0;i<len;i++){
            for(int j =i;j<len;j++){
                if(j!=i){
                    res[i][j] = res[i][j-1] + array[j];
                }
                if(max<res[i][j]){
                    max = res[i][j];
                }
            }
        }
        return max;
    }

}
