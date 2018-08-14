package _1offer1._20_printMatrix;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix==null){
            return  null;
        }
        ArrayList<Integer> res = new ArrayList<>();
        int rowlen = matrix.length;
        int columnlen = matrix[0].length;
        int count = rowlen*columnlen;
        int row = 0;
        int column = 0;
        int up = 0; //0
        int down = rowlen-1; //2
        int left = 0; //1
        int right = columnlen-1; //3
        int flag = 0;
        while(count>=1){
            if(flag==0&&row==up&&column<=right){
                res.add(matrix[row][column]);
                count--;
                if (column==right){
                    row++;
                    up++;
                    flag =1;
                }else{
                    column++;
                }
            }
            if(flag==1&&column==right&&row<=down){
                res.add(matrix[row][column]);
                count--;
                if (row==down){
                    column--;
                    right--;
                    flag=2;
                }else{
                    row++;
                }
            }
            if(flag==2&&row==down&&column>=left){
                res.add(matrix[row][column]);
                count--;
                if (column==left){
                    row--;
                    down--;
                    flag=3;
                }else{
                    column--;
                }
            }
            if(flag==3&&column==left&&row>=up){
                res.add(matrix[row][column]);
                count--;
                if (row==up){
                    column++;
                    left++;
                    flag=0;
                }else{
                    row--;
                }
            }
        }
        return res;
    }
}