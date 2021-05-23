package leetcode_942;

import java.util.Arrays;

/**
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 *
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 *
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 解题来自他人，思路是设置max和min，逢D则取max然后max--，反之亦然，最后剩下max和min应该相等，任取一个插入到最后即可
 */

public class Solution {
    public int[] diStringMatch(String S) {
        int sLen = S.length();
        int[] arr = new int[sLen + 1];
        int max = sLen;
        int min = 0;
        for(int i = 0 ; i < sLen; i++) {
            if('D' == S.charAt(i)) {
                arr[i] = max--;
            } else {
                arr[i] = min++;
            }
        }
        arr[sLen] = max;
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String testString = "DDDDI";
        System.out.println(s.diStringMatch(testString));
    }
}
