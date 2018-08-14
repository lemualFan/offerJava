package _1offer1._50_StrToInt;

public class Solution {
    public int StrToInt(String str) {
        if(str==null||str==""||str.length()==0) return 0;
        char[] a = str.toCharArray();
        int sum = 0;
        int fuhao = 0;
        if(a[0]=='-') fuhao=1;
        for(int i = fuhao;i<a.length;i++){
            char  c = a[i];
            if(c=='+') continue;
            if(c>'9'||c<'0') return 0;
            sum = sum*10+c-'0';
        }

        return fuhao==0?sum:sum*-1;
    }
}
