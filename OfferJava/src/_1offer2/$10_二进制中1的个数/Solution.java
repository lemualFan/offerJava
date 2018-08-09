package _1offer2.$10_二进制中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
}