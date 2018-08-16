package 算法.SortReview;

import 算法.SortReview.MergeSort;

public class Up2DownMergeSort<T extends Comparable<T>> extends MergeSort<T> {
    @Override
    public void sort(T[] nums) {
        aux = (T[]) new Comparable[nums.length];
        sort(nums,0,nums.length-1);
    }

    protected void sort(T[] nums,int low,int high){
        if(high<=low) return;
        int mid = low + (high-low)/2;
        sort(nums,low,mid);
        sort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
}
