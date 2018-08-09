package _33_PrintMinNumber;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Solution {
    ArrayList<String> list = new ArrayList<>();
    public String PrintMinNumber(int [] numbers) {
        if (numbers.length<=0){
            return "";
        }
        permutations(numbers,0);
        Collections.sort(list);
        return list.get(0);

    }

    public void permutations(int [] numbers,int begin){
        if (begin==numbers.length-1){
            String str = "";
            for(int num:numbers){
                str+=num;
            }
            list.add(str);
            return;
        }
        for(int i = begin;i<numbers.length;i++){
            if(begin!=i){
                swap(numbers,begin,i);
            }
            permutations(numbers,begin+1);
            if(begin!=i){
                swap(numbers,begin,i);
            }
        }

    }

    public void swap(int[] numbers,int i,int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
