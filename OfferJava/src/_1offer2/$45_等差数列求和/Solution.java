package _1offer2.$45_等差数列求和;

public class Solution {
    public int Sum_Solution(int n) {
        if(n<=0) return -1;
        int num =(int) Math.pow(n,2)+n;
        return num>>1;
    }
}