package leetcode_1323;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 *
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *
 * 请返回你可以得到的最大数字。
 */

public class Solution {
    public static int maximum69Number (int num) {
        char[] nums = String.valueOf(num).toCharArray();
        for (int i=0; i<nums.length; i++){
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(nums));
    }

    public static void main(String[] args) {
        int num = 9699;
        System.out.println(maximum69Number(num));
    }

}
