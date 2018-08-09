package JD.num1.Num2.Num3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            for(int i =0;i<num;i++){
                String str = sc.next();
                System.out.println(getRes(str));
            }
        }
    }

    public static String getRes(String str){
        String res = "No";
        int len = str.length();
        if(len%2==1){
            return "No";
        }
        int right = 0;
        int left = 0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='('){
               left++;
            }else {
                right++;
            }
            if(left-right<=-2){
                return res;
            }
        }
        res = "Yes";
        return res;
    }

    public static String getRes2(String str){
        int stk =0;
        int i = 0;
        int ttk = 0;
        for( i = 0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stk++;
            }else if(stk!=0){
                stk--;
            }else {
                ttk++;
            }
        }
        if(stk+ttk==0||(stk==1&&ttk==1)){
            return "Yes";
        }else{
            return "No";
        }
    }
}
