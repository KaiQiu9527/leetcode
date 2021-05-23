package leetcode_1221;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int balancedStringSplit(String s) {
        int L=0,R=0,sum=0;
        for (char c : s.toCharArray()){
            if (c == 'L')
                L++;
            else
                R++;
            if (L==R){
                sum++;
                L=0;
                R=0;
            }
        }
        return sum;
    }
}
