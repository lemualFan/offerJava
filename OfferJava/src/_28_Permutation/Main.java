package _28_Permutation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "aab";
        Solution solution = new Solution();
        ArrayList<String> res = solution.Permutation(str);
        System.out.println(res.toString());
    }
}
