package _1offer2.$35_统计一个数字在排序数组中的个数;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0) return 0;
        int count = 0;
        count =binSerch(array,k+0.5) - binSerch(array,k-0.5)+1;
        return count;
    }

    public int binSerch(int[] array,double k){
        int start = 0;
        int end = array.length-1;
        int mid = start+(end-start)/2;
        int low = start;
        int high = end;
        while (low<=high){
            if(array[mid]<k){
                low=mid+1;
                mid = low+(high-low)/2;
            }else if(array[mid]>k){
                high=mid-1;
                mid= low+(high-low)/2;
            }
        }
        return low;
    }
}
