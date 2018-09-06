package _1offer2.$51_表示数值的字符串;

public class Solution {
    public boolean isNumeric(char[] str) {
        int len = str.length;
        boolean hasE=false,hasSigh=false,hasDemical=false;
        for(int i =0;i<len;i++){
            if (str[i]=='e'||str[i]=='E'){
                if(i==len-1) return false;
                if(hasE) return false;
                hasE = true;
            }else if(str[i]=='.'){
                if(hasE) return false;
                if(hasDemical) return false;
                if(i==0) return false;
                //样例中-.123也成立
                //if(i>0&&(str[i-1]<'0'||str[i-1]>'9')) return false;
                hasDemical = true;
            }else if(str[i]=='+'||str[i]=='-'){
                if (hasSigh&&str[i-1]!='e'&&str[i-1]!='E') return false;
                if(!hasSigh&&i>0&&str[i-1]!='e'&&str[i-1]!='E') return false;
                hasSigh = true;
            }else if(str[i]<'0'||str[i]>'9'){
                return false;
            }
        }

        return true;
    }
}