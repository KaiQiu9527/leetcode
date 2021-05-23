package leetcode_1021;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

/**
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 *
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 *
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 *
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static String removeOuterParentheses(String S) {
        int index = 0, num =0;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<S.length(); i++){
            if (S.charAt(i) == '(')
                num++;
            else
                num--;
            if (num == 1 && S.charAt(i) == '(') //如果是通过-1达到num=1， 则该char为')'，不会是'('
                index = i;
            if (num == 0)
                sb.append(S.substring(index+1,i));
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String testString = "(()())(())";
        System.out.println(removeOuterParentheses(testString));
    }
}
