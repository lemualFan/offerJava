package _1offer2.$25_字符串的排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//回溯法进行全排序  交换字符的位置

public class Solution {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str.length()==0||str==null) return res;
        char[] clist = str.toCharArray();
        helper(clist,0);
        Collections.sort(res);
        return res;
    }

    public  void helper(char[] clist,int index){
        if(index==clist.length-1){
            String val = String.valueOf(clist);
            if(!res.contains(val)){
                res.add(val);
            }
        }else{
            for(int i =index;i<clist.length;i++){
                swap(clist,index,i);
                helper(clist,index+1);
                swap(clist,index,i);
            }
        }
    }

    public void  swap(char[] clist,int i,int j){
        char temp = clist[i];
        clist[i] = clist[j];
        clist[j] = temp;
    }
}
