package 算法.SortReview;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bubble<Integer> selection = new Bubble<>();
        Integer[] arr = {1,2,3,45,56,76,3,5,6};
        selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
