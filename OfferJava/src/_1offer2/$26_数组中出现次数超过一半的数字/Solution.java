package _1offer2.$26_数组中出现次数超过一半的数字;

import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int res  = 0;
        if (array.length==0||array==null) return res;
        Arrays.sort(array);
        int len  = array.length;
        int mid = len/2;
        int count=0;
        for(int i=0;i<len;i++){
            if(array[mid]==array[i]) count++;
        }
        if(count>len/2) res = array[mid];
        return res;
    }
}
