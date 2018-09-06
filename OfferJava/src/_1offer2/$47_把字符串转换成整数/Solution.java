package _1offer2.$47_把字符串转换成整数;

public class Solution {
    public int StrToInt(String str) {
        if(str.length()==0||str==null) return 0;
        int res = 0;
        boolean flag = true;
        char[] list = str.toCharArray();
        int i = 0;
        if(list[0]=='-') {flag=false;i++;}
        if(list[0]=='+') i++;
        for(;i<list.length;i++){
            if(list[i]>'9'||list[i]<'0') return 0;
            else {
                res = res*10 + list[i]-'0';
            }
        }
        if (!flag) res = -res;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.StrToInt("a123456"));
    }
}
