package leetcode_908;

import java.util.Arrays;

/**
 * 给你一个整数数组 A，请你给数组中的每个元素 A[i] 都加上一个任意数字 x （-K <= x <= K），从而得到一个新数组 B 。
 *
 * 返回数组 B 的最大值和最小值之间可能存在的最小差值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：A = [1], K = 0
 * 输出：0
 * 解释：B = [1]
 * 示例 2：
 *
 * 输入：A = [0,10], K = 2
 * 输出：6
 * 解释：B = [2,8]
 * 示例 3：
 *
 * 输入：A = [1,3,6], K = 3
 * 输出：0
 * 解释：B = [3,3,3] 或 B = [4,4,4]
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-range-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解析：算最大值与最小值之差是否大于2K，大于则差为最大最小值之差减2K，否则为0
 */

public class Solution {
    public int smallestRangeI(int[] A, int K) {
        if (A.length<2)
            return 0;
        int max=A[0],min=A[0];
        for (int i: A){
            if (i>max)
                max=i;
            if (i<min)
                min=i;
        }
        System.out.println(max + "-" +min);
        return (max-min)>2*K ? (max-min)-2*K : 0;
    }
}
