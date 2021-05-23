package leetcode_1413;

/**
 * 给你一个整数数组 nums 。你可以选定任意的 正数 startValue 作为初始值。
 *
 * 你需要从左到右遍历 nums 数组，并将 startValue 依次累加上 nums 数组中的值。
 *
 * 请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 正数 作为 startValue 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int temp = 0;
        for (int i : nums){
            temp += i;
            if (temp < min)
                min = temp;
        }
        return 1-min;
    }

    public static void main(String[] args) {
        int[] testArray = {-3,2,-3,4,2};
        System.out.println(new Solution().minStartValue(testArray));
    }
}
