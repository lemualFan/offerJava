package _41_FindNumsAppearOnce;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.remove(array[i]);
            }else {
                hashMap.put(array[i],0);
            }
        }
        Iterator<Integer> it = hashMap.keySet().iterator();
        num1[0]=it.next();
        num2[0]=it.next();

    }
}
