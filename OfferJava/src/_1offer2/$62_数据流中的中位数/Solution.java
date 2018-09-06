package _1offer2.$62_数据流中的中位数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    ArrayList<Integer> list = new ArrayList<>();
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        int len = list.size();
        if(len%2==0){
            return (list.get(len/2)+list.get(len/2-1))/2.0;
        }else {
            return Double.valueOf(list.get(len/2));
        }
    }

}
