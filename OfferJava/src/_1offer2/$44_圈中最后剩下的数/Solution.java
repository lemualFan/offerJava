package _1offer2.$44_圈中最后剩下的数;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0) return -1;
        if(n==1) return 0;
        else return (LastRemaining_Solution(n-1,m)+m)%n;
    }

}
