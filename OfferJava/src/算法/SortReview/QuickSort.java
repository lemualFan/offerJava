package 算法.SortReview;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        sort(nums,0,nums.length-1);
    }
    private void sort(T[] nums,int low,int high){
        if(high<=low) return;
        int j = partition(nums,low,high);
        sort(nums,low,j-1);
        sort(nums,j+1,high);
    }

    private int partition(T[] nums, int l, int h) {
        int i = l, j = h + 1;
        T v = nums[l];
        while (true) {
            while (less(nums[++i], v) && i != h) ;
            while (less(v, nums[--j]) && j != l) ;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }
}
