package 笔试.拼多多.$0722拼多多4;

import java.util.Scanner;

/**
 * N位手机号若有K位相同则为靓号，已知一个手机号，求改成靓号的钱最少的情况。修改一个数字花费的金额为两数字的差额
 * 例子: N =6,K=5,输出：4 ，777577（对应最少钱4块的字典序最小的靓号）
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] list = new int[n];
            for(int i =0;i<n;i++){
                list[i] = sc.nextInt();
            }
        }
    }
}


