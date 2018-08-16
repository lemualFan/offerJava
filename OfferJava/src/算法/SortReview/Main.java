package 算法.SortReview;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort<Integer> selection = new QuickSort<>();
        Integer[] arr = {1,2,3,45,56,76,3,5,6,222,2,2,2,2};
        selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
