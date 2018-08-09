package Sort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {3,2,4,5,1,3,5,76,7,3,3,6,4,3};
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.MergeSort(a)));
    }
}
