package 笔试.拼多多.$0722拼多多3;

import java.util.Arrays;
import java.util.Scanner;

/*
n[0,1024]个货物，每个货物重量w[100,300]。如果每辆车最多的载重为300，请问最少需要多少辆车才能运输所有货物
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] strlist = str.split(" ");
            int len = strlist.length;
            int [] nums = new int[len];
            for(int i = 0;i<len;i++){
                nums[i] = Integer.valueOf(strlist[i]);
            }
            Arrays.sort(nums);
            int carnum  = 0;
            boolean[] flag = new boolean[len];
            for(int i = len-1;i>=0;i--){
                if(!flag[i]){
                    flag[i] = true;
                    carnum++;
                    int temp = 300;
                    for(int j = len-1;j>=0;j--){
                        if(!flag[j]&&nums[j]<=temp){
                            temp = temp -nums[j];
                            flag[j] = true;
                        }
                    }
                }
            }

            System.out.println(carnum);
        }
    }
}
