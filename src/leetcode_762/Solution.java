package leetcode_762;

/**
 * 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 *
 * （注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i<=R; i++){
            int num = Integer.bitCount(i);
            if (isPrime(num))
                result ++;
        }
        return result;
    }

    boolean isPrime(int a){
        return a == 2 | a == 3 | a == 5 | a == 7 | a == 11 | a == 13 | a == 17 | a == 19;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimeSetBits(6,10));
    }
}
