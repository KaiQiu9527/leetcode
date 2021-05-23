package leetcode_1380;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 *
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> horMin = new LinkedList<>();
        List<Integer> verMax = new LinkedList<>();
        List<Integer> returnList = new LinkedList<>();

        for (int i=0; i<matrix.length; i++){
            int min = matrix[i][0];
            for (int j=1; j<matrix[0].length; j++){
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
            horMin.add(min);
        }

        for (int j=0; j<matrix[0].length; j++){
            int max = matrix[0][j];
            for (int i = 0; i<matrix.length; i++){
                if (matrix[i][j]>max)
                    max = matrix[i][j];
            }
            verMax.add(max);
        }

        for (int i : horMin){
            if (verMax.contains(i))
                returnList.add(i);
        }


        return returnList;
    }

    public static void main(String[] args) {
        int[][] testMatrix = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        Solution s = new Solution();
        List<Integer> returnList = s.luckyNumbers(testMatrix);
        for (int i : returnList){
            System.out.println(i);
        }
    }
}
