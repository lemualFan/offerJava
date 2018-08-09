package 笔试.华为0808优招.背包问题;

import java.util.Scanner;

/**
 * 小偷来到了一个神秘的王宫，突然眼前一亮，发现5个宝贝，每个宝贝的价值都不一样，且重量也不一样，但是小偷的背包携带重量
 * 有限，所以他不得不在宝贝中做出选择，才能使偷到的财富最大，请你帮助小偷计算一下。
 * 输入描述:
 * 宝贝价值：6,3,5,4,6
 * 宝贝重量：2,2,6,5,4
 * 小偷背包容量：10输出描述:
 * 偷到宝贝的总价值：15
 */
public class Main {
    private int[] v;
    private int[] w;
    private int[][] c;
    private int weight;
    public Main(int length, int weight, int[] vin, int[] win) {
        v = new int[length + 1];
        w = new int[length + 1];
        c = new int[length + 1][weight + 1];
        this.weight = weight;
        for (int i = 1; i < length + 1; i++) {
            v[i] = vin[i - 1];
            w[i] = win[i - 1];
        }
    }
    public void solve() {
        for(int i = 1; i < v.length; i++) {
            for(int k = 1; k <= weight; k++) {
                if(w[i] <= k) {
                    if(v[i] + c[i - 1][k - w[i]] > c[i - 1][k])
                        c[i][k] = v[i] + c[i - 1][k - w[i]];
                    else
                        c[i][k] = c[i - 1][k];
                } else
                    c[i][k] = c[i - 1][k];
            }
        }
    }
    public void printResult() {
        System.out.println(c[v.length-1][weight]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String valueLine = sc.next();
            String weightLine = sc.next();
            int weight = sc.nextInt();

            String[] vStr = valueLine.split(",");
            String[] wStr = weightLine.split(",");
            int len = vStr.length;
            int[] v = new int[len];
            int[] w = new int[len];
            for(int i = 0;i<len;i++){
                v[i] = Integer.valueOf(vStr[i]);
                w[i] = Integer.valueOf(wStr[i]);
            }
            Main knapsack = new Main(len, weight, v, w);
            knapsack.solve();
            knapsack.printResult();
        }
    }


}
