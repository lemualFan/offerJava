package _36_InversePairs;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class Solution {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int[] temp ;
        temp = Arrays.copyOf(array,array.length);
        int count = InversePairsCore(array,temp,0,array.length-1);
        return  count;
    }

    public int InversePairsCore(int[] array,int[] temp,int start,int end){
        if(start == end){
            return 0;
        }
        int mid= start+(end-start)/2;
        int left = InversePairsCore(array,temp,start,mid)%1000000007;
        int right = InversePairsCore(array,temp,mid+1,end)%1000000007;
        int i,j,k,count;
        i=mid;
        j=end;
        k=end;
        count =0;
        while(i>=start&&j>=mid+1){
            if(array[i]>array[j]){
                temp[k--] = array[i--];
                count+=j-mid;
                if(count>=1000000007){
                    count%=1000000007;
                }
            }else{
                temp[k--] = array[j--];
            }
        }
        while(i>=start){
            temp[k--] = array[i--];
        }
        while(j>=mid+1){
            temp[k--] = array[j--];
        }
        for(int s = start;s<=end;s++){
            array[s] = temp[s];
        }
        return (left+right+count)%1000000007;
    }
}
