package 笔试.头条0909._2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.valueOf(sc.nextLine());
        String[] strlist = new  String[m];
        for(int i = 0;i<m;i++){
            strlist[i] = sc.nextLine();
        }
        int[][] list = new int[m][m];
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for(int i =0;i<m;i++){
            String[] temp = strlist[i].split(" ");
            for(int j=0;j<m;j++){
                list[i][j] = Integer.valueOf(temp[j]);
            }
        }

        int islandsNum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (list[i][j] != 0) {
                    dfs(list,direction, i, j,m);
                    islandsNum++;
                }
            }
        }
        System.out.println(islandsNum);

    }

    private  static void dfs(int[][] grid,int[][] direction, int i, int j,int m) {
        if (i < 0 || i >= m || j < 0 || j >= m || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        for (int[] d : direction) {
            dfs(grid, direction,i + d[0], j + d[1],m);
        }
    }

}
