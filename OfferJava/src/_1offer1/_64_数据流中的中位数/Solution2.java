package _1offer1._64_数据流中的中位数;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {
    int count = 0;
    PriorityQueue<Integer> minhead = new PriorityQueue<>();
    PriorityQueue<Integer> maxhead = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    });

    public void Insert(Integer num) {
        if(count%2==0){
            maxhead.offer(num);
            int maxtemp = maxhead.poll();
            minhead.offer(maxtemp);
            count++;
        }else {
            minhead.offer(num);
            int mintemp = minhead.poll();
            maxhead.offer(mintemp);
            count++;
        }

    }
    public Double GetMedian() {
        double res = 0;
        Object o = new Object();
        if (count%2==0){
            res = (double)(minhead.peek()+maxhead.peek());
        }else {
            res = (double) minhead.peek();
        }
        return res;
    }
}
