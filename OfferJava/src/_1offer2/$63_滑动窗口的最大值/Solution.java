package _1offer2.$63_滑动窗口的最大值;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num==null||num.length==0) return null;
        int len = num.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(size==0) return res;

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int begin;
        for(int i =0;i<len;i++){
            begin = i-size+1;
            if(deque.isEmpty())
                deque.add(i);
            else if(begin>deque.peekFirst())
                deque.pollFirst();

            while ((!deque.isEmpty())&&num[deque.peekLast()]<=num[i]){
                deque.pollLast();
            }
            deque.add(i);
            if(begin>=0){
                res.add(num[deque.peekFirst()]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num ={2,3,4,2,6,2,5,1};
        System.out.println(solution.maxInWindows(num,3));
    }
}
