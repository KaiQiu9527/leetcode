package leetcode_476;

import java.util.Stack;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 100 -> 1100100 -> 0011011 -> 27
 * 高效率思路： 用">>1"算出有多少位数n，然后得到n位数的"11...11"（方法：1<<n-1），然后与num进行异或操作
 */

public class Solution {
    public int findComplement(int num) {
        int bitNum = 0;
        int tempNum = num;
        while (tempNum!=0){
            bitNum++;
            tempNum >>= 1;
        }
        return num ^ ((1<<bitNum)-1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findComplement(4));
    }

}
