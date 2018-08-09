package 笔试.阿里编程测验;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            String[] strlist = str.split(",");
            int len = strlist.length;
            int[] list = new int[len];
            int[] res = new int[len];
            for(int i = 0;i<len;i++){
                list[i] = Integer.valueOf(strlist[i]);
                res[i] = 1;
            }
            for(int i =0;i<len-1;i++){
                if(list[i]>list[i+1]){
                    res[i]=res[i+1]+1>res[i]?res[i+1]+1:res[i];
                }else if(list[i]<list[i+1]){
                    res[i+1] = res[i]+1>res[i+1]?res[i]+1:res[i+1];
                }
            }
            int count = 0;
            for(int i =0;i<len;i++) count+=res[i];
            System.out.println(count);
        }
    }
}
