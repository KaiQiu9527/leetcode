package leetcode_999;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 在一个 8 x 8 的棋盘上，有一个白色的车（Rook），用字符 'R' 表示。棋盘上还可能存在空方块，白色的象（Bishop）以及黑色的卒（pawn），分别用字符 '.'，'B' 和 'p' 表示。不难看出，大写字符表示的是白棋，小写字符表示的是黑棋。
 *
 * 车按国际象棋中的规则移动。东，西，南，北四个基本方向任选其一，然后一直向选定的方向移动，直到满足下列四个条件之一：
 *
 * 棋手选择主动停下来。
 * 棋子因到达棋盘的边缘而停下。
 * 棋子移动到某一方格来捕获位于该方格上敌方（黑色）的卒，停在该方格内。
 * 车不能进入/越过已经放有其他友方棋子（白色的象）的方格，停在友方棋子前。
 * 你现在可以控制车移动一次，请你统计有多少敌方的卒处于你的捕获范围内（即，可以被一步捕获的棋子数）。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/available-captures-for-rook
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int numRookCaptures(char[][] board) {
        int x=0 , y=0 , result=0;
        for (int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        //search up direction
        for (int i=x,j=y;j<8;j++){
            if (board[i][j] == 'B')
                break;
            if (board[i][j] == 'p') {
                result++;
                break;
            }
        }
        //search down direction
        for (int i=x,j=y;j>=0;j--){
            if (board[i][j] == 'B')
                break;
            if (board[i][j] == 'p') {
                result++;
                break;
            }
        }
        //search left direction
        for (int i=x,j=y;i>=0;i--){
            if (board[i][j] == 'B')
                break;
            if (board[i][j] == 'p') {
                result++;
                break;
            }
        }
        //search right direction
        for (int i=x,j=y;i<8;i++){
            if (board[i][j] == 'B')
                break;
            if (board[i][j] == 'p') {
                result++;
                break;
            }
        }

        return result;
    }
}
