package _1offer2.$27_最小k个数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input==null||input.length<=0||k<=0||input.length<k) return res;
        int len = input.length;
        QuickSort(input,0,len-1);
        for(int i =0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    public static void QuickSort(int[] array,int low,int high){
        if(low<high){
            int p  = partition(array,low,high);
            QuickSort(array,low,p-1);
            QuickSort(array,p+1,high);
        }
    }

    public static int partition(int[] array,int low,int high){
        int key = array[low];
        while(low<high){
            while (low<high&&key<=array[high]) high--;
            array[low] = array[high];
            while(low<high&&key>=array[low]) low++;
            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }

}
