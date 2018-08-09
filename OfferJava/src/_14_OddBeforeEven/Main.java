package _14_OddBeforeEven;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        Solution solution = new Solution();
        solution.reOrderArray(a);

        double b =0.4;
        double c =0.5;
        int n =10;
        while (n>0){
            System.out.println(c-b);
            n--;
        }
    }
}
class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(Integer item:array){
            if((item & 0x1)==1){
                odd.add(item);
            }else{
                even.add(item);
            }
        }
        odd.addAll(even);
        for(int i = 0;i<array.length;i++){
            array[i] = odd.get(i);
        }
    }
}

