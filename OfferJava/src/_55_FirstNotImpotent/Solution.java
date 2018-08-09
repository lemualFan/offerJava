package _55_FirstNotImpotent;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Solution {

    StringBuilder sb = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        String str = sb.toString();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.remove(c);
            }else {
                map.put(c,1);
            }
        }
        if(map.isEmpty()){
            return '#';
        }else {
            return map.entrySet().iterator().next().getKey();
        }
    }
}
