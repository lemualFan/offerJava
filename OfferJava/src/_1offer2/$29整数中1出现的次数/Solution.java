package _1offer2.$29整数中1出现的次数;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            System.out.println((a + 8) / 10 * m +" "+(a % 10 == 1 ? b + 1 : 0));
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.NumberOf1Between1AndN_Solution(13)+"");
    }
}
