package _54_isNumeric;
/*
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */

public class Solution {
    public boolean isNumeric(char[] str) {
        int len = str.length;
        boolean sign = false,decimal = false,hasE  = false;
        for(int i = 0;i<len;i++){
            char c = str[i];
            if(c=='e'||c=='E'){
                if(i==len-1) return false;
                if(hasE) return false;
                hasE  = true;
            }else if (c=='+'||c=='-'){
                //如果第二次出现+-号，必须紧接在e之后
                if(sign&&str[i-1]!='e'&&str[i-1]!='E') return false;
                if(!sign && i>0 && str[i-1]!='e'&&str[i-1]!='E') return false;
                sign = true;
            }else if(c=='.'){
                //e后面不能接小数点，小数点不能出现两次
                if(hasE||decimal) return false;
                decimal = true;
            }else if (c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
