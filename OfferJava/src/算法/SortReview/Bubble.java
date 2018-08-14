package 算法.SortReview;

public class Bubble<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        boolean hasSort = false;
        for(int i = 0;i<n&&!hasSort;i++){
            hasSort = true;
            for(int j = 0;j<n-i-1;j++){
                if(less(nums[j+1],nums[j])){
                    hasSort = false;
                    swap(nums,j,j+1);
                }

            }
        }
    }
}
