package _1offer2.$65_机器人的移动范围;

public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        if(threshold<=0||rows<=0||cols<=0) return 0;
        boolean[] flag = new boolean[rows*cols];
        return helper(flag,threshold,rows,cols,0,0);
    }

    public int helper(boolean[] flag,int threshold, int rows, int cols,int i,int j ){
        int index = i*cols+j;
        if(i<0||j<0||i>=rows||j>=cols||flag[index]==true) return 0;
        flag[index] = true;
        if(canIn(threshold,i,j)){
            return  1+helper(flag,threshold,rows,cols,i-1,j)
                    +helper(flag,threshold,rows,cols,i+1,j)
                    +helper(flag,threshold,rows,cols,i,j-1)
                    +helper(flag,threshold,rows,cols,i,j+1);
        }
        flag[index] = false;
        return 0;
    }

    public boolean canIn(int t,int i,int j){
        int count = 0;
        while (i!=0){
            count+=i%10;
            i/=10;
        }
        while (j!=0){
            count+=j%10;
            j/=10;
        }
        if(count<=t)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(5,20,20));
    }

}
