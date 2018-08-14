package _1offer1._34_GetUglyNumber_Solution;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index == 0){
            return 0;
        }
        int[] list = new int[index];
        list[0] = 1;
        int nextIndex = 1;
        int multiTwo = 0;
        int multiThree = 0;
        int multiFive = 0;
        while(nextIndex<index){
            int min = Math.min(list[multiTwo]*2,Math.min(list[multiThree]*3,list[multiFive]*5));
            list[nextIndex] = min;
            while (list[multiTwo]*2<=list[nextIndex])
                multiTwo++;
            while (list[multiThree]*3<=list[nextIndex])
                multiThree++;
            while (list[multiFive]*5<=list[nextIndex])
                multiFive++;

            nextIndex++;
        }
        return list[index-1];
    }
}