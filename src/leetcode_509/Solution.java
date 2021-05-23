package leetcode_509;

import javax.management.MBeanAttributeInfo;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 给定 N，计算 F(N)。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int fib(int N) {
        int[] fibNums = new int[31];
        fibNums[0] = 0;
        fibNums[1] = 1;
        for (int i=2; i<31; i++){
            fibNums[i] = fibNums[i-1] + fibNums[i-2];
        }
        return fibNums[N];
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(new Solution().fib(num));
    }
}
