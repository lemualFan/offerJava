package _1offer2.$25_字符串的排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Solution solution  = new Solution();
        ArrayList<String> res= solution.Permutation("abc");
        Iterator iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
    }
}
