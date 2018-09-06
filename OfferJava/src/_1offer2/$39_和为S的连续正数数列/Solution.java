package _1offer2.$39_和为S的连续正数数列;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(sum<=0) return res;
        for(int i = 1;i<sum/2+1;i++){
            for(int j = i;(i+j)*(j-i+1)/2<=sum;j++){
                if((i+j)*(j-i+1)/2==sum){
                    ArrayList<Integer> temp = new ArrayList<>();
                    for(int h=i;h<=j;h++){
                        temp.add(h);
                    }
                    res.add(temp);
                }
            }
        }
        return res;
    }
}
