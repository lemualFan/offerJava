package _1offer2.$33_数组中的逆序对;

import java.util.Arrays;

public class Solution {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0) return 0;
        int[] temp;
        temp = Arrays.copyOf(array,array.length);
        int res =func(array,temp,0,array.length-1);
        return res;
    }

    public int func(int[] array,int[] temp,int start,int end){
        if(start==end){
            return 0;
        }
        int mid = start+(end-start)/2;
        int left = func(array,temp,start,mid)%1000000007;
        int right = func(array,temp,mid+1,end)%1000000007;
        int count = 0;

        int i = mid;
        int j = end;
        int k = end;
        while (i>=start&&j>mid){
            if(array[i]>array[j]){
                temp[k--] = temp[i--];
                count+=j-mid;
                if(count>=1000000007){
                    count%=1000000007;
                }
            }else {
                temp[k--] = array[j--];
            }
        }
        while (i>=start){
            temp[k--] = array[i--];
        }
        while (j>mid){
            temp[k--] = array[j--];
        }
        for(int h = start;h<=end;h++){
            array[h] = temp[h];
        }

        return (left+right+count)%1000000007;
    }

}
