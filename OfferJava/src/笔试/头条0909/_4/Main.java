package 笔试.头条0909._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.valueOf(sc.nextLine());
        int[] list = new int[m];
        String str = sc.nextLine();
        String[] strlist= str.split(" ");
        for(int i =0;i<m;i++){
            list[i] = Integer.valueOf(strlist[i]);
        }
        if(func(m,list)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }

    public static boolean func(int m,int[] list){
        if(m==1){
            String temp = Integer.toBinaryString(list[0]);
            if(temp.charAt(0)!='0') return false;
        }else if(m==2){
            String temp = Integer.toBinaryString(list[0]);
            for(int i =0;i<m;i++){
                if(temp.charAt(i)!='1') return false;
            }
            if(temp.charAt(m)!='0') return false;

            temp = Integer.toBinaryString(list[1]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;

        }else if(m==3){
            String temp = Integer.toBinaryString(list[0]);
            for(int i =0;i<m;i++){
                if(temp.charAt(i)!='1') return false;
            }
            if(temp.charAt(m)!='0') return false;

            temp = Integer.toBinaryString(list[1]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;

            temp = Integer.toBinaryString(list[2]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;

        }else if(m==4){
            String temp = Integer.toBinaryString(list[0]);
            for(int i =0;i<m;i++){
                if(temp.charAt(i)!='1') return false;
            }
            if(temp.charAt(m)!='0') return false;

            temp = Integer.toBinaryString(list[1]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;

            temp = Integer.toBinaryString(list[2]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;

            temp = Integer.toBinaryString(list[3]);
            if(temp.charAt(0)!='1'&&temp.charAt(1)!='0') return false;
        }
        return  true;
    }


}
