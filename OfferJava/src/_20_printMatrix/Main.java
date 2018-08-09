package _20_printMatrix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}};
        Solution solution  = new Solution();
        ArrayList<Integer> res = solution.printMatrix(matrix);
        System.out.println(res.toString());
    }
}
