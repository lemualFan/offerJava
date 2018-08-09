package _52_multiply;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Solution {
    public int[] multiply(int[] A) {
        if(A==null||A.length==0){
            return new int[0];
        }
        int[] res = new int[A.length];
        res[0] = 1;
        for(int i = 1;i<A.length;i++){
            res[i] = res[i-1]*A[i-1];
        }
        int temp = 1;
        for(int i = A.length-2;i>=0;i--){
            temp = temp*A[i+1];
            res[i]*=temp;
        }
        return res;
    }
}
