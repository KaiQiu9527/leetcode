package leetcode_961;

import java.util.Arrays;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int repeatedNTimes(int[] A) {
        int[] allNums = new int[10000];
        for (int i : A){
            allNums[i]++;
            if (allNums[i] == A.length/2)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }
}
