package _1offer2.$8_跳台阶;

public class Solution {
    public int JumpFloor(int target) {
        return helper(1,target,0)+helper(2,target,0);
    }
    public int helper(int num,int target,int current){
        if ((current+num)==target) return 1;
        else if((current+num)<target) return helper(1,target,current+num)+helper(2,target,current+num);
        else return 0;
    }
}
