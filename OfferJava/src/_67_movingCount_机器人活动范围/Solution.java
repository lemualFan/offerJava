package _67_movingCount_机器人活动范围;
/*
地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

错误分析：使用矩阵flag表示标志位，把rows 与cols控制的方向弄错。
避免措施：使用flag[rows*cols]取代矩阵，简化问题
 */
public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        int count = 0;
        int[][] flag = new int[cols][rows];
        count+=helper(threshold,rows,cols,0,0,flag);
        return count;
    }

    public int helper(int k,int rows,int cols,int x,int y,int[][] flag){
        int count = 0;
        if(x<0||x>=cols||y>=rows||y<0) return 0;
        if (!isRight(x,y,k)||flag[x][y]==1) return 0;
        count++;
        flag[x][y]=1;
        count+=helper(k,rows,cols,x+1,y,flag)+helper(k,rows,cols,x-1,y,flag)+helper(k,rows,cols,x,y+1,flag)+helper(k,rows,cols,x,y-1,flag);
        return count;
    }

    public boolean isRight(int x,int y,int threshold){
        int count = 0;
        while (x>0){
            count+=x%10;
            x=x/10;
        }
        while (y>0){
            count+=y%10;
            y=y/10;
        }
        if(count<=threshold) return true;
        return false;
    }
}
