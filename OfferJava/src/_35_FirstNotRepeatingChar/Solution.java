package _35_FirstNotRepeatingChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int len = str.length();
        if(len==0){
            return -1;
        }
        char[] list = str.toCharArray();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<len;i++){
            char c = list[i];
            if(map.containsKey(c)){
                map.put(c,-1);
            }else{
                map.put(c,i);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=-1){
                return entry.getValue();
            }
        }
        return 0;
    }
}
