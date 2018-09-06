package _1offer2.$49_构建乘积数组;

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if(A.length==0||A==null) return new int[0];
        int[] b = new int[A.length];
        b[0] = 1;
        for (int i = 1;i<b.length;i++){
            b[i] = b[i-1]*A[i-1];
        }
        int temp = 1;
        for(int i = A.length-2;i>=0;i--){
            temp = temp*A[i+1];
            b[i]*=temp;
        }

        return b;
    }
}