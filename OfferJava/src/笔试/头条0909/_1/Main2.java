package 笔试.头条0909._1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();

        int max=Integer.MIN_VALUE;
        int count=0;
        int left=0;
        for(int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            int ccount=map.getOrDefault(ch,0);
            if(ccount==0){
                map.put(ch,1);
                ++count;
            }else{
                if(count>max){
                    max=count;
                }
                String subStr=s.substring(0,i);
                int index=subStr.lastIndexOf(ch);
                for(int j=left;j<=index;++j){
                    map.put(s.charAt(j),0);
                }
                map.put(ch,1);
                left=index+1;
                count=i-index;

            }
        }
        if(count>max){
            max=count;
        }
        System.out.print(max);
    }
}