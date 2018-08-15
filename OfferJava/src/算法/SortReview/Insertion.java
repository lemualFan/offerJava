package 算法.SortReview;

/*
快速排序平均需要n2/4次比较与交换，最差需要n2/4次比较与交换。对于基本有序的序列，只需要n-1次比较，无交换。
对于基本有序的序列，插入排序效果最好。
 */
public class Insertion<T extends Comparable<T>> extends Sort<T>{
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        for(int i =1;i<n;i++){
            for(int j =i;j>0&&less(nums[j],nums[j-1]);j--){
                swap(nums,j,j-1);
            }
        }
    }
}
