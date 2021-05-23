package leetcode_1051;

import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedArray = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sortedArray);
        int diff = 0;
        for (int i = 0; i<heights.length; i++){
            if (heights[i] != sortedArray[i])
                diff++;
        }
        return diff;
    }
}
