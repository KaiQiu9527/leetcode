package leetcode_1394;

/**
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 *
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 *
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-lucky-integer-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        for (int i : arr){
            nums[i]++;
        }
        for (int i=nums.length-1; i>0; i--){
            if (nums[i] == i ) {
                return i;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,2,3,3,3};
        new Solution().findLucky(testArray);
    }
}
