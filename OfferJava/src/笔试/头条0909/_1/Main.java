package 笔试.头条0909._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()==0) System.out.println(0);
        int len = str.length();
        int max = Integer.MIN_VALUE;
        String temp = "";
        int count = 0;
        for(int i =0;i<len;i++){
            if(temp.contains(str.charAt(i)+"")){
                temp = "";
                count=0;
                continue;
            }
            int j = i;
            while (j<len&&!temp.contains(str.charAt(j)+"")){
                temp+=str.charAt(j);
                count++;
                j++;
                if(max<count){
                    max=count;
                }
            }
            i=j;
            temp="";
            count=0;
        }
        System.out.println(max);

    }
}
