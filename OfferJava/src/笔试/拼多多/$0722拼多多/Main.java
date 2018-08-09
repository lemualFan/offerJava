package 笔试.拼多多.$0722拼多多;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double log = logfunc(n/4.0 +1,2);
        double floor = Math.floor(log);
        double ceil = Math.ceil(log);


        double cha  = n - (4*(Math.pow(2,ceil-1)-1));

        double per_num = Math.pow(2,ceil-1);

        double res = cha/per_num;

        if(res>0&&res<=1){
            System.out.println("Alice");
        }else if(res>1&&res<=2){
            System.out.println("Bob");
        }else if(res>2&&res<=3){
            System.out.println("Cathy");
        }else if(res>3&&res<=4){
            System.out.println("Dave");
        }

    }
    public static double logfunc(double value,double base){
        return Math.log(value) / Math.log(base);
    }
}
