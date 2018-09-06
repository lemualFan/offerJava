package _1offer2.$46_不用加减乘除做加法;

public class Solution {
    public int Add(int num1,int num2) {
        int sum = 0;
        int carry = 0;
        do{
            sum = num1^num2;
            carry = num1&num2;
            num1=sum;
            num2=carry<<1;
        }while (carry!=0);
        return sum;
    }
}