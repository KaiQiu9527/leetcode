package leetcode_1582;

import java.util.ArrayList;

/**
 * 给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 矩阵 mat 中特殊位置的数目 。
 *
 * 特殊位置 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 从 0 开始 ），则位置 (i, j) 被称为特殊位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/special-positions-in-a-binary-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;
        ArrayList<Integer> availableX = new ArrayList<>();
        ArrayList<Integer> availableY = new ArrayList<>();
        for (int x=0; x<mat.length; x++){
            for ( int y=0; y<mat[0].length; y++){
                if (mat[x][y] == 1){
                    if (doDFS(x,y,mat) == true)
                        result++;
                }
            }
        }
        return result;
    }

    boolean doDFS(int x, int y, int[][] mat){
        int numOfOne = 0;
        for (int i=0; i<x; i++){
            if (mat[i][y] == 1)
                numOfOne++;
        }
        for (int i=x+1; i<mat.length; i++){
            if (mat[i][y] == 1)
                numOfOne++;
        }
        for (int i=0; i<y; i++){
            if (mat[x][i] == 1)
                numOfOne++;
        }
        for (int i=y+1; i<mat[x].length; i++){
            if (mat[x][i] == 1)
                numOfOne++;
        }
        if (numOfOne == 0)
            return true;
        return false;
    }



    public static void main(String[] args) {
        int[][] testMat = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(new Solution().numSpecial(testMat));
    }
}
