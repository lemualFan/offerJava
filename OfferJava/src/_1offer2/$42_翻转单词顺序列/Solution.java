package _1offer2.$42_翻转单词顺序列;

import java.util.Arrays;

public class Solution {
    public String ReverseSentence(String str) {
        if(str==null||str.equals(" ")||str.length()==1) return str;
        char[] chars = str.toCharArray();
        int len = chars.length-1;
        for(int i =0;i<len;i++,len--){
            chars[i]^=chars[len];
            chars[len]^=chars[i];
            chars[i]^=chars[len];
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ReverseSentence("student. a am I"));
    }

}