package 笔试.Huawei;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            char[] clist = str.toCharArray();
            int len = clist.length;
            Arrays.sort(clist);
            HashMap<Character,Integer> map = new LinkedHashMap<>();
            for(char c:clist){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            while(len>0){
                for(Map.Entry<Character,Integer> entry:map.entrySet()){
                    if(entry.getValue()>=1){
                        System.out.print(entry.getKey());
                        map.put(entry.getKey(),entry.getValue()-1);
                        len--;
                    }
                }
            }
            System.out.println();
        }
    }

}
