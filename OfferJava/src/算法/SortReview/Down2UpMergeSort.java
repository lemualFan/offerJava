package 算法.SortReview;

public class Down2UpMergeSort<T extends Comparable<T>> extends MergeSort<T> {
    @Override
    public void sort(T[] nums) {
        int n  = nums.length;
        aux = (T[])new Comparable[n];
        for(int sz=1;sz<n;sz+=sz){
            for(int lo =0;lo<n-sz;lo+=sz+sz){
                merge(nums,lo,lo+sz-1,Math.min(lo + sz + sz - 1, n - 1));
            }
        }
    }
}
