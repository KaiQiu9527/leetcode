package leetcode_766;

/**
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 *
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 *
 * 输入:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * 输出: True
 * 解释:
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是True。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/toeplitz-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int x = matrix.length - 1;
        int y = 1;
        while (y<matrix[0].length){
            int value = matrix[x][y];
            for (int i=x-1,j=y-1; i>=0 && j>=0;i--,j--){
                if (matrix[i][j] != value)
                    return false;
            }
            y++;
        }
        x = matrix.length - 2; //1
        y = matrix[0].length-1; //3
        while (x>=0){
            int value = matrix[x][y];
            for (int i=x-1,j=y-1; i>=0 && j>=0;i--,j--){
                if (matrix[i][j] != value)
                    return false;
            }
            x--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2},{1,2}};
        System.out.println(new Solution().isToeplitzMatrix(matrix));
    }
}
