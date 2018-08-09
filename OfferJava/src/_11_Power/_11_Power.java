package _11_Power;

public class _11_Power {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.PowerRecursion(2,5));
        int a = 11;
        int b = a>>1;
        System.out.printf(b+"");
    }

}
 class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1 ){
            return base;
        }
        if(exponent == -1){
            return 1.0/base;
        }
        double basedouble = base;
        boolean flag = false;
        if(exponent<0){
            flag = true;
            exponent = -exponent;
        }
        for(int i = 0;i<exponent-1;i++){
            base = base*basedouble;
        }
        if(flag){
            base = 1.0/base;
        }
        return base;
    }

    public double PowerRecursion(double base,int exponent){
        if(exponent==0)
            return 1;
        if (exponent==1)
            return base;
        double result = PowerRecursion(base,exponent>>1);
        result = result*result;
        if( (0x1 & exponent) == 1){
          result*=base;
        }
        return result;
    }

}
