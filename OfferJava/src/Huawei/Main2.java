package Huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给出一组正整数，你从第一个数向最后一个数方向跳跃，每次至少跳跃1格，
 * 每个数的值表示你从这个位置可以跳跃的最大长度。计算如何以最少的跳跃次数跳到最后一个数。
 * 输入：7 2 3 2 1 2 1 5 输出3
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int min = num;
            int[] list = new int[num];
            for(int i = 0;i<num;i++){
                list[i] = sc.nextInt();
            }
        }
    }

    public static int solution(int[] list){


        return 0;
    }
}


 class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] steps = new int[n];
        for(int i = 0; i < n; ++i){
            steps[i] = in.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for(int i = 1; i < n; ++i){
            for(int j = 0; j < i; ++j){
                if(j + steps[j] >= i)
                    dp[i] = Math.min(dp[i], dp[j]+1);
            }
        }
        System.out.println(dp[n-1]);
    }
}
