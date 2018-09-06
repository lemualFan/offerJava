package _1offer2.$31_丑数;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;

        int[] list = new int[index];
        list[0] = 1;
        int twoindex = 0;
        int threeindex =0;
        int fiveindex = 0;
        int next = 1;
        while (next<index){
            int min = Math.min(list[twoindex]*2,Math.min(list[threeindex]*3,list[fiveindex]*5));
            list[next] = min;
            while (list[twoindex]*2<=list[next]) twoindex++;
            while (list[threeindex]*3<=list[next]) threeindex++;
            while (list[fiveindex]*5<=list[next]) fiveindex++;
            next++;
        }

        return list[index-1];
    }
}
