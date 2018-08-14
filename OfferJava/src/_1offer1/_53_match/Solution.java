package _1offer1._53_match;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */

public class Solution {
    public boolean match(char[] str, char[] pattern){
        if(str==null||pattern==null) return false;
        int sindex=0;
        int pindex=0;
        return  matchCore(str,sindex,pattern,pindex);
    }

    public boolean matchCore(char[] str,int sindex,char[] pattern,int pindex){
        if(str.length==sindex&&pattern.length==pindex) return true;
        //pattern 先到尾，匹配失败
        if (sindex!=str.length&&pindex==pattern.length) return false;
        //模式第二个是*，且字符串第一个跟模式第一个匹配，分三种模式，如不匹配，模式后移两位
        if (pindex+1<pattern.length && pattern[pindex+1]=='*'){
            if((sindex!=str.length&&pattern[pindex]==str[sindex])||(pattern[pindex]=='.' && sindex!=str.length)){
                return matchCore(str,sindex,pattern,pindex+2) //模型后移2位，视为*匹配0字符
                || matchCore(str,sindex+1,pattern,pindex+2) //匹配一个字符
                || matchCore(str,sindex+1,pattern,pindex); //匹配一个，继续匹配
            }else {
                return matchCore(str,sindex,pattern,pindex+2);
            }
        }
        //模式第二个不是*，且字符串第一个个模式第一个匹配，则都后移一位，否则直接返回false
        if((sindex!=str.length && pattern[pindex]==str[sindex])|| (pattern[pindex]=='.' && sindex!=str.length)){
            return  matchCore(str,sindex+1,pattern,pindex+1);
        }
        return false;
    }
}
