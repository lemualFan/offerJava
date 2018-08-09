package 笔试.拼多多.$0722_拼多多2;

import java.util.Scanner;
/*
不能解决a>b,b>c,c>a的情况
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();  //lie
            int M = sc.nextInt(); //hang
            char[][] list = new char[M][N];
            int[] res = new int[N];
            for(int i=0;i<M;i++){
                list[i] = sc.next().toCharArray();
            }

            for(int j = 0;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    int cishu = 0;
                    for(int i = 0;i<M;i++) {
                        System.out.println(list[i][j]+" "+list[i][k]+" "+(list[i][j] < list[i][k]));
                        if (list[i][j] < list[i][k]) {
                            cishu++;
                        } else if (list[i][j] > list[i][k]) {
                            cishu--;
                        }
                    }
                    if(cishu>0){
                        res[k]++;
                    }else if(cishu < 0){
                        res[j]++;
                    }
                }
            }

            int max = -1;
            int num = 0;
            boolean flag = false;
           for (int i = 0;i<N;i++){
               System.out.println(res[i]);
               if(res[i]>max){
                   max = res[i];
                   num = i;
               }else if(res[i]==max){
                   flag=true;
               }
           }

           if(flag) {
               System.out.println(-1);
               return;
           }else {
               System.out.println(num);
           }

        }
    }
}
