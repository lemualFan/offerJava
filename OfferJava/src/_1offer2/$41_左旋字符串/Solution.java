package _1offer2.$41_左旋字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str ==null|| str.equals("")) return "";
        if(n==0) return str;
        int len = str.length();
        n%=len;
        String str1 = str.substring(0,n);
        String str2 = str.substring(n);
        return str2+str1;
    }

}
