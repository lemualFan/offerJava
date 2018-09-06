package _1offer2.$32_第一个只出现一次的字符;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
                return  str.indexOf(entry.getKey());
            }
        }
        return 0;
    }
}
