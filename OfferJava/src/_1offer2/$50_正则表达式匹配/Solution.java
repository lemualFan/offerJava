package _1offer2.$50_正则表达式匹配;

import java.util.regex.Pattern;

public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if (str==null||pattern==null) return false;

        return func(str,0,pattern,0);
    }

    public boolean func(char[] str,int sindex,char[] pattern,int pindex){
        if(sindex==str.length&&pindex==pattern.length) return true;
        if(sindex!=str.length&&pindex==pattern.length) return false;

        //第二位为*情况
        if(pindex+1<pattern.length&&pattern[pindex+1]=='*'){
            if(sindex!=str.length&&(str[sindex]==pattern[pindex]||pattern[pindex]=='.')){
                return func(str,sindex+1,pattern,pindex+2)|| //匹配一个字符，*结束，继续匹配
                        func(str,sindex+1,pattern,pindex)|| //匹配一个字符，继续匹配
                        func(str,sindex,pattern,pindex+2); //*匹配0个字符，继续匹配

            }else {
                return func(str,sindex,pattern,pindex+2);//str匹配完，等待pattern结束
            }
        }
        //第二位不为*情况
        if(sindex!=str.length&&(str[sindex]==pattern[pindex]||pattern[pindex]=='.')){
            return func(str,sindex+1,pattern,pindex+1);
        }

        return false;
    }

}
