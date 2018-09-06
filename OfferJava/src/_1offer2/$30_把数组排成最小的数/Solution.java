package _1offer2.$30_把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private ArrayList<String> res = new ArrayList<>();

    public String PrintMinNumber(int [] numbers) {
        if(numbers==null||numbers.length==0) return "";
        int len = numbers.length;
        func(numbers,0);
        Collections.sort(res);

        return res.get(0);
    }

    public void func(int[] numbers,int index){
        if(index==numbers.length){
            String str = "";
            for(int num:numbers){
                str+=num;
            }
            res.add(str);
            return;
        }
        for(int i=index;i<numbers.length;i++){
            swap(numbers,i,index);
            func(numbers,index+1);
            swap(numbers,i,index);
        }
    }

    public void swap(int[] numbers,int i,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}