package _1offer2.$64_矩阵中的路径;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix==null||str==null) return false;
        int len = matrix.length;
        boolean[] flag = new boolean[len];
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(helper(matrix,flag,rows,cols,str,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public boolean helper(char[] matrix,boolean[] flag,int rows,int cols,char[] str,int i,int j,int k){
        int index = i*cols+j;
        if(i>=rows||j>=cols||i<0||j<0||matrix[index]!=str[k]||flag[index]==true) return false;
        if(k==str.length-1)return true;
        flag[index] = true;
        if(helper(matrix,flag,rows,cols,str,i+1,j,k+1)||
           helper(matrix,flag,rows,cols,str,i-1,j,k+1)||
           helper(matrix,flag,rows,cols,str,i,j+1,k+1)||
           helper(matrix,flag,rows,cols,str,i,j-1,k+1)){
            return true;
        }
        flag[index] = false;
        return false;
    }
}
