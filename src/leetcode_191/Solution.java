package leetcode_191;

import java.util.Arrays;

/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 */

/**
 * 笔记
 * 二进制int为32位
 * 可以用mask与每一位进行与操作
 * 将 n 和 n−1 与运算总是能把 n 中最低位的 1 变成 0 ，并保持其他位不变。当 n & n-1 为0时，说明n已经没有1了
 */

public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for (int i=0; i<32; i++){
            if ((n & mask) != 0){
                result++;
            }
            mask <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int testNum = 00000000000000000000000000001011;
        Solution s = new Solution();
        System.out.println(s.hammingWeight(testNum));
    }
}
