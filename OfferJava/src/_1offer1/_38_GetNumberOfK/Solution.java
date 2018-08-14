package _1offer1._38_GetNumberOfK;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length<=0){
            return 0;
        }
        int num = 0;
        for(int i = 0;i<array.length;i++){
            if (array[i]==k){
                num++;
            }
        }
        return num;
    }
}
