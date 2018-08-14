package 笔试.num1.Num2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            for(int i =0;i<num;i++){
                Long n = sc.nextLong();
                Long  y = Long.valueOf(1);
                while (n!=0&&n%2==0){
                    y*=2;
                    n/=2;
                }
                if(n%2!=0&&y%2==0){
                    System.out.println(n+" "+y);
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
