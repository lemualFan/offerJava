package 算法.SortReview;

public abstract class MergeSort<T extends Comparable<T>> extends Sort<T> {
    protected T[] aux;

    protected void merge(T[] nums,int low,int mid,int high){
        int i = low,j=mid+1;
        for(int k = low;k<=high;k++){
            aux[k] = nums[k];
        }
        for(int k =low;k<=high;k++){
            if(i>mid)
                nums[k] = aux[j++];
            else if (j>high)
                nums[k] = aux[i++];
            else if (aux[i].compareTo(aux[j])<=0)
                nums[k] =aux[i++];
            else
                nums[k] = aux[j++];
        }
    }
}
