package leetcode_118;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new LinkedList<>();
        List<Integer> tempList = new LinkedList<>();
        tempList.add(1);
        returnList.add(List.copyOf(tempList));
        tempList.add(1);
        returnList.add(List.copyOf(tempList));
        if (numRows<2)
            return returnList.subList(0,numRows+1);
        int nowRow = 2;
        while (nowRow<numRows){
            List<Integer> prevList = returnList.get(nowRow-1);
            List<Integer> nowList = new LinkedList<>();
            for (int i=0; i<nowRow; i++){
                if (i==0){
                    nowList.add(1);
                    continue;
                }
                nowList.add(prevList.get(i-1)+prevList.get(i));
            }
            nowList.add(1);
            returnList.add(nowList);
            nowRow++;
        }
        return returnList;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }
}
