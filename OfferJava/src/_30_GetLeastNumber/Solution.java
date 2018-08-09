package _30_GetLeastNumber;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res  = new ArrayList<>();
        if(input.length<k||input.length<=0||k<=0){
            return res;
        }
        int len = input.length;
        for(int i = 0;i<len;i++){
            for(int j = i+1;j<len;j++){
                if(input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for(int i = 0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
}
