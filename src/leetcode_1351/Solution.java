package leetcode_1351;

/**
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 *
 * 请你统计并返回 grid 中 负数 的数目。
 */

public class Solution {
    public static int countNegatives(int[][] grid) {
        int num = 0;
        for (int i=0; i<grid.length; i++){
            for (int j=grid[i].length-1; j>=0; j--){
                if (grid[i][j] >= 0){
                    num += grid[i].length-j-1;
                    break;
                }
                if (j==0)
                    num+=grid[i].length;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int testNums [][] = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(testNums));
    }

}


//   0 1 2 3 4
//   1 1 -1 -1 -2
// j=1
