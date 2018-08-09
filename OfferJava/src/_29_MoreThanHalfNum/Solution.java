package _29_MoreThanHalfNum;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 *由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * O(n)解法，只记录一个值times，初始为1，如果下一个数和前一个数相同，+1，否则-1.最后使time为1的值为结果。
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int res = 0;
        int len = array.length;
        if(len<=0){
            return res;
        }
        if(len==1){
            return array[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<len;i++){
            int key = array[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
                if(map.get(key)>len/2){
                    res = key;
                    break;
                }
            }
        }

        return res;
    }
}
