package leetcode_lcp06;

/**
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * 向上取整Math.ceil, 向下取整Math.floor, 四舍五入Math.round，记得转化为double
 */

public class Solution {
    public static int minCount(int[] coins) {
        int result = 0;
        for (int i : coins){
            result += Math.ceil((double)i/2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testNums = {4,2,1};
        int result = minCount(testNums);
        System.out.println(result);
    }
}
