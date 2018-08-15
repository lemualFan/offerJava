package 算法.SortReview;

public class Shell<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        int h = 1;
        while (h<n/3){
            h=h*3+1;
        }
        while (h>=1){
            for (int i = h;i<n;i++){
                for (int j = i;j>=h&&less(nums[j],nums[j-1]);j-=h){
                    swap(nums,j,j-h);
                }
            }
            h=h/3;
        }
    }
}
