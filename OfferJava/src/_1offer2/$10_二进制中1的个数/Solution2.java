package _1offer2.$10_二进制中1的个数;

public class Solution2 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n!=0){
            n = (n-1)&n;
            count++;
        }
        return count;
    }
}
