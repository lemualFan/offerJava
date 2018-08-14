package _1offer1._65_滑动窗口的最大值;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> list =solution.maxInWindows(num,3);
        System.out.println(list);
    }
}
