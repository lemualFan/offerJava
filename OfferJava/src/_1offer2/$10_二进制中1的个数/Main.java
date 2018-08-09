package _1offer2.$10_二进制中1的个数;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        while (n!=0){
            System.out.println((n-1)&n);
            n = (n-1)&n;
        }

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.NumberOf1(7));
    }
}
