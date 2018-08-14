package _1offer1._28_Permutation;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Solution {
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        char[] clist = str.toCharArray();
        Permutation(clist,0);
        Collections.sort(list);
        return  list;
    }
    public void Permutation(char[] clist,int index){
        if(index == clist.length-1){
            String val = String.valueOf(clist);
            if(!list.contains(val)){
                list.add(String.valueOf(clist));
            }
        }else {
            for (int j = index;j<clist.length;j++){
                swap(clist,index,j);
                Permutation(clist,index+1);
                swap(clist,index,j);
            }
        }

    }

    public void swap(char[] clist,int i ,int j){
        char temp = clist[i];
        clist[i] = clist[j];
        clist[j] = temp;
    }
}
