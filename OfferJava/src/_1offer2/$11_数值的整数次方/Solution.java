package _1offer2.$11_数值的整数次方;

public class Solution {
    public double Power(double base, int exponent) {
        if (base==0) return 0;
        if (exponent==0) return 1;
        else if(exponent>0) return base*Power(base,exponent-1);
        else if(exponent<0) return 1/base*Power(base,exponent+1);
        return 1;
    }
}
